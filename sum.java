import java.util.Scanner;

public class sum {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first numbers ");
        int a = sc.nextInt();
        System.out.println("enter the second numbers :");
        int b = sc.nextInt();
        add(a, b);
    }
}
