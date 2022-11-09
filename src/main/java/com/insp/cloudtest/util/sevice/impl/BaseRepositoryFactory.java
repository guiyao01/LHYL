package com.insp.cloudtest.util.sevice.impl;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.RepositoryMetadata;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Created by itanhao on 2016-01-27.
 */

class BaseRepositoryFactory<T, I extends Serializable> extends JpaRepositoryFactory {

    private EntityManager entityManager;


    public BaseRepositoryFactory(EntityManager entityManager) {
        super(entityManager);
        this.entityManager = entityManager;
    }


    @Override
    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {

        // The RepositoryMetadata can be safely ignored, it is used by the JpaRepositoryFactory
        //to check for QueryDslJpaRepository's which is out of scope.
        return BaseRepositoryImpl.class;
    }
}
