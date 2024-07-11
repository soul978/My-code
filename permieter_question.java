import java.util.Scanner;

public class permieter_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : "); 
        int length = sc.nextInt();
        System.out.println("enter the breath of the rectangle : ");
        int breath = sc.nextInt();
         
        int area = length*breath;
        int perimeter = 2*(length+breath);

        System.out.println("area "+area);
        System.out.println("perimeters : "+perimeter);
        

        if (area>perimeter) {
            System.out.println("area is grater than its permimeters : ");

        }
        else if (area<perimeter){
            System.out.println("perimeter is grater tha  its areas  ");
        }
        else
        {
            System.out.println("perimeter and area are the same ");
        }
    }
}
