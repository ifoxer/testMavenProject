import java.util.Scanner;

public class firstClass {

    /**
     * Выбор функционала
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите 1 - для использования калькулятора или 2 - для определениия самого длинного слова");
        int v = scn.nextInt();

        switch (v) {
            case 1:
                calClass.main(null);
                break;

            case 2:
                arrClass.main(null);
                break;
        }
    }
}