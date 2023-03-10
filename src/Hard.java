import java.util.Random;
import java.util.Scanner;

public class Hard {
    final Random random = new Random();

    public void RandomNum(int min) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите верхнюю границу рандома: ");
        if(in.hasNextInt()) {
            int max = in.nextInt();
            int rand = random.nextInt(min, max);
            System.out.printf("Случайное число: %d", rand);
        }
        else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
        in.close();
    }
}
