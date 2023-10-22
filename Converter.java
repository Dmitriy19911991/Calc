import java.util.TreeMap;

public class Converter {
    TreeMap<Character, Integer> romankeyMap = new TreeMap<>();

    public Converter(){
        romankeyMap.put('I', 1);
        romankeyMap.put('V', 5);
        romankeyMap.put('X', 10);
        romankeyMap.put('L', 50);
        romankeyMap.put('C', 100);
        romankeyMap.put('D', 500);
        romankeyMap.put('M', 1000);
    }


    public boolean isRoman(String number){
        return romankeyMap.containsKey(number.charAt(0));
    }
}
