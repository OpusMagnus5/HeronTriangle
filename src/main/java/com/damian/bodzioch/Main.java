package com.damian.bodzioch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj współrzędne trójkąta: ");
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        System.out.printf("Bok A: %.2f\n", triangle.getSideA());
        System.out.printf("Bok B: %.2f\n", triangle.getSideB());
        System.out.printf("Bok C: %.2f\n", triangle.getSideC());
        System.out.printf("Pole: %.2f", triangle.getField());
    }
}
