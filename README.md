# Spring Boot Keycloak Integration Readme

## Quick Start
### Prerequisites
- Keycloak Server: Set up Keycloak (download from https://www.keycloak.org/).
- Spring Boot App: Have a Spring Boot app ready.

### Configuration
1. Keycloak Client Setup:
- Create a Keycloak client and note the ID and secret.
2. Spring Boot Configuration:
- Add dependencies in **pom.xml**:
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
- Configure **application.properties** or **application.yml**:
    ```
    spring.security.oauth2.client.registration.keycloak.client-id=YOUR_CLIENT_ID
    spring.security.oauth2.client.registration.keycloak.client-secret=YOUR_CLIENT_SECRET
    # Add other properties
    ```
## Connect to Keycloak

1. Secure Endpoints:
- Use Spring Security annotations:
    ``` java
    @GetMapping("/secured-endpoint")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String securedEndpoint() {
        return "Secured!";
    }
    ```
2. Run Your App:
- Start the app, navigate to the secured endpoint, and Keycloak handles authentication.

## Resources
- Spring Security Docs: https://docs.spring.io/spring-security/reference/html5/
- Keycloak Docs: https://www.keycloak.org/documentation.html
