# Litix

A fantasy football management and analysis platform powered by Spring Boot and Google Vertex AI (Gemini).

## Features

- **User Authentication** — Registration, login, and session management via Spring Security
- **Player Database** — Store and browse NFL/fantasy player data and statistics
- **AI Trade Advisor** — Gemini 2.5 Flash-powered recommendations for trades, waivers, and lineup decisions
- **Custom ML model** - Uses custom built and trained model for player point prediction, Gemini AI uses ML model to explain predictions to user
- **Trade Calculator** — Evaluate trade values and get data-driven analysis
- **Team Manager** — Manage your fantasy roster in one place

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java 21, Spring Boot 3.5 |
| Database | PostgreSQL |
| Frontend | Thymeleaf, AngularJS |
| AI | Google Vertex AI (Gemini 2.5 Flash) |
| Cloud | Google Cloud Platform (App Engine) |
| Build | Maven |


## Project Structure

```
src/
├── main/
│   ├── java/com/Litix/
│   │   ├── LitixApplication.java
│   │   ├── pagecontrollers/      # Thymeleaf page routes
│   │   ├── security/             # Spring Security config, login/registration forms
│   │   ├── user/                 # User entity, repository, service
│   │   ├── vertexai/             # Vertex AI / Gemini integration
│   │   └── fantasy/player/       # Player & stats entities, services, controllers
│   └── resources/
│       ├── application.properties
│       └── templates/            # Thymeleaf HTML templates
└── test/
```
