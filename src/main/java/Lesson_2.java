import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к Лекции 2.2\n");

        array100();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign() {
        int a = 15;
        int b = -35;

        if (a + b >= 0) {
            System.out.println("Сумма положительная\n");
        }else{
            System.out.println("Сумма отрицательная\n");
        }
    }

    public static void printColor() {
        int value = 135;

        if (value <= 0){
            System.out.println("Красный\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый\n");
        } else if (value > 100) {
            System.out.println("Зеленый\n");
        }
    }

    public static void compareNumbers() {
        int a = 1123;
        int b = 321;

        if (a >= b){
            System.out.println("a >= b\n");
        }else {
            System.out.println("a < b\n");
        }
    }

    public static boolean checkSum1020(int a, int b){
        if ((a + b >= 10) && (a + b <= 20)){
            return true;
        } else {
            return false;
        }
    }

    public static void numPositiveNegative(int a){
        if (a >= 0){
            System.out.println("Число положительное\n");
        } else {
            System.out.println("Число отрицательное\n");
        }
    }

    public static boolean numPositiveNegativeV2(int a){
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static void stringForNum(String str, int i){
        for (int j = 0; j < i; j++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void array01() {
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 1};
        int[] arrNew = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arrNew[i] = 1;
            } else {
                arrNew[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arrNew));
    }

    public static void array100() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }

}