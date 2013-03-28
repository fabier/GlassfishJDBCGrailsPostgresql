dataSource {
    pooled = true
    driverClassName = "org.postgresql.Driver"
    dialect = "org.hibernate.dialect.PostgreSQLDialect"
//    logSql = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop"
            url = "jdbc:postgresql://localhost:5432/sample"
            username = "sample"
            password = "sample"
        }
    }
    test {
        dataSource {
            dbCreate = "create-drop"
            jndiName = "jdbc/sample"
        }
    }
    production {
        dataSource {
            dbCreate = "create-drop"
            jndiName = "jdbc/sample"
        }
    }
}
