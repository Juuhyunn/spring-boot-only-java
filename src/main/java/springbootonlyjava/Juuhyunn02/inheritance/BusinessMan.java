package springbootonlyjava.Juuhyunn02.inheritance;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
class Man {
    private String name;

}

//@RequiredArgsConstructor
@Data
public final class BusinessMan extends Man{
    private final String company;
    private final String position;
}