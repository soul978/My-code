import java.util.Scanner;

public class not_divisible {
    static void check_numbers(int a) {
        if (a % 5 == 0 || a % 3 == 0) {
            if (a % 15 != 0) {
                System.out.println(a + " is divisible by 5 or 3 but not divisible by 15 ");
            }
            else{
                System.out.println("not match the required condition ");
            }
        } 
        else {
            System.out.println("not divisible ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first numbers : ");
        int a = sc.nextInt();
        check_numbers(a);

    }
}
