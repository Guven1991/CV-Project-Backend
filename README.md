#Spring Boot CV Project

## Technologies Used

### Java 11
### spring boot 2.6.6
### Maven
### Mysql
### Lombok
### MockitoJUnit
### DozerBeanMapper
### Hibernate
### OpenApi Swagger : http://localhost:8080/swagger-ui/index.html

###Endpoints

####Sign-Up
...
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 76

{
"name":"user1",
"username": "user1",
"password": "user1"
}
...

####Sign-In
...
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 53

{
"username": "user",
"password": "user"
}
...

#### Make-admin
...
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
...

#### Get-All-CV
...
GET /api/cv HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... ADMIN
...


#### Save-Cv
...
POST /api/cv HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...USER and ADMIN
Content-Type: application/json
Content-Length: 268

{
"name":"Test CV2",
"lastname":"Test CV Lastname2",
"phone":"5055553223.2",
"email":"ayvazoglu.bla@gmail.com2",
"education":"Lisans2",
"workExperience": 3,
"professionalSkills":"Java, Spring boot, PostgreSQL, Heroku and OOP vs.2"
}
...

#### Getting CV with id
...
GET /api/cv/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... ADMIN
...