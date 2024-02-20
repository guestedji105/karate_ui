package org.example;

import org.example.locators.MainPageLocators;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> map = MainPageLocators.MainPageLocatorsMap;
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
