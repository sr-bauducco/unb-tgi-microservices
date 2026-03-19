# UNB-OsGi-Microservices 

This project represents the migration of a legacy OSGi-based system to a modern microservices architecture, following the patterns established by Magnus Larsson in *Microservices with Spring Boot 3*.

## Tech Stack
* **Java:** 17 (OpenJDK)
* **Framework:** Spring Boot 3.5.0
* **Build Tool:** Gradle 8.5
* **OS:** Ubuntu 24.04 LTS
* **Architecture:** Microservices with shared API/Util modules

## Project Structure
* `:api` - Shared Data Transfer Objects (DTOs) and Service Interfaces.
* `:util` - Shared utilities (HTTP handling, exceptions).
* `:microservices:product-service` - Core service for product management.
* `:microservices:review-service` - Core service for reviews.
* `:microservices:recommendation-service` - Core service for recommendations.
* `:microservices:product-composite-service` - Orchestrator service.

##  How to Build
From the root directory, run:
\`\`\`bash
gradle build -x test
\`\`\`

##  How to Run
To start the Product Service:
\`\`\`bash
gradle :microservices:product-service:bootRun
\`\`\`