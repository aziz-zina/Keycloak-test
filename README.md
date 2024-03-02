# Spring Boot Keycloak Integration Readme

## Quick Start
### Prerequisites
- Keycloak Server: Set up Keycloak (download from https://www.keycloak.org/).
- Spring Boot App: Have a Spring Boot app ready.

### Configuration
1. Keycloak Client Setup:
- Create a Keycloak client and note the ID and secret.
2. Spring Boot Configuration:
- Add dependencies in `**pom.xml**`:
    ```
      <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-oauth2-client</artifactId>
      </dependency>
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-security</artifactId>
      </dependency>
    ```
