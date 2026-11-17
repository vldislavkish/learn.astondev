public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к Лекции 2.2\n");
        printThreeWords();
        checkSumSign();
        compareNumbers();
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

}