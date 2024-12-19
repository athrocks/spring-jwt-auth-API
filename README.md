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

## Future Planned Features

Here are some planned enhancements for this project:
1. **Role-Based Authorization**:
   - Implement `@PreAuthorize` or similar mechanisms to restrict access based on roles (e.g., Admin, User, Student).
   - Add role-based endpoints for managing sensitive operations.
2. **Refresh Tokens**:
   - Add support for refresh tokens to allow seamless JWT renewal.
3. **Pagination for Student List**:
   - Implement pagination for the `/students` endpoint to handle large datasets efficiently.
4. **Improved Error Handling**:
   - Introduce global exception handling for better API responses.
5. **Dockerization**:
   - Create a `Dockerfile` to containerize the application for easy deployment.
6. **Front-End Integration**:
   - Build a front-end client using React or Angular for interacting with the API.
7. **API Documentation**:
   - Use Swagger/OpenAPI for comprehensive API documentation.

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


