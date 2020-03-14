# Spring-boot
JAVA: End to End Project using Spring Boot 


# Install Spring Tool Suite from Eclipse Marketplace

# Steps to create Spring MVC Project : Student Management system
# Steps:
1. Create new sprinf starter project
2. Update artifact id and name and group id
3. Select Dependencies : Web (Spring MVC Project), JPA, SQL (Sql driver)
4. Structure with dependencies is ready

# Start Coding:

   # create a database and create table : MySQL Workbench
   # Create Model Class // Data Access Layer
   1.  JPa annotated Class : Class Name is same to Table name and Class variables are same to Table Columns
   2.  CRUD Repository Class 
   3. application.properties : 
        1. update the DATA SOURCE URL : jdbc and localhost and database name
        2. mention the username and password and show-sql = true
  
   
   # create a service Layer
   1. new package: service
   2. create an interface of service and add all crud operations
   3. implement the interface in the class
   4. Implement all the methods of the interface:
      
   

# Queries on console : (to check if everything running fine)
#Update
1. Hibernate: update studenttab set scourse=?, sname=?, sfee=? where id=?
#delete
2.delete from studenttab where id=?



# #################################################### #
# Trouble-shooting issues: :
1. Problem: 
java.sql.SQLSyntaxErrorException: Table 'newdb.hibernate_sequence' doesn't exist 
Solution:
Add below statement in application.properties
spring.jpa.hibernate.use-new-id-generator-mappings=false

2. Problem: 
# studentRepository.findById returns Optional :
- so call get() method: otherwise it will ask to change Student to Optional student
Student s = studentRepository.findById(1l).get();
