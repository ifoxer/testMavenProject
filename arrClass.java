import java.util.Scanner;

public class arrClass {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите слова :");
        String a = scr.nextLine();
        String b = scr.nextLine();
        String c = scr.nextLine();
        String d = scr.nextLine();
        String f = scr.nextLine();
        String[] mass = {a,b,c,d,f};
        int max = 0;

        for (int i = 0;i < mass.length;i++){
            if ( max < mass[i].length()){
                max = i;
                continue;
            }

        }
        System.out.println("Самое длинное слово: "+ mass[max]);
    }
}
