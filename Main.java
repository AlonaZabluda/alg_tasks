package lesson4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Maria");
        mll.insertFirst("Katya");
        mll.insertFirst("Luba");
        mll.insertFirst("Anna");

        ListIterator<String> listIterator = mll.listIterator();
        while (listIterator.hasPrevious()) {
            String s = listIterator.previous();
            if(s.equals("Luba")){
                listIterator.set("Sofia");
//                listIterator.add("Sofia");
//                listIterator.remove();
            }
        }
        System.out.println(mll);


//        MyStack<String> ms = new MyStack<>();
//        ms.push("qwerty");
//        ms.push("asdfgh");
//        ms.push("zxcvbn");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(ms.pop());
//        }
    }
}

