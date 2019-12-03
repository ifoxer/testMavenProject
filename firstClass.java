import java.util.Scanner;

public class firstClass {

    /**
     * Метод main складывает дробные числа,результат округляет до 4х знаков после запятой.
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        float first = scn.nextFloat();
        System.out.println("Введите второе значение: ");
        float second = scn.nextFloat();
        float res = first + second;
        System.out.printf ("%.4f", res);
    }
}

