package br.com.rick.webflux.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {

}
