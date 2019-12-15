public class puzClass {

    public static void main(String[] args) {

        /**
         * объявляем массив на 20 элементов и заполняем его случайными значениями от -10 до 10;
         */
        int[] mass = new int[20];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 20) - 10);
            System.out.println("элемент: " + i + " = " + mass[i]);
        }

        /**
         * поиск максимального отрицательного элемента массиваж;
         */
        int maxValue = 0;
        int maxElement = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0 && mass[i] < maxValue) {
                maxValue = mass[i];
                maxElement = i;
            }
        }
        System.out.println("максимальный отрицательный элемент: " + maxValue);
        System.out.println("номер максимального элемента в массиве: "+maxElement);

        /**
         *  поиск минимального положительного элемента массива;
         */

        int [] massPol = new int[20]; // массив для положительных значений
        int minElement = 0;
        int minValue = 0;
// заполняем массив положительными значениями
        for (int i = 0;i < mass.length;i++) {

            if (mass[i] > 0) {
                minValue =  mass[i];
                massPol[i] = mass[i];
            }
        }
//ищем минимальное положительное значение
        for (int j = 0;j < massPol.length;j++) {
            if (massPol[j] <= minValue && mass[j] > 0){
                minValue = massPol[j];
                minElement = j;
            }
        }

        System.out.println("минимальный положительный элемент: "+ minValue);
        System.out.println("номер минимального элемента в массиве: "+ minElement);

     //меняем местами максимальный и минимальный элементы массива
    mass[maxElement] = minValue;
    mass[minElement] = maxValue;

        for (int i = 0;i < mass.length; i++){
            System.out.println("элемент: " + i + " = " + mass[i]);
        }

    }
}
