# E-Notes Spring Boot Project

## 📌 Project Overview
E-Notes is a **Spring Boot-based** note-taking application that allows users to create, edit, and manage their notes efficiently. The project is designed as a **mini-project** using modern web development technologies with a **RESTful API** backend.

## 🚀 Tech Stack
- **Backend:** Spring Boot 3.2.2, Spring Data JPA, Hibernate
- **Database:** MySQL (or PostgreSQL)
- **Authentication:** Spring Security, JWT (optional)
- **Frontend:** Can be integrated with React.js, Angular, or any other framework
- **Build Tool:** Maven
- **Java Version:** 22

## 📂 Project Structure
```
Enotes_Spring_Boot_Project/
├── src/main/java/com/enotes/
│   ├── controller/    # REST API controllers
│   ├── service/       # Business logic services
│   ├── repository/    # Data access layer
│   ├── model/         # Entity models
│   ├── config/        # Security and app configurations
│   ├── EnotesApplication.java # Main Spring Boot application
├── src/main/resources/
│   ├── application.properties # Configuration settings
├── pom.xml  # Maven dependencies and configurations
├── README.md # Project documentation
```

## 🔧 Setup & Installation
### 1. Clone the Repository
```bash
git clone https://github.com/Ranganatha-codingaddict/Enotes-Spring-Boot-Project.git
cd Enotes-Spring-Boot-Project
```

### 2. Configure the Database
Update `src/main/resources/application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/enotes_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build & Run the Application
```bash
mvn clean install
mvn spring-boot:run
```

## 📌 API Endpoints
| HTTP Method | Endpoint        | Description          |
|------------|---------------|----------------------|
| `POST`     | `/auth/signup` | Register a new user |
| `POST`     | `/auth/login`  | User login (JWT)    |
| `GET`      | `/notes`       | Fetch all notes     |
| `POST`     | `/notes`       | Create a new note   |
| `PUT`      | `/notes/{id}`  | Update a note       |
| `DELETE`   | `/notes/{id}`  | Delete a note       |

## 🎯 Features
- 📝 **Create, Read, Update, Delete (CRUD) Notes**
- 🔒 **Secure API with JWT Authentication**
- 📚 **Spring Data JPA for database management**
- 🌍 **RESTful API for frontend integration**

## 📜 License
This project is licensed under the **MIT License**.

## 🤝 Contributing
Feel free to fork the repository, create a new branch, and submit a pull request!

---
🚀 **Happy Coding!** 😊

