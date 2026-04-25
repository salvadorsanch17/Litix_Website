# Litix

A fantasy football management and analysis platform powered by Spring Boot and Google Vertex AI (Gemini).

## Features

- **User Authentication** — Registration, login, and session management via Spring Security
- **Player Database** — Store and browse NFL/fantasy player data and statistics
- **AI Trade Advisor** — Gemini 2.5 Flash-powered recommendations for trades, waivers, and lineup decisions
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

## Prerequisites

- Java 21+
- Maven 3.9+
- Docker & Docker Compose (for local PostgreSQL)
- Google Cloud SDK authenticated with a project that has Vertex AI enabled

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/Litix.git
cd Litix
```

### 2. Configure environment variables

```bash
cp .env.example .env
```

Edit `.env` and fill in your values:

```env
DB_PASSWORD=your_postgres_password
GCP_PROJECT_ID=your_gcp_project_id
POSTGRES_PASSWORD=your_postgres_password
```

### 3. Start the database

```bash
docker compose up -d
```

### 4. Run the application

```bash
./mvnw spring-boot:run
```

The app will be available at `http://localhost:8080`.

## Environment Variables

| Variable | Description | Default |
|----------|-------------|---------|
| `DB_URL` | PostgreSQL JDBC URL | `jdbc:postgresql://localhost:55121:5432/litixdb` |
| `DB_USERNAME` | Database user | `sal` |
| `DB_PASSWORD` | Database password | *(required)* |
| `GCP_PROJECT_ID` | Google Cloud project ID | *(required)* |
| `GCP_LOCATION` | Vertex AI region | `us-central1` |
| `POSTGRES_DB` | PostgreSQL database name | `litixdb` |
| `POSTGRES_USER` | PostgreSQL user | `sal` |
| `POSTGRES_PASSWORD` | PostgreSQL password | *(required)* |

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

## Deployment

The project includes an App Engine configuration (`src/main/appengine/app.yaml`) for deploying to Google Cloud:

```bash
./mvnw package -DskipTests
gcloud app deploy
```

Make sure your GCP project has the Vertex AI API enabled and your App Engine service account has the `roles/aiplatform.user` IAM role.

## License

MIT
