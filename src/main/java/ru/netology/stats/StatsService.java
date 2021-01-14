package ru.netology.stats;

public class StatsService {
    public long SumMonth(long[] sales){
        long sum = 0;
        for(long sale : sales) {
            sum+=sale;
        }
    return sum;
    }

    public long AverageSales(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum+=sale;
        }
        return sum/sales.length;
    }
    public long maximumsaleamount (long[] sales){
        int maxmonth = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[maxmonth] <= sales[i]) {
                    maxmonth = i;
            }
        }
            return maxmonth + 1;
        }
    public long minsaleamount (long[] sales) {
        int minmonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minmonth] >= sales[i]) {
                minmonth = i;
            }
        }
        return minmonth + 1;
    }
    public long MonthsWhenSalesWereBelowAverage (long[] sales){
        long average = AverageSales(sales);
        long month = 0;
        for (long sale : sales){
            if (sale < average){
                month++;
            }
        }
        return month;
    }
    public long MonthsWhenSalesWereAverage (long[] sales){
        long average = AverageSales(sales);
        long month = 0;
        for (long sale : sales){
            if (sale > average){
                month++;
            }
        }
        return month;
    }
}
