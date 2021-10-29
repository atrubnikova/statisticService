package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    private final long[] purchases = {8,15,13,15,17,20,19,20,7,14,14,18};
    private final StatisticService service = new StatisticService();
    @Test
    public void shouldSum() {

        assertEquals(180, service.sum(purchases));

    }
    @Test
    public void shouldAvg() {

        assertEquals(15, service.avg(purchases));

    }
    @Test
    public void shouldReturnMonthWithMax() {

        assertEquals(8, service.monthWithMax(purchases));

    }
    @Test
    public void shouldReturnMonthWithMin() {

        assertEquals(9, service.monthWithMin(purchases));

    }
    @Test
    public void shouldReturnMonthsWithMore() {

        assertEquals(5, service.monthsWithMoreThanAvg(purchases));

    }@Test
    public void shouldReturnMonthsWithLess() {

        assertEquals(5, service.monthsWithLessThanAvg(purchases));

    }
}