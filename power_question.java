import java.util.Scanner;

public class power_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number number : ");
        int num_1 = sc.nextInt();
        System.out.println("Enter the power  : ");
        int power_1= sc.nextInt();
        int ans = 1;
        for (int i = 1; i<=power_1; i++) {
            ans *=num_1;
        }
        System.out.println("Resultants : "+ans);
    }
}
