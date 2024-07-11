import java.util.ArrayList;

public class sequence {
     static ArrayList<String> ssequence(String ss){//abc
          ArrayList<String> ans  = new ArrayList<>();

          if (ss.length()==0) {
               ans.add("");
               return ans;
          }


          char ch = ss.charAt(0);

          ArrayList<String> smallans = ssequence(ss.substring(1));
          for (String sss : smallans) {
               ans.add(sss);
               ans.add(ch+sss);
          }
          return ans;
     }
     public static void main(String[] args) {
          String a = "abc";
          ArrayList<String> ans = ssequence(a);
          for (String sole : ans) {
               System.out.println(sole);
          }
     }
     
     
}