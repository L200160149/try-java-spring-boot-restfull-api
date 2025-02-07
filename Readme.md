# Development Step

1. Genereate project from https://start.spring.io
    - Tech
        - Maven
        - Lang: Java 21
        - Spring Boot 3.5.0 (M1)
        - Dependencies:
            - Spring Web
            - Spring Data JPA
            - MySQL Driver
            - Validation
            - Lombok
2. Create database and table
    - database.sql
    - /src/main/resources/application.properties
3. Create APIs Docs
    - docs/user.md
    - docs/contact.md
    - docs/address.md
4. Create Entity
    - src/main/java/dewaning/try_spring_restful_api/entity/
        - User.java
        - Contact.java
        - Address.java
5. Create Model
    - src/main/java/dewaning/try_spring_restful_api/model/*
6. Create Repository
    - src/main/java/dewaning/try_spring_restful_api/repository/*
7. Create Exception
    - src/main/java/dewaning/try_spring_restful_api/exception/
        - ApiException.java
8. Create Service
    - src/main/java/dewaning/try_spring_restful_api/service/*
9. Install Security
    - install BCrypt:
        - https://github.com/spring-projects/spring-security/blob/main/crypto/src/main/java/org/springframework/security/crypto/bcrypt/BCrypt.java
10. Create Controller
    - src/main/java/dewaning/try_spring_restful_api/controller/*
11. Create Test
    - src/test/java/dewaning/try_spring_restful_api/controller/*
12. Create Resolver
    - src/test/java/dewaning/try_spring_restful_api/resolver/
        - UserArgumentResolver
13. Create Web Configuration
    - src/test/java/dewaning/try_spring_restful_api/WebConfiguration.java

---
Run App:
mvn spring-boot:run