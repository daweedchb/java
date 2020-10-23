package task3;

import task3.operation.*;
import task3.object.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(
                new Add(
                        new Subtract(
                                new Multiply(
                                        new Variable("x"),
                                        new Variable("x")
                                ),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(x, x, x));
    }
}