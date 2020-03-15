# Spring-boot
JAVA: End to End Project using Spring Boot 


Install Spring Tool Suite from Eclipse Marketplace

# Steps to create Spring Boot Project : Student Management system
Steps:
1. Create new sprinf starter project
2. Update artifact id and name and group id
3. Select Dependencies : Web, JPA, SQL (Sql driver)
(Added Embedd tomcat jasper dependency )
4. Structure with dependencies is ready

Start Coding:

   create a database and create table : MySQL Workbench
   Create Model Class // Data Access Layer
   1.  JPa annotated Class : Class Name is same to Table name and Class variables are same to Table Columns
   2.  CRUD Repository Class 
   3. application.properties : 
        1. update the DATA SOURCE URL : jdbc and localhost and database name
        2. mention the username and password and show-sql = true
  
   
   create a service Layer
   1. new package: service
   2. create an interface of service and add all crud operations
   3. implement the interface in the class
   4. Implement all the methods of the interface:
      
   create a presentation Layer
   1. Add @componentScan(#all the packages) : it will scann all packages
   2. Controller.java : 1. @Controller 2. Add @RequestMapping : to response against the uri
      3. return jsp names as strings : call crud opeartions using the service
   3. Create a jsp page with respect to the return strings
   4. add suffix and prefix : suffix: WEB-INF/view and prefix : .jsp (it will open the added in location views)
   5. jsp --> controller --> service --> crud repo/jpa repo --> DB // @RequestParams or @ModelAttribute
   6. DB -> CRUD REPO --> Service --> controller --> jsp //Model Map - the model map will help to display anything on UI
   7. Perform CRUD
   8. add href - to link to new pages
   8. Use jstl : to use forEach in jsp
   
   
   use of utility classes
   1. create a util package and add class and interface
   
   
Queries on console : (to check if everything running fine)
#Update
1. Hibernate: update studenttab set scourse=?, sname=?, sfee=? where id=?
#delete
2.delete from studenttab where id=?



# #################################################### #
Trouble-shooting issues: :
1. Problem: 
java.sql.SQLSyntaxErrorException: Table 'newdb.hibernate_sequence' doesn't exist 
Solution:
Add below statement in application.properties
spring.jpa.hibernate.use-new-id-generator-mappings=false

2. Problem: 
studentRepository.findById returns Optional :
- so call get() method: otherwise it will ask to change Student to Optional student
Student s = studentRepository.findById(1l).get();

3. Problem: 
The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true)
Solution: Make sure @Service , @Controller : all the annotations are present, so that for bean
