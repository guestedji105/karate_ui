package org.example.locators;

import java.util.HashMap;
import java.util.Map;

public class MainPageLocators extends InnerPageLocators {
    public static Map<String, Object> MainPageLocatorsMap = new HashMap<>();

    static {
        // Добавляем все "родительские" локаторы
        MainPageLocatorsMap.putAll(PageLocatorsMap);
        // ID селектор
        MainPageLocatorsMap.put("addToCartButton", "#add-to-cart-sauce-labs-backpack");
        // Точное совпадение текста в первом div элементе
        MainPageLocatorsMap.put("backpackPageLink", "{div}Sauce Labs Backpack");
        // Частичное совпадение текста в любом первом элементе
        MainPageLocatorsMap.put("bikeLightLink", "{^}Bike Light");
        // Частичное совпадение текста в первом button элементе
        MainPageLocatorsMap.put("removeFromCartButton", "{^button}Remove");
        // XPath
        MainPageLocatorsMap.put("shoppingCartItemsCount", "//*[@class='shopping_cart_link']");
        // Лист элементов - ничем не отличается, кроме использования в тесте
        MainPageLocatorsMap.put("productsLinkList", "//*[@class='inventory_item_name ']");
        // Этого не должно быть здесь =)
        MainPageLocatorsMap.put("productName", "//*[contains(@class, 'inventory_details_name')]");
    }
}
