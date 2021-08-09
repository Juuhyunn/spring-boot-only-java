package springbootonlyjava.Juuhyunn02.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ObjectArrayTest {
    @Mock
    ObjectArray objectArray;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        objectArray = new ObjectArray();
    }

    @Test
    void createCart() {
        String s = "";
        for (Product i : objectArray.createCart()) {
            System.out.println(i);
            s += String.format("\n%s. %s", i.getProductId(), i.getDescription());
        }
        assertEquals("\n1. Coffee\n2. Computer\n3. Apple\n4. Dress\n5. Fairy-tale book", s);
    }
}