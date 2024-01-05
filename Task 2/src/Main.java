import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
       print();
        }

    private static void print() {
        System.out.println(inputInteger() % 2 == 0);
    }
    private static int inputInteger() {
        System.out.println("Введите целое число:");
        return new Scanner (System. in).nextInt();
    }
}


