## Task 4: Submit Source Code and README (10 Marks)

### 📂 Project Directory Overview

```
iDiet/
├── domain/                 # Entity classes
├── repository/             # Repository interfaces (Assignment 11)
├── service/                # Business logic layer
├── controller/             # REST API layer (Assignment 12)
└── Application.java        # Spring Boot entry point
```

### 📄 README.md Content (Sample)

````markdown
# iDiet System - RESTful API

## 📌 Description
This API powers the iDiet system, enabling user registration, meal plan management, order placement, subscriptions, and support ticketing.

## 🚀 Technologies Used
- Java 17
- Spring Boot
- Maven
- RESTful APIs

## 📁 Project Structure
- `domain/` - Contains core entities (User, MealPlan, Order, etc.)
- `repository/` - JPA Repositories for persistence
- `service/` - Business logic layer with validations
- `controller/` - API endpoints

## 🔧 Running the Project
```bash
./mvnw spring-boot:run
````

## 🌐 API Endpoints

### User

* `POST /api/users/register` - Register new user
* `GET /api/users/{id}` - Get user by ID

### MealPlan

* `POST /api/mealplans` - Create a meal plan

### Order

* `POST /api/orders` - Place order
* `PUT /api/orders/{id}/cancel` - Cancel order

### Subscription

* `POST /api/subscriptions` - Activate subscription
* `PUT /api/subscriptions/{id}/cancel` - Cancel subscription

### Support Ticket

* `POST /api/support-tickets` - Submit ticket
* `PUT /api/support-tickets/{id}/resolve` - Resolve ticket

## ✅ Status

MVP endpoints complete. Next sprint will focus on user authentication and diet recommendations.

```

---
These tasks confirm the API is production-ready and well-documented, with endpoints tied directly to earlier project phases.

```
