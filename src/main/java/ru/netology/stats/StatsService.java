package ru.netology.stats;

public class StatsService {
    public long sumMonth(long[] sales){
        long sum = 0;
        for(long sale : sales) {
            sum+=sale;
        }
    return sum;
    }

    public long averageSales(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum+=sale;
        }
        return sum/sales.length;
    }
    public long maximumSaleAmount (long[] sales){
        int maxmonth = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[maxmonth] <= sales[i]) {
                    maxmonth = i;
            }
        }
            return maxmonth + 1;
        }
    public long minSaleAmount (long[] sales) {
        int minmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minmonth] >= sales[i]) {
                minmonth = i;
            }
        }
        return minmonth + 1;
    }
    public long monthWhenSalesWerebeLowAverage (long[] sales){
        long average = averageSales(sales);
        long month = 0;
        for (long sale : sales){
            if (sale < average){
                month++;
            }
        }
        return month;
    }
    public long monthsWhenSalesWereAverage (long[] sales){
        long average = averageSales(sales);
        long month = 0;
        for (long sale : sales){
            if (sale > average){
                month++;
            }
        }
        return month;
    }
}
