package karate;

import static org.example.ConfigReader.getAll;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.BeforeAll;

class TestRunner {

    @BeforeAll
    public static void setUp() {
        // Логичный способ не работает
        //System.setProperties(getAll());
        // Поэтому добавляем свойства по одному
        getAll().forEach((key, value) -> System.setProperty(key.toString(), value.toString()));
        // Или если нужно добавить только одно свойство
        //System.setProperty("baseUrl", ConfigReader.get("baseUrl"));
    }

    @Karate.Test
    Karate testsRun() {
        return Karate.run().relativeTo(getClass());
    }
}