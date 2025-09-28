# E-Commerce Project (Spring Boot + H2 Database)

## Project Overview

This is a **Spring Boot REST API** for managing products in an e-commerce system. It supports **CRUD operations**, **image upload/retrieval**, and **product search** functionality using **Spring MVC**, **Spring Data JPA**, and **H2 in-memory database**.

## Features

* Create, Read, Update, Delete (CRUD) operations for products
* Upload and retrieve product images
* Search products by name, description, brand, or category
* In-memory H2 database for testing
* Clean architecture with Controller → Service → Repository → Database

## Technology Stack

* Java 17+ / Spring Boot
* Spring MVC (REST Controllers)
* Spring Data JPA
* H2 Database
* Lombok
* Maven/Gradle

## Getting Started

### Prerequisites

* Java JDK 17+
* Maven/Gradle
* IDE (IntelliJ, Eclipse, VS Code)

### Clone the Repository

```bash
git clone https://github.com/<your-username>/ecom-proj.git
cd ecom-proj
```

### Run the Application

```bash
mvn spring-boot:run
```

* The application will run on **[http://localhost:8080](http://localhost:8080)**

### H2 Database Console

* Access via: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:ecomdb`
* User: `sa`
* Password: (leave blank)

## API Endpoints

| Method | Endpoint                         | Description                              |
| ------ | -------------------------------- | ---------------------------------------- |
| GET    | /api/products                    | Get all products                         |
| GET    | /api/product/{id}                | Get product by ID                        |
| POST   | /api/product                     | Add a new product (form-data with image) |
| PUT    | /api/product/{id}                | Update product details and image         |
| DELETE | /api/product/{id}                | Delete product by ID                     |
| GET    | /api/products/search?keyword=xyz | Search products by keyword               |
| GET    | /api/product/{productId}/image   | Retrieve product image                   |

### Request Examples

**Add Product (Form-Data in Postman)**

* Key: `product` → JSON { "name": "Laptop", "brand": "Dell", "price": 75000, "category": "Electronics", "available": true }
* Key: `imageFile` → Upload image file

**Search Product**

```http
GET /api/products/search?keyword=dell
```

## Annotations & Concepts

* `@RestController`, `@Service`, `@Repository`, `@Entity`
* `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
* `@RequestPart` for form-data, `@RequestBody` for JSON
* `ResponseEntity` to wrap response with status code

## Flow of a Request

1. Client (React/Angular/Postman) → sends request to `/api/...`
2. Controller → receives request, delegates to Service
3. Service → handles logic (process image, validate product)
4. Repository (JPA) → interacts with H2 database
5. Response wrapped in ResponseEntity → sent back to client

## Configuration (application.properties)

```properties
spring.application.name=ecom-proj
spring.datasource.url=jdbc:h2:mem:ecomdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.defer-datasource-initialization=true
```

## License

This project is licensed under the MIT License.
