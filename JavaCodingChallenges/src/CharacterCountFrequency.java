import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharacterCountFrequency {
    public static void main(String[] args) {
        String str = "Helloh";
        countCharacterFrequency(str);
    }

    public static void countCharacterFrequency(String str){

        //convert String to Lowercase to handle upper and Lowercase
        //Remove All spaces using "\\s+" --> this removes all the trailing and ending spaces
        //Convert the string to string array using split

        String strArray[] = str.toLowerCase().replaceAll("\\s+","").split("");

        //Use Linked HashMap to maintain Insertion Order
        HashMap<String,Integer> mapCount = new LinkedHashMap<>();
        for(String s:strArray){
            mapCount.put(s,mapCount.getOrDefault(s,0)+1);
        }
        System.out.println(mapCount);

    }
}
