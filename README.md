# Healthcare Management System

A backend-only **Healthcare Management System** built with **Java** and **Spring Boot**, providing secure, role-based REST APIs for managing patients, doctors, appointments, departments, and insurance records.

## Features

- **Authentication & Authorization**
  - Email/password signup and login with JWT-based session handling
  - OAuth2 social login support (Google, GitHub, Twitter)
  - Role-based access control (RBAC) for `ADMIN`, `DOCTOR`, and `PATIENT` roles
  - Fine-grained permissions (e.g. `patient:read`, `appointment:write`, `user:manage`, `report:view`)
- **Patient Management** — patient profiles, blood group, insurance details, and appointment history
- **Doctor Management** — doctor onboarding (admin-only), specializations, and department assignments
- **Appointments** — patients can book appointments with doctors; doctors can view their scheduled appointments
- **Departments** — doctors grouped under hospital departments, each with a head doctor
- **Insurance** — insurance policy tracking linked to patient records
- **Public endpoints** — browse the list of available doctors without authentication
- **Centralized error handling** via a global exception handler with structured API error responses

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot (Web, Data JPA, Security, OAuth2 Client) |
| Database | PostgreSQL |
| Auth | JWT ([jjwt](https://github.com/jwtk/jjwt)) + OAuth2 (Google, GitHub, Twitter) |
| ORM | Hibernate / Spring Data JPA |
| Object Mapping | ModelMapper |
| Build Tool | Maven |
| Boilerplate Reduction | Lombok |

## Project Structure

```
src/main/java/com/example/Pratham/HealthManage
├── config/            # Application-level configuration (bean setup, etc.)
├── controller/         # REST controllers (Admin, Auth, Doctor, Hospital, Patient)
├── dto/                 # Request/response DTOs
├── entity/              # JPA entities (Patient, Doctor, Appointment, Insurance, Department, User)
│   └── type/             # Enums (RoleType, PermissionType, AuthProviderType, BloodGroupType)
├── error/               # Global exception handling and API error format
├── repository/          # Spring Data JPA repositories
├── security/            # JWT filter, auth service, OAuth2 success handler, security config
└── service/              # Business logic layer
```

## API Overview

All endpoints are served under the base path `/api/v1`.

| Method | Endpoint | Access | Description |
|---|---|---|---|
| POST | `/auth/signup` | Public | Register a new user |
| POST | `/auth/login` | Public | Authenticate and receive a JWT |
| GET | `/public/doctors` | Public | List all doctors |
| GET | `/admin/patients` | Admin | List all patients |
| POST | `/admin/onBoardNewDoctor` | Admin | Onboard a new doctor |
| GET | `/doctors/appointments` | Doctor | View the logged-in doctor's appointments |
| GET | `/doctors/profile` | Patient | View the logged-in patient's profile |
| POST | `/doctors/appointments` | Patient | Book a new appointment |

## Getting Started

### Prerequisites

- Java 21+
- Maven (or use the included `mvnw` wrapper)
- PostgreSQL

### Configuration

Update `src/main/resources/app.properties` with your database credentials and a JWT secret:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/<your_database_name>
spring.datasource.username=<your_database_username>
spring.datasource.password=<your_database_password>

jwt.secretKey=<your_jwt_secret_key>
```

If you plan to use social login, fill in the OAuth2 client credentials for Google, GitHub, and/or Twitter in `src/main/resources/app.yml`.

### Run the application

```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080/api/v1`.

### Run tests

```bash
./mvnw test
```

## License

No license has been specified for this project yet.
