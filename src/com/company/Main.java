package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> Alpha = new LinkedList<>();
        Alpha.add("Element 1");
        Alpha.add("Element 2");
        Alpha.add("Element 3");
        Alpha.add("Element 4");
        Alpha.add("Element 5");
        Alpha.add("Element 6");
        Alpha.add("Element 7");
        Alpha.add("Element 8");
        Alpha.add("Element 9");
        Alpha.add("Element 10");
        System.out.println(Alpha);
        Queue<String> Omega = new LinkedList<>();
        Omega.add("Element 11");
        Omega.add("Element 12");
        Omega.add("Element 13");
        Omega.add("Element 14");
        Omega.add("Element 15");
        System.out.println(Omega);
        Alpha.add(Omega.poll());
        Alpha.add(Omega.poll());
        Alpha.add(Omega.poll());
        Alpha.add(Omega.poll());
        Alpha.add(Omega.poll());
        System.out.println(Alpha);
    }
}
