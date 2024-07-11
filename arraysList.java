import java.util.ArrayList;
import java.util.Collections;
public class arraysList {

     public static void main(String[] args) {
          // for (int i = 0; i <l1.size(); i++) {  //! print the arrays list : 
          //      System.out.print(l1.get(i)+" ");
          // }

          //! its store only the integers value ;
          ArrayList<Integer>l1 = new ArrayList<>();
          l1.add(1);l1.add(2);l1.add(3);l1.add(4);l1.add(5);l1.add(6);l1.add(7);l1.add(4);l1.add(2);l1.add(9);

          System.out.println(l1);

          //! update the value 
          l1.add(0,100);
          System.out.println(l1);

          //! remove the elemets by index 
          l1.remove(0);
          System.out.println(l1);

          //! remove the elements 
          // l1.remove(Integer.valueOf(9));

          //! its given true or false value
          System.out.println(l1.remove(Integer.valueOf(9)));
          System.out.println(l1);
          
          //! its show the elements are present in the Arrayslist or not : 
          boolean ans = l1.contains(Integer.valueOf(55));
          System.out.println(ans);

          //! its help to reverse the arraysList
          Collections.reverse(l1);
          System.out.println(l1);
          
          //!its help to sort the arraysList ;

          Collections.sort(l1);
          System.out.println(l1);
          
          Collections.sort(l1,Collections.reverseOrder());
          System.out.println(l1);

          
     }
}
