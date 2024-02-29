package com.testKeycloak.keycloak;

public record UserRecord(String username, String email, String firstName, String lastName, String password) {
}
