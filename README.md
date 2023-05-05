# Getting Started

### Folder Structure
The project consists of two main parts:
  - **server**: Java SpringBoot application
  - **client**: React application
---

### Automated Setup

For quick start, run the following command:

```shell
docker compose up --build
```

After all three containers fire up, just visit ```localhost:3000``` in your browser.
This will take you to the React application. 
All containers have the ports exposed and mapped, so they can be interracted with using PGAdmin or other third parties. 

---
### Manual Setup
Alternatively, the java SpringBoot application can be found at ```server/src/main/java/plates/backend/CustomPlatesApplication.java```

1) It can be run using the following command in the root directory:

```shell
mvn clean install
mvn exec::java
```
Note that I am implementing OpenAPI Swagger documentation, so further API enpoints can be accessed at 
```http://localhost:8080/swagger-ui/index.html#/```

2) For the frontend, navigate to ```client``` and run the following commands:

```shell
npm install
npm start
```
The React application will be running at ```localhost:3000```

3) A Postgres database should also be running on port 5432. This can be done using the following environment variables,
in order for SpringBootto be able to connect to it ( although this can be configured by the user):
```
   POSTGRES_USER: postgres
   POSTGRES_PASSWORD: admin
   POSTGRES_DB: customPlates
```
---
