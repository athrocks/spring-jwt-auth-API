# Spring Boot API with JWT Authentication and MySQL

## Overview
This is a Spring Boot backend project implementing secure API authentication using **JWT (JSON Web Tokens)** and **Bcrypt** for password hashing. The project connects to a MySQL database and provides basic user registration, login, and CRUD operations for `Student` resources.

---

## Features
- **JWT-based Authentication**:
  - Secure login endpoint for token generation.
  - Token validation and stateless session management.
- **Password Hashing**:
  - Secure password storage using Bcrypt.
- **CSRF Protection**:
  - CSRF token endpoint for additional security.

---

## Technologies Used
- **Spring Boot**: Backend framework
- **Spring Security**: Authentication & Authorization
- **JWT (JSON Web Tokens)**: Token-based authentication
- **Bcrypt**: Secure password hashing
- **MySQL**: Relational database
- **Hibernate/JPA**: ORM for database operations

---

## API Endpoints
| HTTP Method | Endpoint                | Description                                     |
|-------------|-------------------------|-------------------------------------------------|
| `GET`       | `/`                     | Welcome message with session ID.               |
| `GET`       | `/students`             | Returns a list of all students.                |
| `POST`      | `/students`             | Adds a new student to the list.                |
| `GET`       | `/csrf-token`           | Returns a CSRF token.                          |
| `POST`      | `/register`             | Registers a new user.                          |
| `POST`      | `/login`                | Authenticates the user and returns a JWT token.|

---

## Setup Instructions

### Prerequisites
- Java 21+
- Maven 3.8+
- MySQL Database
- IDE (e.g., IntelliJ IDEA)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/athrocks/spring-jwt-auth-API.git
   cd spring-jwt-auth-API
   ```
   
2. Configure the database:  
Update the application.properties file:  
  ```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  ```

3. Build the project:  

  ```bash
  ./mvnw clean install
  ```

4. Run the project:

  ```bash
  ./mvnw spring-boot:run
  ```

5. Access the API at http://localhost:8080.

---

### Database Schema

  ```sql
  CREATE TABLE users(
  	id integer primary key,
      username varchar(50),
      password varchar(50)
  );
  ```

---

### How to Test the API

Use Postman or cURL to test endpoints.


