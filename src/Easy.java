import java.util.Scanner;

public class Easy {
    public void SumRes(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = in.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = in.nextInt();
        in.close();
        int res = firstNum + secondNum;
        System.out.printf("Сумма первого числа %d и второго числа %d равна %d", firstNum, secondNum, res);
    }
}
