import java.util.Scanner;

public class arrClass {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int razmer = scr.nextInt();
        String[] mass = new String[razmer];

        /**
         * Запись данных в массив
         */
        System.out.println("Введите слова :");
        //запись в нулевой элемент массива
        String wor = scr.nextLine();
        mass[0] = wor;
        //запись в остальные элементы массива
        for (int i = 0;i < mass.length;i++){
            String word = scr.nextLine();
            mass[i] = word ;
        }

        /**
         * Выбор слова с максимальным кол-ом символов
         */
        int max = 0;
        String m = "0";

        for (int i = 0;i < mass.length;i++){

            if ( max < mass[i].length()){
              max = mass[i].length();
              m = mass[i];
            }

        }
        System.out.println("Самое длинное слово: "+ m);

    }
}
