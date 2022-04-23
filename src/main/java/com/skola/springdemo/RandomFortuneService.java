package com.skola.springdemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private static final String[] fortunes = {
        "The random fortune A",
        "The random fortune B",
        "The random fortune C"
    };

    private final Random random = new Random();

    @Override
    public String getFortune() {
        int index  = random.nextInt(fortunes.length);
        return fortunes[index];
    }
}
