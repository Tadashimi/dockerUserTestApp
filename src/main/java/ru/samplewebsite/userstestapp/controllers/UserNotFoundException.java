package ru.samplewebsite.userstestapp.controllers;

class UserNotFoundException extends RuntimeException {
    UserNotFoundException(Long id) {
        super("Could not find user " + id);
    }
}
