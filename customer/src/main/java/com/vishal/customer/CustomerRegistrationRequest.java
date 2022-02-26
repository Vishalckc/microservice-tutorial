package com.vishal.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
