package springbootonlyjava.Juuhyunn02.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BusinessManTest {
    @Mock
    BusinessMan businessMan;
    Man man;
    @BeforeEach
    void setUp() {
//        MockitoAnnotations.initMocks(this);
        businessMan = new BusinessMan("삼성", "대리");
        businessMan.setName("홍길동");
    }
    @DisplayName("상속 예제")
    @Test
    public void test_showName() {
        assertEquals("홍길동", businessMan.getName());
        assertEquals("삼성", businessMan.getCompany());
        assertEquals("대리", businessMan.getPosition());
        System.out.println(businessMan.toString());

    }


}