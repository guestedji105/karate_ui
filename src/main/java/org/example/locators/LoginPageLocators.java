package org.example.locators;

import java.util.HashMap;
import java.util.Map;

public class LoginPageLocators {
    public static Map<String, Object> LoginLocatorsMap = new HashMap<>();

    static {
        //CSS Selector Karate UI
        LoginLocatorsMap.put("loginInput", "input[id=user-name]");// input#user-name
        LoginLocatorsMap.put("passwordInput", "input[id=password]");
        LoginLocatorsMap.put("loginButton", "input[id=login-button]");
        // Этого не должно быть здесь =)
        LoginLocatorsMap.put("appLogo", "div[class=app_logo");
    }
}
