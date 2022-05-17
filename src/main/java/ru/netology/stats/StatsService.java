package ru.netology.stats;


public class StatsService {

    public int sum(int[] statistics) {
        int sum = 0;
        for (int statistic : statistics) {
            sum += statistic;

        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int averageSales(int[] sales) {
        int averageMonth = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            averageMonth = sum / sales.length;

        }
        return averageMonth;


    }

    public int quantityBelowAverage(int[] sales) {
        int averageMonth = 0;
      //  int sum = 0;
        int quantityMin = 0;

      // for (int sale : sales) {
      //     sum += sale;
      // }
      // averageMonth = sum / sales.length;

        for (int sale : sales) {
            averageMonth = averageSales(sales);
            if (averageMonth >= sale) {
                quantityMin++;
            }
        }

        return quantityMin;

    }

    public int quantityAboveAverage(int[] sales) {

        int average = 0;
        int quantityMax = 0;

        for (int sale : sales) {
            average = averageSales(sales);
            if (average < sale) {
                quantityMax++;
            }
        }

        return quantityMax;

    }


}
