import java.util.Scanner;

public class Medium {
    private int ScannerInt()  {
        int num = 0;
        Scanner in = new Scanner(System.in);
        if(in.hasNextInt()) {
            num = in.nextInt();
        }
        in.close();
        return  num;
    }
    public void Multiplication(int numMulti) {
        System.out.printf("Введите число, для умножение на %d: \n", numMulti);
        int firstNum = ScannerInt();
        System.out.printf("Ваш результат: %d\n", numMulti * firstNum);
    }
    public void Multiplication(int numMultiInt, double numMultiDouble) {
        double sumMulti = numMultiInt*numMultiDouble;
        System.out.printf("Введите число, для умножение на %f: \n", sumMulti);
        int firstNum = ScannerInt();
        System.out.printf("Ваш результат: %f\n", sumMulti * firstNum);
    }
    public void Multiplication(int firstNumMulti, int secondNumMulti, int numDivision) {
        int sumMulti = firstNumMulti*secondNumMulti;
        System.out.printf("Введите число, для умножение на %d: \n", sumMulti);
        int firstNum = ScannerInt();
        System.out.printf("Ваш результат: %d\n", sumMulti * firstNum);
        if(numDivision == 0)
            numDivision = 1;
        System.out.printf("Результат деления на %d: %d",numDivision, sumMulti * firstNum / numDivision);
    }
}
