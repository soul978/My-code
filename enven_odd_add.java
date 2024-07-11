import java.util.Scanner;

public class enven_odd_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers : ");
        int sole = sc.nextInt();
        int even = 0;
        // int odd = 0;
        for (int i = 1; i <= sole; i++) {
            if (i % 2 == 0) {
                even -= i;
            } else {
                even += i;
            }
        }
        System.out.println("ans = " + even);
    }
}
