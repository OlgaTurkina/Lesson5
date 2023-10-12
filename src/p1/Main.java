public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = x < y ? x + y : x - y;
        System.out.println(z);

        int i;
        for(i = 1; i < 10; ++i) {
            System.out.println("Hello");
        }

        for(i = 1; i < 10; ++i) {
            System.out.println("" + i + " " + i * i);
        }

        System.out.println(i);
        System.out.println("----------");
        int n = 10;
        int m = 0;

        int x1;
        for(x1 = n - 1; m < x1; --x1) {
            System.out.println(m * x1);
            ++m;
        }

        System.out.println("__________");

        for(m = 10; m > 0; --m) {
            System.out.println(m);
        }

        x1 = 0;

        do {
            System.out.println("Hello");
            ++x1;
        } while(x1 != 5);

        int z1 = 7;

        do {
            System.out.println(z1);
            --z1;
        } while(z1 > 0);

        z1 = -1;

        do {
            System.out.println(z1);
            --z1;
        } while(z1 > 0);

        for(int w = 0; w < 10; ++w) {
            if (w != 5) {
                System.out.println(w);
            }
        }

    }
}