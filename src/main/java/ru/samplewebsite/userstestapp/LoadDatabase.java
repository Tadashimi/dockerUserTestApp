package ru.samplewebsite.userstestapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.samplewebsite.userstestapp.models.User;
import ru.samplewebsite.userstestapp.repositories.UserRepository;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        // Если нужно очистить репозиторий перед работой
        // repository.deleteAll();

        return args -> {
            log.info("Preloading");
            // Если нужно добавить пользователей перед работой
//            log.info("Preloading " + repository.save(new User("a1", "b2", "c3")));
//            log.info("Preloading " + repository.save(new User()));
        };
    }
}
