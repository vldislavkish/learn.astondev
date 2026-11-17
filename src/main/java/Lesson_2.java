public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к Лекции 2.2\n");

        checkSum1020(15, 35);
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



}