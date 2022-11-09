package com.insp.cloudtest;

import com.insp.cloudtest.util.sevice.impl.BaseRepositoryFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@SpringBootApplication()
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EntityScan(basePackages = {"com.insp.cloudtest.entity"})
@MapperScan(basePackages = "com.insp.cloudtest.dao")
@EnableJpaRepositories(repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
public class CloudTestApplication extends SpringBootServletInitializer {

    /**
     * 主方法启动
     * @param args 字符串数组
     */
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(CloudTestApplication.class);
        SpringApplication.run(CloudTestApplication.class, args);
        logger.info("启动成功");
    }

}
