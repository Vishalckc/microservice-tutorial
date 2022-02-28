# microservice-tutorial
Developing and deploying microservices loclaly using spring cloud, spring boot, eureka
Multi maven module, JDK 17, Spring boot, Eureka, spring boot JPA, Postgres, Docker, Lombok

Read more on microservices design: The twelve-factor app is a methodology for building software-as-a-service apps https://12factor.net/

**How to Run?**
1. Run docker compose up -d
2. Run CustomerApplication main method
3. Run FraudApplication main method
4. Run EurekaServerApplication main method
5. Navigate to  http://localhost:5050/browser/ for postgres UI using pgadmin
6. open Eureka web console http://localhost:8761/ and verify services are up and running
<img width="1272" alt="Screenshot 2022-02-28 at 12 41 03" src="https://user-images.githubusercontent.com/17704966/155986460-c9c34f28-d755-401b-9bfc-dffd4b5844d6.png">

7. Use postman to send a post request and expect respone 200 Ok http://localhost:8080/api/v1/customers
    
    {
    "firstName": "Jamila",
    "lastName": "Hadid",
    "email":"Jamila@gmail.com"
    }
<img width="926" alt="Screenshot 2022-02-28 at 12 42 01" src="https://user-images.githubusercontent.com/17704966/155986339-42211515-ce61-49b6-b735-544e099ec667.png">
