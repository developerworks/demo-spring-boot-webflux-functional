package com.example.demospringbootwebflux;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {
    public Mono<User> getUserById(Long id);

    public Flux<User> getAllUsers();

    public Mono<Void> saveUser(Mono<User> user);

    public Mono<User> putUser(Long id, Mono<User> user);

    public Mono<String> deleteUser(Long id);
}