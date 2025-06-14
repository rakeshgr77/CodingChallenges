import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Helloh";
        NonRepeatingCharter(str);
    }

    public static void NonRepeatingCharter(String str){

        //convert String to Lowercase to handle upper and Lowercase
        //Remove All spaces using "\\s+" --> this removes all the trailing and ending spaces
        //Convert the string to string array using split

        String strArray[] = str.toLowerCase().replaceAll("\\s+","").split("");

        //Use Linked HashMap to maintain Insertion Order
        HashMap<String,Integer> mapCount = new LinkedHashMap<>();
        for(String s:strArray){
            mapCount.put(s,mapCount.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer> map: mapCount.entrySet()){
            if(map.getValue()==1){
                System.out.println(map.getKey() + " "+map.getValue());
                break;
            }
        }

        //we can use streams to impress
        mapCount.entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .limit(1)
                .forEach(System.out::println);

    }
}
