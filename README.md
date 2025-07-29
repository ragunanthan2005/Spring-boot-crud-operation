# Spring-boot-crud-operation

# 🧩 Spring Boot CRUD REST API - Employee Management

A simple **Spring Boot** application demonstrating a **CRUD REST API** to manage employees using best practices like layered architecture and DTOs. It is structured for clean code, modularity, and scalability — ideal for beginners learning Spring Boot and RESTful services.

---

## 📦 Features

- ➕ Create new employee
- 📋 List all employees
- 🔍 Get employee by ID
- ✏️ Update existing employee
- ❌ Delete employee by ID
- 📐 Uses **DTO pattern** to separate entity from exposed data
- 🧩 Layered architecture: `Controller → Service → Repository`
- 🧪 Easily testable and extensible

---

## ⚙️ Technologies Used

| Technology     | Description                  |
|----------------|------------------------------|
| Java 17        | Core language                |
| Spring Boot    | Application framework        |
| Spring Data JPA| ORM and database abstraction |
| Maven          | Build tool                   |
| H2 / MySQL     | Database options             |
| Git & GitHub   | Version control              |
| IntelliJ IDEA  | IDE (Community Edition)      |

---

## 🗂️ Project Structure

src/main/java/com/example/Crud
├── controller/ # Handles HTTP requests
│ └── EmployeeController.java
├── service/ # Business logic
│ └── EmployeeServiceImpl.java
├── repository/ # Data access layer
│ └── EmployeeRepository.java
├── model/ # Entity and DTO
│ ├── Employee.java
│ └── EmployeeDTO.java
└── CrudApplication.java

src/main/resources/
├── application.properties
└── static/ and templates/ (if needed)


---

## 🚀 Getting Started

### 📥 1. Clone the Repository

```bash
git clone https://github.com/ragunanthan2005/Spring-boot-crud-operation.git
cd Spring-boot-crud-operation
