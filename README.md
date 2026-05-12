# PreownedTest - Spring Boot Backend Project

PreownedTest is a Spring Boot backend application built using Java 17 and Spring Boot 3.3.1.  
The project includes:

- JWT Authentication & Authorization
- PostgreSQL Database Integration
- Razorpay Payment Gateway
- Stripe Payment Gateway
- Email Service using Gmail SMTP
- Validation & Security
- ModelMapper & MapStruct
- Gemini AI API Integration

---

# Technologies Used

- Java 17
- Spring Boot 3.3.1
- Spring Security
- Spring Data JPA
- PostgreSQL
- JWT
- Razorpay
- Stripe
- Lombok
- MapStruct
- ModelMapper
- Maven

---

# Project Structure

```bash
src/main/java
│
├── controller
├── service
├── repository
├── entity
├── dto
├── config
├── security
└── util

Prerequisites

Before running the project, install:

Java 17+
Maven
PostgreSQL


Database Configuration

Update the application.properties file:
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password



Maven Dependencies Included
spring-boot-starter-web
spring-boot-starter-data-jpa
spring-boot-starter-security
spring-boot-starter-validation
spring-boot-starter-mail
postgresql
jjwt
razorpay-java
stripe-java
lombok
mapstruct
modelmapper


Features
Authentication
JWT Token Based Authentication
Spring Security Integration
Database
PostgreSQL Integration
Hibernate ORM
Payment Integration
Razorpay Payment Gateway
Stripe Payment Gateway
Email Service
SMTP Email Support
AI Support
Gemini AI API Integration
