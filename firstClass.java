import java.util.Scanner;

public class firstClass {

    /**
     * Метод main выполняет операции (+,-,*,/) для чисел с плавающей точкой, результат округляет до 4х знаков после запятой.
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        float first = scn.nextFloat();
        System.out.println("Введите второе значение: ");
        float second = scn.nextFloat();
/**
 * switch для выбора операции
 */
        System.out.println("Введите желаемую операцию: ");
        String oper = scn.next();

        switch (oper) {
            case "-":
                v(first,second);
                break;

            case "+":
                u(first,second);
                break;

            case "*":
                u(first,second);
                break;

            case "/":
                d(first,second);
                break;

        }

    }

    /**
     *
     * @return сложение дробных чисел
     */
    public static float s (float first, float second) {
        float res = first + second;
        System.out.printf ("%.4f", res);
        return res;
    }

    /**
     *
     * @return вычитание дробных чисел
     */
    public static float v (float first, float second){
        float res = first - second;
        System.out.printf ("%.4f", res);
        return res;
    }

    /**
     *
     * @return умножение дробных чисел
     */
    public static float u (float first, float second){
        float res = first * second;
        System.out.printf ("%.4f", res);
        return res;
    }

    /**
     *
     * @return деление дробных чисел
     */
    public static float d (float first, float second){
        float res = first / second;
        System.out.printf ("%.4f", res);
        return res;
    }
}

