package com.zycat.csrf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;


class CsrfApplicationTests {

    @Test
    void contextLoads() {
        LocalDate nowDate = LocalDate.now();
        int month = nowDate.getMonthValue();
        int day = nowDate.getDayOfMonth();
        int year = nowDate.getYear();
        for (int i = month; i <= 12; i++) {
            nowDate = i == month ? nowDate : nowDate.plusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
            int lastDay = nowDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
            for (int j = i == month ? day : 1; j <= lastDay; j++) {
                System.out.printf(year + "年%02d月%02d日平安\n", i, j);
            }
            System.out.println("恭喜你" + i + "月全部平安");
        }
    }

    @Test
    public void tst() {
        LocalDate nowDate = LocalDate.now();
        nowDate = nowDate.plusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(nowDate);
    }

    @Test
    public void 开心经() {
        LocalDate nowDate = LocalDate.now();
        LocalDate lastYearDayDate = nowDate.with(TemporalAdjusters.lastDayOfYear());
        while (!nowDate.isAfter(lastYearDayDate)) {
            System.out.printf(nowDate.getYear() + "年%02d月%02d日开心\n", nowDate.getMonthValue(), nowDate.getDayOfMonth());
            nowDate = nowDate.plusDays(1);
        }
        Assert.isTrue(偶数(2));
    }

    private boolean 偶数(int 输入值){
        for(int i=0;i<=Integer.MAX_VALUE;i++){
//            如果i是偶数切 输入值和i相等，说明输入值也是偶数
            if (i%2==0&&输入值==i){
                return true;
            }else {
                return false;
            }

        }
        return false;
    }
}
