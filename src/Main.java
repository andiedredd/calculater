import app.Calculater; // импорт в мейн класса из папки
import java.util.Scanner;

public class Main { // класс мейн
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значения в формате a + b: ");
//        int a = sc.nextInt();
//        char op = sc.next().charAt(0);
//        int b = sc.nextInt();

        Calculater calculater = new Calculater(); // экземпляр класса
        calculater.a = sc.nextInt();
        calculater.op = sc.next().charAt(0);
        calculater.b = sc.nextInt();
        calculater.calculate();

        if
        String d = ("Hello, world!");
        String d = ("Hello, sky!");
        String d = ("By-by, baby!");

        String d = ("By-by, baby!");
        String d = ("Hello, sky!");
        String d = ("Hello, world!");





    }
}