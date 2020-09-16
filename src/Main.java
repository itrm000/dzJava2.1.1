public class Main {
    public static void main(String[] args) {

        long ticket = 2657; /* цена билета */
        long bonus = 20;    /* бонус - за какой количество рублей начисляется 1 миля*/
        long sumMile = ticket/bonus;  /* суммарный бонус за билет */

        System.out.println(sumMile);
    }
}
