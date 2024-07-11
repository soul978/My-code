import java.util.Scanner;

public class gratest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numbers : ");
        int num_1 = sc.nextInt();
        System.out.println("enter the second numbers : ");
        int num_2 = sc.nextInt();
        System.out.println("enter the third numbers : ");
        int num_3 = sc.nextInt();
        if (num_1>num_2) {
            System.out.println(num_1+" is grater numbers ");
        }
        else if(num_2>num_3){
            System.out.println(num_2+" is grater numbers ");
        }
        else{
            System.out.println(num_3+" is grater numbers ");
        }
    }
}
