# 🏦 Sugarfit Java Service Starter Template

## Overview
This project is a production-ready Spring Boot service starter template designed to serve as a foundation for building future backend microservices.

---

## ⚡ 1. How to Run

### Prerequisites
- Java 17
- Maven
- Docker (optional)

---

### Run Locally (Without Docker)
```bash
mvn clean package
java -jar target/*.jar 
The service will start on: http://localhost:8080
```

### Run Using Docker
```bash
make docker-build
make docker-run
```

### Verify the Service
### Health Check
```bash
GET http://localhost:8080/health
```
✅ You should see
```
Response 
{
  "status": "UP"
}
```
### Example Data Processor
```bash
POST http://localhost:8080/example
Request 
{
  "userId": "123",
  "value": 42
}
```
✅ You should see
```
Response
{
    "status": "SUCCESS",
    "requestId": "57fa357f-3f0e-48b9-b394-8f2ce7f41fb2"
}
```
##  📂 2. Design Decisions
### Layered Architecture
- The service follows a Controller → Service → DTO layered architecture.

- Controllers handle HTTP and validation concerns

- Services contain business logic

- DTOs define API contracts

- Global exception handling ensures consistent responses

- This structure improves readability, testability, and team scalability.

### Validation at Boundaries
- Request validation is handled at the API boundary using @Valid, ensuring invalid data is rejected early.

### Centralized Exception Handling
- A global exception handler ensures predictable error responses and prevents internal details from leaking to clients.

## 🧰 3. Assumptions & Trade-offs

- No database integration to keep the scope focused

- Authentication and authorization are out of scope

- Logging uses Spring Boot defaults

- Requests are processed synchronously

- These choices were made to respect time constraints while maintaining production standards.

## 🔧 4. Future Roadmap

- If this were a long-term service, the following improvements would be added:

  - Request tracing (correlation IDs)

  - Metrics and monitoring

  - Authentication and authorization

  - Database integration

  - CI/CD pipelines

  - Kubernetes deployment

## 📚 5.Flow Chart
```
Client
  |
  | HTTP Request
  v
Controller Layer
  |
  | Validation
  v
Service Layer
  |
  | Business Logic
  v
Response DTO
  |
  | JSON Response
  v
Client
'''

