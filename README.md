# Spring-boot
JAVA: End to End Project using Spring Boot 


#Trouble-shooting issues:

1. Problem: 
java.sql.SQLSyntaxErrorException: Table 'newdb.hibernate_sequence' doesn't exist 
Solution:
Add below statement in application.properties
spring.jpa.hibernate.use-new-id-generator-mappings=false
