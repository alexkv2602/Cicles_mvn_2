package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {30, 15, 13, 15, 17, 20, 19, 20, 7, 35, 14, 18};
        int expected = 10;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindManSales() {
        StatsService service = new StatsService();
        long[] sales = {30, 15, 13, 15, 17, 20, 19, 20, 7, 35, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindNumberOfBadSales(){
        StatsService service = new StatsService();
        long[] sales = {30, 15, 13, 15, 17, 20, 19, 20, 7, 35, 14, 18};
        int expected = 6;

        int actual = service.badSales(sales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldFindNumberOfGoodSales(){
        StatsService service = new StatsService();
        long[] sales = {30, 18, 18, 15, 17, 20, 19, 20, 7, 35, 14, 18};
        int expected = 4;

        int actual = service.goodSales(sales);
        assertEquals(expected,actual);
    }

}