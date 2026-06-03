# Spring MVC Form Binding Project

## Overview

This project demonstrates Form Binding in Spring MVC using Spring Boot and JSP. User details entered through a registration form are automatically mapped to a Java Bean (POJO) using Spring MVC's form binding mechanism.

## Features

* User Registration Form
* Spring MVC Controller
* Form Binding using Java Bean
* JSP-based View Pages
* Automatic Data Mapping from Form to Object
* MVC Architecture

## Technologies Used

* Java 21
* Spring Boot
* Spring MVC
* JSP
* Apache Tomcat
* Maven
* Spring Tool Suite (STS)

## Project Structure

```
src/main/java
│
├── SpringBootProjectApplication.java
├── TestController.java
└── UserData.java

src/main/webapp
│
├── register.jsp
├── hello.jsp
└── Success.jsp
```

## Form Fields

The registration form collects:

* Username
* Email
* Phone Number
* Password

## Form Binding

The form data is automatically bound to the `UserData` class.

```java
public class UserData {
    private String username;
    private String email;
    private String phone;
    private String pwd;
}
```

Spring MVC automatically populates the object based on matching form field names and bean properties.

## Request Flow

1. User opens Registration Page.
2. User enters details and submits the form.
3. Spring MVC receives the request.
4. Form data is bound to the `UserData` object.
5. Controller processes the data.
6. Success page is displayed.

## Learning Outcomes

* Understanding Spring MVC Architecture
* Request Mapping
* Form Binding
* Controller Handling
* JSP Integration with Spring Boot
* Maven Dependency Management

## Future Enhancements

* Form Validation
* Database Integration using MySQL
* Hibernate/JPA Support
* Login Module
* CRUD Operations

## Author

Ritesh Singh
MCA Student | Java & Spring Boot Developer
