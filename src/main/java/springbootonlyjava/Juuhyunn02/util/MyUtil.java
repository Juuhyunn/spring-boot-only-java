package springbootonlyjava.Juuhyunn02.util;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class MyUtil {
    public String howLongRemind(LocalDate today, String mon, String day) {
        Period p = Period.between(today, LocalDate.of(today.getYear(), Integer.parseInt(mon), Integer.parseInt(day)));
        return String.format("%s 월 %s 일 까지 남은 %s 개월, %s 일..", mon, day, p.getMonths(), p.getDays());
    }
    public String usedTime(String hour1, String min1, String sec1, String hour2, String min2, String sec2) {
        return "총 이용 시간 : " + getTime(Duration.between(getLocalTime(hour1, min1, sec1),getLocalTime(hour2, min2, sec2)).getSeconds());
    }
    private LocalTime getLocalTime(String hour, String min, String sec) {
        return LocalTime.of(Integer.parseInt(hour), Integer.parseInt(min), Integer.parseInt(sec));
    }
    private String getTime(long sec) {
//        int i = (int) sec;
//        int hour = (int) sec/(60*60);
//        int minute = ((int) sec-(hour*60*60))/60;
//        int second = (int) sec%60;
        return String.format("%d 시간 %d 분 %d 초", (int) sec/(60*60), ((int) sec-(((int) sec/(60*60))*60*60))/60, (int) sec%60);
    }

}
