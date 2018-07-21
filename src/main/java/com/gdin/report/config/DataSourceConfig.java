package com.gdin.report.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = DataSourceConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class DataSourceConfig {

	// 精确到 master 目录，以便跟其他数据源隔离
	static final String PACKAGE = "com.gdin.report.dao";
	static final String MAPPER_LOCATION = "classpath:/mapper/*.xml";

	@Value("${spring.datasource.db1.url}")
	private String url;

	@Value("${spring.datasource.db1.username}")
	private String user;

	@Value("${spring.datasource.db1.password}")
	private String password;

	@Value("${spring.datasource.db1.driverClassName}")
	private String driverClass;

	@Value("${spring.datasource.db1.initialSize}")
	private int initialSize;

	@Value("${spring.datasource.db1.minIdle}")
	private int minIdle;

	@Value("${spring.datasource.db1.maxActive}")
	private int maxActive;

	@Value("${spring.datasource.db1.maxWait}")
	private int maxWait;

	@Value("${spring.datasource.db1.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${spring.datasource.db1.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Value("${spring.datasource.db1.validationQuery}")
	private String validationQuery;

	@Value("${spring.datasource.db1.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${spring.datasource.db1.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${spring.datasource.db1.testOnReturn}")
	private boolean testOnReturn;

	@Value("${spring.datasource.db1.poolPreparedStatements}")
	private boolean poolPreparedStatements;
	@Value("${spring.datasource.db1.connectionErrorRetryAttempts}")
	private int connectionErrorRetryAttempts;


	@Bean(name = "masterDataSource")
	@Primary
	public DataSource masterDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);

		dataSource.setInitialSize(initialSize);
		dataSource.setMinIdle(minIdle);
		dataSource.setMaxActive(maxActive);
		dataSource.setMaxWait(maxWait);
		dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		dataSource.setValidationQuery(validationQuery);
		dataSource.setTestWhileIdle(testWhileIdle);
		dataSource.setTestOnBorrow(testOnBorrow);
		dataSource.setTestOnReturn(testOnReturn);
		dataSource.setPoolPreparedStatements(poolPreparedStatements);
		dataSource.setConnectionErrorRetryAttempts(connectionErrorRetryAttempts);

		return dataSource;
	}

	@Bean(name = "masterTransactionManager")
	@Primary
	public DataSourceTransactionManager masterTransactionManager() {
		return new DataSourceTransactionManager(masterDataSource());
	}

	@Bean(name = "masterSqlSessionFactory")
	@Primary
	public SqlSessionFactory masterSqlSessionFactory(@Qualifier("masterDataSource") DataSource masterDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(masterDataSource);
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources(DataSourceConfig.MAPPER_LOCATION));
		return sessionFactory.getObject();
	}
}
