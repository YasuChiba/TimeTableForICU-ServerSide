package com.timetableforicu_serverside.timetableforicu_server.domain.configuration


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource


@Configuration
@EnableJpaRepositories(
        basePackages = arrayOf("com.timetableforicu_serverside.timetableforicu_server.domain.repository.noClassInfo"),
        entityManagerFactoryRef = "noClassInfoEntityManager",
        transactionManagerRef = "noClassInfoTransactionManager")
open class NoClassInfoDataSourceConfiguration{

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.no-class-info")
    open fun noClassInfoProperties(): DataSourceProperties {
        return DataSourceProperties()
    }

    @Bean
    @Primary
    @Autowired
    open fun noClassInfoDataSource(@Qualifier("noClassInfoProperties") properties: DataSourceProperties): DataSource {
        return properties.initializeDataSourceBuilder().build()
    }

    @Bean
    @Primary
    @Autowired
    open fun noClassInfoEntityManager(builder: EntityManagerFactoryBuilder, @Qualifier("noClassInfoDataSource") dataSource: DataSource): LocalContainerEntityManagerFactoryBean {
        return builder.dataSource(dataSource)
                .packages("com.timetableforicu_serverside.timetableforicu_server.domain.model.noClassInfo")
                .persistenceUnit("noClassInfo")
                .build()
    }

    @Bean
    @Primary
    @Autowired
    open fun noClassInfoTransactionManager(@Qualifier("noClassInfoEntityManager")  noClassInfoEntityManager: EntityManagerFactory): JpaTransactionManager {
        return JpaTransactionManager(noClassInfoEntityManager)
    }
}