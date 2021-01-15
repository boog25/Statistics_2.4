package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumMonth() {
        StatsService service=new StatsService();
        long expected=180;
        long actual=service.sumMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service=new StatsService();
        long expected=15;
        long actual=service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maximumSaleAmount() {
        StatsService service=new StatsService();
        long expected=8;
        long actual=service.maximumSaleAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSaleAmount() {
        StatsService service=new StatsService();
        long expected=9;
        long actual=service.minSaleAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWhenSalesWerebeLowAverage() {
        StatsService service=new StatsService();
        long expected=5;
        long actual=service.monthWhenSalesWerebeLowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWhenSalesWereAverage() {
        StatsService service=new StatsService();
        long expected=5;
        long actual=service.monthsWhenSalesWereAverage(sales);
        assertEquals(expected, actual);
    }
}