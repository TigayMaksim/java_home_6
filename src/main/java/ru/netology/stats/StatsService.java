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
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
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
        int sum = 0;
        int quantityMin = 0;

        for (int sale : sales) {
            sum += sale;
        }
        averageMonth = sum / sales.length;

        for (int sale : sales) {
            if (averageMonth >= sale) {
                quantityMin++;
            }
        }

        return quantityMin;

    }

    public int quantityAboveAverage(int[] sales) {
        int averageMonth = 0;
        int sum = 0;
        int quantityMax = 0;

        for (int sale : sales) {
            sum += sale;
        }
        averageMonth = sum / sales.length;

        for (int sale : sales) {
            if (averageMonth < sale) {
                quantityMax++;
            }
        }

        return quantityMax;

    }


}
