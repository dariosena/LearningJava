class QuarterlyBalance {
    public static void main(String[] args) {
        int januarySpending = 15000;
        int februarySpending = 23000;
        int marchSpending = 17000;

        int quarterSpend = januarySpending + februarySpending + marchSpending;

        System.out.println(quarterSpend);

        double monthlyAverage = quarterSpend / 3.0;

        System.out.println("Monthly average value = " + monthlyAverage);
    }
}
