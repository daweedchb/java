package ru.mirea.config;

import org.springframework.context.annotation.Bean;
import ru.mirea.components.Junior;
import ru.mirea.components.Middle;
import ru.mirea.components.Senior;

public class BeanConfig {
    @Bean
    public Junior junior() {
        return new Junior();
    }

    @Bean
    public Middle middle() {
        return new Middle();
    }

    @Bean
    public Senior senior() {
        return new Senior();
    }
}