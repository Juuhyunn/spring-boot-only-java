package springbootonlyjava.Juuhyunn02.person;

import lombok.Data;

@Data
public class Person {
    private String regiNum;
    private String passNum;

    public Person(String rNum, String pNum) {
        regiNum = rNum;
        passNum = pNum;
    }
    public Person(String rNum) {
        regiNum = rNum;
    }
}
