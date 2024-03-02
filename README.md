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
    #!/bin/bash

# Define color codes
GREEN='\033[0;32m'
CYAN='\033[0;36m'
RESET='\033[0m'

# Colored code example
echo -e "${GREEN}@GetMapping(\"${CYAN}/secured-endpoint${GREEN}\")"
echo -e "${GREEN}@PreAuthorize(\"${CYAN}hasRole('ROLE_USER')${GREEN}\")"
echo -e "${GREEN}public String securedEndpoint() {"
echo -e "    return \"Secured!\";"
echo -e "}"
echo -e "${RESET}"
