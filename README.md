# microservice-tutorial
Developing and deploying microservices loclaly using spring cloud, spring boot, eureka
Multi maven module, JDK 17, Spring boot, Eureka, spring boot JPA, Postgres, Docker, Lombok

Demonstration of how multiple microservices interact with each other using the principles of https://12factor.net/

**How to Run?**
1. Run docker compose up -d
2. Run CustomerApplication main method
3. Run FraudApplication main method
4. Run EurekaServerApplication main method
5. Navigate to  http://localhost:5050/browser/ for postgres UI using pgadmin
6. open Eureka web console http://localhost:8761/ and verify services are up and running
7. Use postman to send a post request and expect respone 200 Ok http://localhost:8080/api/v1/customers
