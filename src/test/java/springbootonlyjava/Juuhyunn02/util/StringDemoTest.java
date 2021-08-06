package springbootonlyjava.Juuhyunn02.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class StringDemoTest {
    @Mock StringDemo stringDemo;
    @BeforeEach void setUp() {
        MockitoAnnotations.initMocks(this);
        stringDemo = new StringDemo();
    }
    @DisplayName("문자열 concat")

    @Test
    void concat() {
        assertEquals("CoffeeBread", stringDemo.concat("Coffee", "Bread"));
    }
    @Test
    void substring() {
        assertEquals("cdefg", stringDemo.substring("abcdefg", 2));
        assertEquals("c", stringDemo.substring("abcdefg", 2,3));
    }
    @Test
    void compareTo() {
        assertEquals(0, stringDemo.compareTo("abcd", "abcd"));
    }
    @Test
    void compareToIgnoreCase() {
        assertEquals(0 ,stringDemo.compareToIgnoreCase("abcd", "ABcd"));
    }
    @Test
    void removeHyphenInJuminBunho() {
        assertEquals("9603051111111", stringDemo.removeHyphenInJuminBunho("960305-1111111"));
    }
}