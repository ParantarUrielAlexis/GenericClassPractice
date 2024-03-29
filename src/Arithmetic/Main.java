package Arithmetic;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Arithmetic operation = new Arithmetic(n1, n2);

        System.out.println(operation.add());

        System.out.println(operation.subtract());

        System.out.println(operation.multiply());

        System.out.printf("%.2f%n", operation.divide());

        System.out.println(operation.getMax());

        System.out.println(operation.getMin());

        System.out.print("Enter first number: ");
        short nu1 = sc.nextShort();

        System.out.print("Enter second number: ");
        float nu2 = sc.nextFloat();

        Arithmetic operation2 = new Arithmetic(nu1, nu2);

        System.out.println(operation2.add());

        System.out.println(operation2.subtract());

        System.out.println(operation2.multiply());

        System.out.printf("%.2f%n", operation2.divide());

        System.out.println(operation2.getMax());

        System.out.println(operation2.getMin());
    }
}
