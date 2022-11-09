package com.insp.cloudtest.util.sevice;

import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;


/**
* class: BaseRepository
* description: sql执行仓库
* @author: 刘猛
* create: 2019/7/1 11:00
* Created by IntelliJ IDEA.
**/
@NoRepositoryBean
@Transactional(readOnly = true,rollbackFor = Exception.class)
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>, QuerydslPredicateExecutor<T>, QuerydslBinderCustomizer<EntityPath<T>> {
    /**
     * 创建jpaQuery
     * @param predicate 条件
     *
     */
//    JPQLQuery<?> createJpaQuery(Predicate... predicate);

    /**
     * 保存
     * @param entities 实体类
     * @param <S> 对象类型
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    <S extends T> List<S> save(Iterable<S> entities);

    /**
     * 保存
     * @param entity 实体类
     * @param <S> 对象类型
     * @return 保存对象
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Override
    <S extends T> S saveAndFlush(S entity);

    /**
     * 通过id集合删除
     * @param entities 集合
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Override
    void deleteInBatch(Iterable<T> entities);

    /**
     * 删除所有
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Override
    void deleteAllInBatch();

    /**
     * 保存
     * @param entity 实体类
     * @param <S> 对象类型
     * @return 保存对象
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Override
    <S extends T> S save(S entity);

    /**
     * 通过id删除
     * @param id 主键
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    void delete(ID id);


    /**
     * 通过对象删除
     * @param entity 实体类
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Override
    void delete(T entity);

    /**
     * 通过对象集合删除
     * @param entities 集合
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    void delete(Iterable<? extends T> entities);

    /**
     * 删除所有
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Override
    void deleteAll();

    /**
     * 通过姓名查询方法重写
     * @param bindings
     * @param root
     */
    @Override
    default void customize(QuerydslBindings bindings, EntityPath<T> root) {
        bindings.bind(String.class).first(new SingleValueBinding<StringPath, String>() {
            /**
             * Returns the predicate to be applied to the given {@link Path} for the given value. The given value will be the first
             * the first one provided for the given path and converted into the expected type.
             *
             * @param path  {@link Path} to the property. Will not be {@literal null}.
             * @param value the value that should be bound. Will not be {@literal null}.
             * @return can be {@literal null}, in which case the binding will not be incorporated in the overall {@link Predicate}.
             */
            @Override
            public Predicate bind(StringPath path, String value) {
                //log.error(String.format("bindString:path( %s )= %s", path, value));
                if (value.startsWith("%") || value.endsWith("%")) {
                    if (!value.replace("%", "").isEmpty()) {
                        return path.like(value);
                    }
                    else {
                        return null;
                    }
                } else {
                    return path.eq(value);
                }
            }

        });
    }

    /**
     * 通过id的集合查询所有
     * @param ids id集合
     * @return 对象列表
     */
    List<T> findAll(Iterable<ID> ids);

    /**
     * 单个查询
     * @param id 主键
     * @return 查询对象
     */
    T findOne(ID id);

    /**
     * 是否存在
     * @param id 主键
     * @return 判断结果
     */
    boolean exists(ID id);
}
