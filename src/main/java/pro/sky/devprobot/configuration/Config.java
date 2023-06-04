package pro.sky.devprobot.configuration;

import com.pengrad.telegrambot.TelegramBot;
import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
    @Data
    public class Config {

        @Value("${bot.name}")
        String botName;

        @Value("${bot.owner}")
        Long ownerId;

        @Bean
        public TelegramBot telegramBot(@Value("${bot.token}") String token) {
            return new TelegramBot(token);
        }

        @Bean
        @Scope(scopeName = "singleton")
        public Shelter dogShelter() {
            ArrayList<Dog> dogs = new ArrayList<>();
            return new Shelter("Halfway Home");
        }
}

    @Bean
    @Scope(scopeName = "singlton")
    public Shelter catShelter() {
    ArrayList<Cat> cats = ArrayList<>()
                return new Shelter ("Help cats");
    }
