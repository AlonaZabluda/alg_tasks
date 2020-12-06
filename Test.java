package lesson5;

public class Test {
    public static void main(String[] args) {

        System.out.println(recPower(3, 5));

        int[] weights = {20, 5, 10, 40, 15, 25};
        int[] values = {1, 2,  3,  8,  7, 4};
        int capacity = 26;

        System.out.println("Rucksack value is " +
                recRucksack(weights, values, values.length - 1, capacity));
    }

    //        1. Написать программу по возведению числа в степень с помощью рекурсии.
    public static int recPower(int num, int powerRaised) {
        if (powerRaised == 0) {
            return 1;
        }
        return (num * recPower(num, powerRaised - 1));
    }


    //        2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
    public static int recRucksack(int[] weights, int[] values, int n, int capacity) {
        if (n <= 0) {
            return 0;
        } else if (weights[n - 1] > capacity) {
            return recRucksack(weights, values, n - 1, capacity);
        } else {
            return Math.max(recRucksack(weights, values, n - 1, capacity), values[n - 1]
                    + recRucksack(weights, values, n - 1, capacity - weights[n - 1]));
        }
    }
}
