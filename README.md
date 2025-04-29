# bank-service-multi-connector
Implement a Micro-service with Spring Boot with the 03 layers:
- Data Access Layer: with Spring Data JPA.
- Business Layer.
- Web Layer with the following APIs:
  
    1- REST API.
  
    2- SOAP API.
  
    3- GraphQL API.
  
    4- gRPC API.

We will take the same model that we implemented in workshop https://github.com/abbouformations/bank-service-graphql.git  in which we used GraphQL. As a reminder, the web service offers the following services:
- Consult the list of bank customers.
- Consult a customer by their identity number.
- Consult the list of bank accounts.
- Consult a bank account by its RIB.
- Make transfers from one account to another account.

  ![image](https://github.com/abbouformations/bank-service-graphql/assets/135717843/d65afbd0-4b65-4445-b01e-1e8fde02e123)

