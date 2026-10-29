package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    // 1-й эндпоинт: возвращает строку (текст)
    @GetMapping("/info")
    public String getInfo() {
        return "Лабораторная работа №1 по РБПО выполнена успешно!";
    }

    // 2-й эндпоинт: возвращает числа (например, сумму двух чисел или список)
    @GetMapping("/sum")
    public int calculateSum(@RequestParam(defaultValue = "10") int a,
                            @RequestParam(defaultValue = "20") int b) {
        return a + b;
    }
}