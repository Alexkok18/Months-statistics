package ru.netology.stats;

public class StatsService {
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long findAverage(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;

            }

            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long lessAverage(long[] sales) {
        long Average = findAverage(sales);
        int month = 0;
        for (long sale : sales) {

            if (sale < Average) {
                month = month + 1;
            }

        }
        return month;


    }
    public long moreAverage(long[] sales) {
        long Average = findAverage(sales);
        int month = 0;
        for (long sale : sales) {

            if (sale > Average) {
                month = month + 1;
            }

        }
        return month;


    }
}