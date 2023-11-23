import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //Статическое поле
    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {

        byte taskNumber = -1;

        while (taskNumber !=0){

            System.out.println("Введите номер задания от 1 до 5 (0 - для выхода): ");

            taskNumber = scann.nextByte();

            switch (taskNumber){
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                default:
                    System.out.println("Введено некорректный номер задания. Введите номер от 1 до 5 или 0 для выхода");
            }
        }
    }

    static void task1(){

        System.out.printf("Введите величину стороны выводимого квадрата: ");

        byte dimention = scann.nextByte();

        for (int i = 0; i<dimention; i++){
            for(int j=0; j<dimention; j++){
                System.out.printf("*  ");
            }
            System.out.println();
        }
    }

    static void task2(){

        System.out.println("Введите размерность квадрата, границы которого будут выведены: ");

        byte dimention = scann.nextByte();

        for (int i=0; i<dimention; i++){
            for(int j=0; j<dimention; j++){
                if ( (i==0) ||
                        (i==(dimention-1)) ||
                        ( (i!=0) && (i!=(dimention-1)) && ((j==0) || (j==(dimention-1)) ) )){
                    System.out.printf("*  ");
                }else{
                    System.out.print f("   ");
                }
            }
            System.out.println();
        }
    }

    static void task3(){

        System.out.printf("Введите длину и ширину выводимого прямоугольника соответственно (разделитель - пробел): ");

        byte length = scann.nextByte();
        byte width = scann.nextByte();

        for (int i=0; i<length; i++){
            for (int j=0; j<width; j++){
                if ( (i==0) ||
                        (i == (length-1) ||
                                (i!=0) && (i!=(length-1)) && (j == 0)) || (j==(width-1)) ){
                    System.out.printf("* ");
                }else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }

    static void task4(){

        System.out.printf("Введите границы диапазона чисел (разделитель - пробел): ");

        int startNumber = scann.nextInt();
        int endNumber = scann.nextInt();

        if (endNumber < startNumber){
            int tmp = startNumber;
            startNumber = endNumber;
            endNumber = tmp;
        }

        System.out.println("Простые числа диапазоне (если таковые имеются): ");

        for (int i= startNumber; i<= endNumber; i++){
            if (simple(i)){
              System.out.printf(i + "  ");
          }
        }
    }

  static boolean simple(int x){
        if ((x==0) || (x==1)) {
            return true;
        }
        for (int k = 2; k<x; k++){
            if(x % k == 0){
                return false;
            }
        }
        return true;
  }

    static void task5(){

        System.out.printf("Введите границы диапазона (начальное и конечное числа): ");

        int startNumber = scann.nextInt();
        int endNumber   = scann.nextInt();

        for (int i=startNumber; i<= endNumber; i++){
            for (int j=1; j<=10; j++){
                System.out.printf(i + " * " + j + " = " + i*j + "  ");
            }
            System.out.println();
        }

    }

}