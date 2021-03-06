package springbootonlyjava.Juuhyunn02.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock ArrayDemo arrayDemo;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }
    @Test
    void test_fill() {
        String ar = "";
        for(int i : arrayDemo.fill(7)){
            ar += i;
        }
        assertEquals("77777", ar);
    }
    @Test
    void test_createIntegerArray() {
        String s = "";
        for (int i : arrayDemo.createIntegerArray(-9, 0)) {
            s += i;
        }
        assertEquals("12345", s);
    }

}

