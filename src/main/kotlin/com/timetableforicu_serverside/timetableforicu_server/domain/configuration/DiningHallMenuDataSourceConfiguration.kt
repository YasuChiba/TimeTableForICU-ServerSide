package com.timetableforicu_serverside.timetableforicu_server.domain.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource

/*
@Configuration
@EnableJpaRepositories(
        basePackages = arrayOf("com.timetableforicu_serverside.timetableforicu_server.domain.repository.diningHallMenu"),
        entityManagerFactoryRef = "secondaryEntityManager",
        transactionManagerRef = "secondaryTransactionManager")
open class DiningHallMenuDataSourceConfiguration{

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dininghall-menu")
    open fun secondaryProperties(): DataSourceProperties {
        return DataSourceProperties()
    }

    @Bean
    @Autowired
    open fun secondaryDataSource(@Qualifier("secondaryProperties") properties: DataSourceProperties): DataSource {
        return properties.initializeDataSourceBuilder().build()
    }

    @Bean
    @Autowired
    open fun secondaryEntityManager(builder: EntityManagerFactoryBuilder, @Qualifier("secondaryDataSource") dataSource: DataSource): LocalContainerEntityManagerFactoryBean {
        return builder.dataSource(dataSource)
                .packages("com.timetableforicu_serverside.timetableforicu_server.domain.model.diningHallMenu")
                .persistenceUnit("secondary")
                .build()
    }

    @Bean
    @Autowired
    open fun secondaryTransactionManager(@Qualifier("secondaryEntityManager") secondaryEntityManager: EntityManagerFactory): JpaTransactionManager {
        return JpaTransactionManager(secondaryEntityManager)
    }
}
        */