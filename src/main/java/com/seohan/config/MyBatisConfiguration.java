//package com.seohan.config;
//import java.sql.DriverManager;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//@MapperScan(basePackages = { "com.seohan.erp.general.Mapper" })
//@EnableTransactionManagement
//class MyBatisConfiguration {
//
//	@Autowired
//	private ApplicationContext applicationContext;
//
//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix = "spring.datasource.hikari")
//	public DataSource mainDataSource() {
//		HikariConfig config = new HikariConfig();
//		config.setDataSourceClassName("org.apache.commons.dbcp.BasicDataSource");
//		// config.setDriverClassName("com.ibm.as400.access.AS400JDBCDriver");
//
//		return DataSourceBuilder.create().type(HikariDataSource.class).build();
//	}
//
//	// @Qualifier("mainDataSource")
//	@Bean
//	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
//		transactionManager.setGlobalRollbackOnParticipationFailure(false);
//		return transactionManager;
//	}
//
//	@Bean
//	// @ConfigurationProperties(prefix = "mybatis")
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:mybatis/**/*.xml"));
//		return sqlSessionFactoryBean.getObject();
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//}
