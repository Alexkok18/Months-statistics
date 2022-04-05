package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calcSum(sales);
        assertEquals(actual, expected);
    }


    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.findAverage(sales);
        assertEquals(actual, expected);
    }
    @Test
    void souldFindMaxMountSales() {
        StatsService service = new StatsService();
        long [] sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);
        assertEquals(actual, expected);
    }

    @Test
    void souldFindMinMountSales() {
        StatsService service = new StatsService();
        long [] sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);
        assertEquals(actual, expected);
    }


    @Test
    void souldFindLessAverageSales() {
        StatsService service = new StatsService();
        long [] sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.lessAverage(sales);
        assertEquals(actual, expected);
    }

    @Test
    void souldFindMoreAverageSales() {
        StatsService service = new StatsService();
        long [] sales ={ 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.moreAverage(sales);
        assertEquals(actual, expected);
    }
}