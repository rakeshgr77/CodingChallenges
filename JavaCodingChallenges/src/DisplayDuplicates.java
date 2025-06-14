import java.util.HashSet;
import java.util.Set;

public class DisplayDuplicates {
    public static void main(String[] args) {
        String str="chop is chop   Rakesh chop is Banglore";
        displayDuplicates(str);
    }

    public static void displayDuplicates(String str){
        Set<String> duplicates = new HashSet<>();
        String[] newStr=str.toLowerCase().split("\\s+"); //split by one or more spaces

        //Use Set
        Set<String> set=new HashSet<>();
        for(String s:newStr){
            if(!set.add(s)){
                duplicates.add(s);
            }
        }
        System.out.println(duplicates);
    }

    /* Interviwer might give just simple String
       Or Integer array use same logic and achive the result
     */
}
