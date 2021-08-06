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
    void fill() {
        String ar = "";
        for(int i : arrayDemo.fill(7)){
            ar += i;
        }
        assertEquals("77777", ar);
    }

    @Test
    void copy() {
        String ar = "";
        for (int i : arrayDemo.copy(new int[]{7,7,7,7,7},0, 2, 2)) {
            ar += i;
        }
        assertEquals("00770", ar);
    }
}

