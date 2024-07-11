import java.util.Scanner;

public class side_triangle {
    static void traingle(int a,int b,int c){
    
            if ((a+b)>c && (b+c)>a && (a+c)>b) {
                System.out.println("valid traingle");
            }
            else{
                System.out.println("invalid traingle ");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first numbers : ");
        int a = sc.nextInt();
        System.out.print("entert the second numbers : ");
        int b = sc.nextInt();
        System.out.println("enter the third numbers : ");
        int c= sc.nextInt();
        traingle(a, b, c);
    }
}
