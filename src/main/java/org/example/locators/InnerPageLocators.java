package org.example.locators;

import java.util.HashMap;
import java.util.Map;

public class InnerPageLocators {
    public static Map<String, Object> PageLocatorsMap = new HashMap<>();

    static {
        // CSS селекторы - вид селекторов по умолчанию в Karate UI
        PageLocatorsMap.put("burgerMenu", "button[id=react-burger-menu-btn]");
        PageLocatorsMap.put("logo", "div[class=app_logo]");
        PageLocatorsMap.put("shoppingCart", "a[class=shopping_cart_link]");
    }
}
