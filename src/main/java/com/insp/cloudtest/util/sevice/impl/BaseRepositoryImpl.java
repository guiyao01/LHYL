package com.insp.cloudtest.util.sevice.impl;

import com.insp.cloudtest.util.sevice.BaseRepository;
import com.querydsl.core.types.EntityPath;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.querydsl.EntityPathResolver;
import org.springframework.data.querydsl.SimpleEntityPathResolver;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

/**
 * Created by itanhao on 2016-01-27.
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends QuerydslJpaRepository<T, ID> implements BaseRepository<T, ID> {


    /**
     * Creates a new {@link QuerydslJpaRepository} from the given domain class and {@link EntityManager}. This will use
     * the {@link SimpleEntityPathResolver} to translate the given domain class into an {@link EntityPath}.
     *
     * @param entityInformation must not be {@literal null}.
     * @param entityManager     must not be {@literal null}.
     */
    public BaseRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    /**
     * Creates a new {@link QuerydslJpaRepository} from the given domain class and {@link EntityManager} and uses the
     * given {@link EntityPathResolver} to translate the domain class into an {@link EntityPath}.
     *
     * @param entityInformation must not be {@literal null}.
     * @param entityManager     must not be {@literal null}.
     * @param resolver          must not be {@literal null}.
     */
    public BaseRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager, EntityPathResolver resolver) {
        super(entityInformation, entityManager, resolver);
    }

//    @Override
//    public JPQLQuery<?> createJpaQuery(Predicate... predicate) {
//         return  super.createQuery(predicate);
//
//     }

    @Transactional
    @Override
    public <S extends T> List<S> save(Iterable<S> entities) {
        return super.saveAll(entities);
    }

    @Override
    public void deleteInBatch(Iterable<T> entities) {

    }

    /**
     * Deletes the entity with the given id.
     *
     * @param id must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    @Transactional
    @Override
    public void delete(ID id) {
        super.deleteById(id);
    }

    /**
     * Deletes the given entities.
     *
     * @param entities
     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
     */
    @Transactional
    @Override
    public void delete(Iterable<? extends T> entities) {
        super.deleteAll(entities);
    }

    @Override
    public void customize(QuerydslBindings bindings, EntityPath<T> root) {
        BaseRepository.super.customize(bindings, root);
    }

    @Override
    public List<T> findAll(Iterable<ID> ids) {
        return super.findAllById(ids);
    }

    @Override
    public T findOne(ID id) {
        return super.findById(id).orElse(null);
    }

    @Override
    public boolean exists(ID id) {
        return super.existsById(id);
    }


}
