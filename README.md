# sample-java-spring-genericdao
This a sample sample using Spring 4.1 MVC, Core, Security, Generic DAO over Hibernate 4. The objective is to show a secured MVC application using Spring integrated with Hibernate and abstracting the DAO layer with Generic DAO framework.


Tips before running:

- import projects as existing Maven (you must update the projects twice because of parent)
- the database file (DemoDB.rar) was create using derby 10.11.1
- extract the database rar file in /tmp/ (if you want another folder, change the database.properties file).
- if you want to run in Tomcat with Apache Embedded Derby Database (by default is this database) check in <TOMCAT>\lib folder if the database driver is 10.11 or more recent
