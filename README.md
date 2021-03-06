# <p align="center"> Cinema app</p>


# General info:
A simple web-application that supports authentication, registration and CRUD operations with different entities. You can check movie sessions, cinema halls, buy tickets, add new movies, 
add order to shopping cart etc.
The application uses Spring, Hibernate and is built on SOLID and REST principles. The user can have the `user` role or the `admin` role.

# About project:
The application has the ability to:
- view lists of cinema halls, movies, orders, movie sessions for a movie on a date
- find movie session by id, shopping cart by user, user by email
- add movie, movie session, cinema hall, order, movie session to shopping cart
- change movie session by id
- delete movie session </br>


# There are two types of roles in the application: `admin` and `user`(during registration, the user is assigned a role `user`):
- POST: /register - all
- GET: /cinema-halls - user/admin
- POST: /cinema-halls - admin
- GET: /movies - user/admin
- POST: /movies - admin
- GET: /movie-sessions/available - user/admin
- POST: /movie-sessions - admin
- PUT: /movie-sessions/{id} - admin
- DELETE: /movie-sessions/{id} - admin
- GET: /orders - user
- POST: /orders/complete - user
- PUT: /shopping-carts/movie-sessions - user
- GET: /shopping-carts/by-user - user
- GET: /users/by-email - admin

# Technologies used:
- Java 11
- Hibernate
- Spring Framework
- REST
- MySQL
- Apache Tomcat 9.0.54 (to run app locally)

# If you want to run this project, you need:
1. To have or install MySQL and Apache Tomcat 9.0.50
2. Install and configure and create a schema in MySQL
3. Clone this project:
```bash
https://github.com/ZeroNeiron/cinema-app.git
```
4. Configure `db.properties` file from `main.resources` directory to create connection to db:
```java
    db.driver=com.mysql.cj.jdbc.Driver
    db.url=URL
    db.user=LOGIN
    db.password=PASSWORD
```
5. Add Tomcat configuration to your project. Use `/` as your Tomcat application context

After all these steps you will be able to run this project locally.

Then you can log in with :

`USER`:
```java
username - user@gmail.com
password - qwerty
```
`ADMIN`:
```java
username - admin@admin.admin
password - admin
```