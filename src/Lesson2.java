import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
// вывести Hello World
        System.out.println("Hello World, Busechka!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//ввод чисел nextInt
        int number = sc.nextInt();
        System.out.println("Спасибо! Вы ввели число: " + number);
//ввод строки next
// почему не выводиться точка при вводе "ывамваы ." ??
        String sentence = sc.next();
        System.out.println("Поздравляю! Вы ввели предложение: " + sentence);
    }
}
