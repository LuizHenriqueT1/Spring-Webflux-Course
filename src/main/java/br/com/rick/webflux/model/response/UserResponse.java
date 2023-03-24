package br.com.rick.webflux.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) {
}
