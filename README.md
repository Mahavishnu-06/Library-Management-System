# Library Management System

## Overview
A RESTful Library Management System built using Spring Boot and Spring Data JPA. The application provides APIs to manage books with CRUD operations and search/filter functionality.

## Features
- Add a new book
- View all books
- View a book by ID
- Update book details
- Delete a book
- Search books by category
- Search books by author
- Filter books by price
- Find books published after a given year

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /books | Get all books |
| GET | /books/{id} | Get book by ID |
| POST | /books | Add a book |
| PUT | /books/{id} | Update a book |
| DELETE | /books/{id} | Delete a book |
| GET | /books/category?category=Fiction | Get books by category |
| GET | /books/author/{authorname} | Get books by author |
| GET | /books/price?max=500 | Get books below a price |
| GET | /books/year?year=2020 | Get books published after a year |
| GET | /books/filter?category=Java&price=500 | Filter by category and price |

## Future Improvements
- JWT Authentication
- Validation
- Exception Handling
- Pagination & Sorting
- Swagger API Documentation
- Borrow & Return Books