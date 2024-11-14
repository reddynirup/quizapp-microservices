# Quiz Application Microservices

This project is a microservices-based quiz application implemented using Spring Boot and Spring Cloud. It includes four primary services: an API Gateway, a Service Registry, a Question Service, and a Quiz Service, designed to provide a scalable and maintainable solution for managing and delivering quizzes.

## Project Structure

1. **API Gateway**
   - **Location:** `api-gateway` module
   - **Description:** Acts as a single entry point to the application, managing client requests and routing them to the appropriate services.
   - **Technologies:** Spring Cloud Gateway, Eureka Client

2. **Service Registry**
   - **Location:** `service-registry` module
   - **Description:** Manages service discovery, enabling services to locate each other in a dynamic environment.
   - **Technologies:** Eureka Server

3. **Question Service**
   - **Location:** `question-service` module
   - **Description:** Handles all operations related to questions, including adding, retrieving, and managing quiz questions.
   - **Endpoints:**
     - `/question/allQuestions` - Retrieve all questions
     - `/question/category/{category}` - Retrieve questions by category
     - `/question/add` - Add a new question
     - `/question/generate` - Generate a set of questions for a quiz
     - `/question/getScore` - Calculate quiz score
   - **Technologies:** Spring Boot, Spring Data JPA, MySQL, Eureka Client

4. **Quiz Service**
   - **Location:** `quiz-service` module
   - **Description:** Manages quizzes, including quiz creation, question retrieval, and scoring.
   - **Endpoints:**
     - `/quiz/create` - Create a new quiz with specified parameters
     - `/quiz/get/{id}` - Retrieve quiz questions by quiz ID
     - `/quiz/submit/{id}` - Submit quiz answers and calculate score
   - **Technologies:** Spring Boot, Spring Data JPA, MySQL, Feign Client, Eureka Client

## Getting Started

### Prerequisites

- Java 21+
- MySQL Database
- Maven


### Running the Application

1. **Database Setup**
   - Create two MySQL databases named `questiondb` and `quizdb`.
   - Update the database configurations (username, password, URL) in `application.properties` for `question-service` and `quiz-service`.

2. **Run the Services**
   - Start the Service Registry (`service-registry`).
   - Start the API Gateway (`api-gateway`).
   - Start the Question Service (`question-service`).
   - Start the Quiz Service (`quiz-service`).

## Technologies Used

- **Spring Boot** - Framework for building microservices.
- **Spring Cloud** - Integrates with Netflix Eureka for service discovery and API Gateway.
- **Spring Data JPA** - ORM framework for database operations.
- **MySQL** - Relational database management system.
- **Feign Client** - HTTP client for service-to-service calls.
- **Lombok** - Reduces boilerplate code with annotations.
  
## Future Enhancements

- Implement user authentication and authorization.
- AI-Powered Question Generation
- Enable analytics for quiz results.


