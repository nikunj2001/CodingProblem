import java.util.Scanner;

public class CodeChef1111Pattern {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int size = (2 * n) - 1;
            int size1 = (2 * n) - 1;
            int x = 1;
            int y = 3;
            int size2 = 2 * n - 2;
            int xx = n - 2;
            while (size > 0) {
                for (int i = 0; i < size; i++) {
                    System.out.print("1");
                }

                System.out.println();
                if (size == 1) {
                    break;
                }
                for (int i = 0; i < x; i++) {
                    System.out.print(" ");
                }
                x++;
                size -= 2;
            }
            while (y <= size1 && size2 > 0) {
                for (int i = 0; i < xx; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < y; i++) {
                    System.out.print(1);
                }

                System.out.println();
                xx -= 1;

                y += 2;
            }


        }
    }
}