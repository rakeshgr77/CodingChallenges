import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashmapMapEntry {

    //This is Just Exmple programme on how to use Map.Entry to Iterrate through HashMap
    //Good to know

    public static void main(String[] args) {
        String str = "RakeshGR";
        String strArray[] = str.toLowerCase().replaceAll("\\s+","").split("");

        //Use Linked HashMap to maintain Insertion Order
        HashMap<String,Integer> mapCount = new LinkedHashMap<>();
        for(String s:strArray){
            mapCount.put(s,mapCount.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer> map: mapCount.entrySet()){
            System.out.println(map.getKey() + " "+map.getValue());
        }
    }
}
