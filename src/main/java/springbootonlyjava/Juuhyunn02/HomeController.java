package springbootonlyjava.Juuhyunn02;

import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeController {
    @GetMapping("/")
    public String home() {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
