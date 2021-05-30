
# Introduction
In this Hibernate H2 database tutorial, you will learn how to create a Hibernate Application to connect the H2 in-memory database.

Hibernate is an object-relational mapping framework for the Java language. It provides a framework for mapping an object-oriented domain model to a relational database. Object-relational mapping (ORM) is a programming technique for converting data between incompatible type systems in object-oriented programming languages.


## H2 Database Overview
H2 is an open-source lightweight Java database. It can be embedded in Java applications or run in the client-server mode.

Mainly, the H2 database can be configured to run as an in-memory database, which means that data will not persist on the disk. Because of an embedded database, it is not used for production development but mostly used for development and testing.

This database can be used in embedded mode or in server mode. Following are the main features of the H2 database -

- Extremely fast, open-source, JDBC API
- Available in embedded and server modes, in-memory databases
- Browser-based Console application
- Small footprint - Around 1.5MB jar file size


## Output


	Number of records to add : 
	2
	
	Record no. 1
	Enter firstname: 
	Avinash
	Enter lastname: 
	Tingre
	Enter email: 
	tingre.avinash@gmail.com
	Nov 08, 2020 2:50:39 PM org.hibernate.Version logVersion
	INFO: HHH000412: Hibernate Core {5.3.7.Final}
	Nov 08, 2020 2:50:39 PM org.hibernate.cfg.Environment <clinit>
	INFO: HHH000206: hibernate.properties not found
	Nov 08, 2020 2:50:40 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
	INFO: HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
	Nov 08, 2020 2:50:40 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
	WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
	Nov 08, 2020 2:50:40 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001005: using driver [org.h2.Driver] at URL [jdbc:h2:mem:test]
	Nov 08, 2020 2:50:40 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001001: Connection properties: {password=****, user=sa}
	Nov 08, 2020 2:50:40 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001003: Autocommit mode: false
	Nov 08, 2020 2:50:40 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
	INFO: HHH000115: Hibernate connection pool size: 1 (min=1)
	Nov 08, 2020 2:50:40 PM org.hibernate.dialect.Dialect <init>
	INFO: HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
	Nov 08, 2020 2:50:41 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
	INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@51d719bc] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
	--> Added new student record !
	
	Record no. 2
	Enter firstname: 
	Shantanu
	Enter lastname: 
	Dixit
	Enter email: 
	shan.dixit@gmail.com
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
	WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001005: using driver [org.h2.Driver] at URL [jdbc:h2:mem:test]
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001001: Connection properties: {password=****, user=sa}
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001003: Autocommit mode: false
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
	INFO: HHH000115: Hibernate connection pool size: 1 (min=1)
	Nov 08, 2020 2:50:57 PM org.hibernate.dialect.Dialect <init>
	INFO: HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
	Nov 08, 2020 2:50:57 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
	INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@1015a4b9] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
	--> Added new student record !
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
	WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001005: using driver [org.h2.Driver] at URL [jdbc:h2:mem:test]
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001001: Connection properties: {password=****, user=sa}
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
	INFO: HHH10001003: Autocommit mode: false
	Nov 08, 2020 2:50:57 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
	INFO: HHH000115: Hibernate connection pool size: 1 (min=1)
	Nov 08, 2020 2:50:57 PM org.hibernate.dialect.Dialect <init>
	INFO: HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
	Nov 08, 2020 2:50:57 PM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
	INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@65a9ea3c] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
	Nov 08, 2020 2:50:57 PM org.hibernate.hql.internal.QueryTranslatorFactoryInitiator initiateService
	INFO: HHH000397: Using ASTQueryTranslatorFactory
	--> Total students in database: 2
	ID: 1,	Name: Avinash,	Lastname: Tingre,	Email: tingre.avinash@gmail.com
	ID: 2,	Name: Shantanu,	Lastname: Dixit,	Email: shan.dixit@gmail.com


> Reference: https://www.javaguides.net/2019/11/hibernate-h2-database-example-tutorial.html


