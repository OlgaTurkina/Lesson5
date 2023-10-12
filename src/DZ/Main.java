package DZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s = 1;
        while (true){
            System.out.println("Hello! It`s a calc");
            Scanner calc = new Scanner(System.in);
            System.out.println("Input x - first number");
            int x = calc.nextInt();
            System.out.println("Input y - second number");
            int y = calc.nextInt();
            System.out.println("Input ~1~, if +, ~2~, if -, ~3~, if *, ~4~, if /");
            int j = calc.nextInt();
            System.out.printf("x = %d, y = %d, j = %d \n", x, y, j);

            int a = x + y;
            int b = x - y;
            int c = x * y;
            double d = (double) x / y;

            switch (j) {
                case 1:
                    System.out.printf("x+y = %d \n", a);
                    break;
                case 2:
                    System.out.printf("x-y = %d \n", b);
                    break;
                case 3:
                    System.out.printf("x*y = %d \n", c);
                    break;
                case 4:
                    System.out.printf("x/y = %.2f \n", d);
                    break;
                default:
                    System.out.printf("Error \n");
            }
            //System.out.println("Bye");
            //calc.close();
            s++;
            if (s == 5) break;
        }
    }
}
