package springbootonlyjava.Juuhyunn02.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyCalculatorTest {
    @Mock
    MyCalculator myCalculator;
    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        myCalculator = new MyCalculator();
    }
    @DisplayName("계산기")
    @Test
    void add() {
        assertEquals(5, myCalculator.add(2,3));
    }
    @Test
    void subtract() {
        assertEquals(-1, myCalculator.subtract(2, 3));
    }
    @Test
    void multiple() {
        assertEquals(6, myCalculator.multiple(2, 3));
    }
    @Test
    void divide() {
        assertEquals(0, myCalculator.divide(2, 3));
    }
    @Test
    void remind() {
        assertEquals(1, myCalculator.remind(2, 3));
    }
}