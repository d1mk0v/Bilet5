import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        pieceOfList();
    }

    public static String pieceOfList() {

//    - Задача
//    Необходимо реализовать следующий метод:
//    1. Получаем на входе массив чисел.
//    2. Все четные числа увеличиваем на единицу.
//    3. Возвращаем кусок списка с 3-го по 7-й элемент.

        int[] arr = {1, 2, 5, 8, 4, 7, 9, 36, 12, 4};
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 2; i < 7; i++) {
            String list = new String(String.valueOf(arr[i]));
//            System.out.print(list + ", ");
            return pieceOfList();
        }
    }
}
