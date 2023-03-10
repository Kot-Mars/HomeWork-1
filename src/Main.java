import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Выберите команду:\n 1 - Easy\n 2 - Medium\n 3 - Hard");
        if(num.hasNextInt()) {
            switch (num.nextInt()) {
                case 1:
                    //Easy
                    Easy easy = new Easy();
                    easy.SumRes();
                    break;
                case 2:
                    //Medium
                    Medium medium = new Medium();
                    medium.Multiplication(2);
                    medium.Multiplication(5, 2.5);
                    medium.Multiplication(2, 5, 2 );
                    break;
                case 3:
                    //Hard
                    Hard hard = new Hard();
                    hard.RandomNum(0);
                    break;
                default:
                    System.out.println("Непонял команду! Повторите попытку");
                    break;
            }
        }
        else {
            System.out.println("Ошибка! Введите число!");
        }
    }
}