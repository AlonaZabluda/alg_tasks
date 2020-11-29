package lesson3;


public class Main {
    public static void main(String[] args) {

//        1. Создать программу, которая переворачивает вводимые строки (читает справа налево).

        String original = "String to revers";
        MyStack<Character> stack = new MyStack<>(20);
        for(int i = 0; i < original.length(); i ++) {
            stack.push(original.charAt(i));
        }

        String result = "";
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result.toString());

//        2. Создать класс для реализации дека (см. MyDeque)

        MyDeque<Integer> arr = new MyDeque<>();
        arr.addLast(1);
        arr.addLast(2);
        arr.addLast(3);
        arr.addFirst(8);
        arr.addFirst(9);
        System.out.println(arr.toString());

        arr.removeFirst();
        arr.removeLast();

        System.out.println(arr.peekFirst());
        System.out.println(arr.peekLast());

        System.out.println(arr.toString());
    }
}
