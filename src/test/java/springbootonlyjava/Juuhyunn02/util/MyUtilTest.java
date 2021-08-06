package springbootonlyjava.Juuhyunn02.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyUtilTest {
    @Mock
    MyUtil myUtil;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myUtil = new MyUtil();
    }
    @DisplayName("입력한 날짜까지 앞으로 얼마나 남았는가?")
    @Test
    void howLongRemind() {
        System.out.println(myUtil.howLongRemind(LocalDate.now(), "08", "29"));
    }
    @DisplayName("총 이용 시간은?")
    @Test
    void usedTime() {
        System.out.println(myUtil.usedTime("9","30", "28", "18", "00", "49"));
    }
}