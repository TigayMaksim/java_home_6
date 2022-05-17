package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();

        int[] statistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(statistics);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSaleMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSaleMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageSaleMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSales(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void quantityBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.quantityBelowAverage(sales);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.quantityAboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}