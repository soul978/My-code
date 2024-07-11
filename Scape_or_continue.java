
public class Scape_or_continue {
public static void main(String[] args) {
    int a = 1;
   labels:  while(a<=50){
        if (a%3==0) {
          a++;
            continue labels;
           
        }
        System.out.println(a);
       
       a++;
    }
}
    
}