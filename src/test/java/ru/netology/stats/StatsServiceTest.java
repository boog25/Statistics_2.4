package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void sumMonth() {
        StatsService service=new StatsService();
        long expected=180;
        long actual=service.SumMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void AverageSales() {
        StatsService service=new StatsService();
        long expected=15;
        long actual=service.AverageSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void maximumsaleamount() {
        StatsService service=new StatsService();
        long expected=8;
        long actual=service.maximumsaleamount(sales);
        assertEquals(expected, actual);
    }
    @Test
    void minsaleamount() {
        StatsService service=new StatsService();
        long expected=9;
        long actual=service.minsaleamount(sales);
        assertEquals(expected, actual);
    }
    @Test
    void MonthsWhenSalesWereBelowAverage() {
        StatsService service=new StatsService();
        long expected=5;
        long actual=service.MonthsWhenSalesWereBelowAverage(sales);
        assertEquals(expected, actual);
    }
    @Test
    void MonthsWhenSalesWereAverage() {
        StatsService service=new StatsService();
        long expected=5;
        long actual=service.MonthsWhenSalesWereAverage(sales);
        assertEquals(expected, actual);
    }
}