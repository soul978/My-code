import java.util.Scanner;

public class squre_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("enter the breath : ");
        int breath = sc.nextInt();
        if (length == breath) {
            System.out.println("yes it is squire ");
        }
        else{
            System.out.println("not a squire : ");
        }
    }
}
