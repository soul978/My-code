import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
        char sole = sc.next().charAt(0);
        System.out.println("the charcter is : "+sole);
    }
}
