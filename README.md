# MP3 Library Web Application

![](https://img.shields.io/badge/Language-Java-informational?style=flat&logo=java)
![](https://img.shields.io/badge/Framework-Spring%20Boot-informational?style=flat&logo=spring)
![](https://img.shields.io/badge/View-JSP-informational)
![](https://img.shields.io/badge/Database-MySQL-informational?style=flat&logo=mysql)
![](https://img.shields.io/badge/Build-Maven-informational?style=flat&logo=apachemaven)

A Spring Boot web application for managing an MP3 library. Users can upload MP3 files, persist metadata, and look up lyrics for songs. The app exposes simple JSP views and uses a service/repository pattern with MySQL for persistence.

---

## Features
- Upload MP3 files via web UI
- Extract and store metadata: title, album, artist, release year
- Persist records in MySQL
- Search and fetch lyrics by title and artist
- List all uploaded MP3 entries

## Tech Stack
- Java 8+ / 11+
- Spring Boot (MVC)
- JSP views
- MySQL
- Maven

## Project Structure
Key files and directories:
- mp3project/src/main/java/com/mp3project/controllers
  - Mp3Controller.java — endpoints for upload, listing, lyrics search
  - ViewController.java — view routing
- mp3project/src/main/java/com/mp3project/model
  - Mp3.java — entity/model
- mp3project/src/main/java/com/mp3project/repositories
  - Mp3Repository.java — data access
- mp3project/src/main/java/com/mp3project/services
  - Mp3Service(.java), Mp3ServiceImpl(.java) — business logic
- mp3project/src/main/java/com/mp3project/utils
  - Mp3Utils.java — helper utilities (e.g., metadata extraction)
- mp3project/src/main/webapp/WEB-INF/jsp
  - uploadmp3.jsp, allmp3.jsp, findlyrics.jsp — JSP views
- mp3project/src/main/resources
  - application.properties — Spring Boot configuration

## Prerequisites
- JDK 8 or later (11+ recommended)
- Maven 3.8+
- MySQL 5.7/8.0 with a database and user created

## Quick Start
1) Clone the repository.

2) Configure database access in mp3project/src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/mp3library?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Adjust values as needed. For production, prefer environment variables or an externalized config.

3) Build and run with Maven from the mp3project directory:
- mvn clean package
- mvn spring-boot:run

The app will start on http://localhost:8080/ by default.

## Usage
- Upload MP3: navigate to /upload (uploadmp3.jsp)
- View all MP3s: navigate to /all (allmp3.jsp)
- Find lyrics: navigate to /findlyrics (findlyrics.jsp)

Note: Lyrics retrieval may rely on an external API. If an API key/provider is required, add the relevant properties (e.g., lyrics.api.base-url, lyrics.api.key) to application.properties or environment variables and ensure Mp3Service/Mp3Utils are configured to use them.

## Configuration Notes
- Database: Ensure your MySQL user has CREATE/ALTER privileges if using spring.jpa.hibernate.ddl-auto=update.
- File uploads: Verify multipart settings if changing defaults (spring.servlet.multipart.* properties).
- Port and context path can be customized via server.port and server.servlet.context-path.

## Testing
- Unit tests reside under mp3project/src/test/java.
- Run all tests: mvn test

## Roadmap / Ideas
- REST API endpoints in addition to JSP views
- Authentication and user-specific libraries
- Pagination and search over the library
- Album art extraction and display
- Dockerfile and docker-compose for one-command setup

## Contributing
Issues and pull requests are welcome. Please open an issue to discuss substantial changes first.

## License
This project is provided as-is. If you intend to use it under a specific license, add a LICENSE file and reference it here.
