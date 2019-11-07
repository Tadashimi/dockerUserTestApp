package ru.samplewebsite.userstestapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.samplewebsite.userstestapp.models.User;
import ru.samplewebsite.userstestapp.repositories.UserRepository;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/")
    public String home() {
        return "users";
    }

    @GetMapping("/users0")
    List<User> all() {
        return repository.findAll();
    }

    @PostMapping("/users0")
    User newUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }

    @GetMapping("/users0/{id}")
    User one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/users0/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Long id) {

        return repository.findById(id)
                .map(user -> {
                    user.setFirstname(newUser.getFirstname());
                    user.setLastname(newUser.getLastname());
                    user.setAddress(newUser.getAddress());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/users0/{id}")
    void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
