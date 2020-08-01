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
    }

    @Test
    public void t2() {
        int[] arr = {1, 3, 2, 5, 1, 7, 8, 2, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
