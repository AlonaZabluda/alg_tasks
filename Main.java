package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 20000;
        int balanceCount = 0;

        for (int i = 0; i < count; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int x = 0;
            while (map.maxHeight() < 6) {
                x = random.nextInt(100);
                map.put(x, 1);
            }
            map.delete(x);
            if (map.isBalanced()) {
                balanceCount++;
            }
        }

        double balanced = (double) balanceCount / count * 100;
        double notBalanced = (double) (count - balanceCount) / count * 100;

        System.out.printf("Balanced %s %% %n", balanced);
        System.out.printf("Not balanced %s %%", notBalanced);


    }
}
