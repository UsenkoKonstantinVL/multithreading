package NumberTranslator;

import java.util.HashMap;

/**
 * Created by toshiba on 14.03.2017.
 */
public class NumberTranslater {
    private HashMap<String, Integer> numberMap;
    private HashMap<String, Integer> degreeMap;

    public NumberTranslater(){
        numberMap = new HashMap<>();
        degreeMap = new HashMap<>();
        initializeNumberMap();
        initializeDegreeMap();
    }

    public int getNumber(String number) throws Exception{
        int res = 0;

        String strArr[] = number.split(" ");
        res = convertStrintToNumber(strArr);

        return res;
    }

    private int convertStrintToNumber(String[] strMass) throws Exception{

        int res = 0;

        for(int i  = strMass.length - 1; i != -1; i--){
           if(degreeMap.containsKey(strMass[i].toLowerCase())){
               if(i != -1 && numberMap.containsKey(strMass[i - 1].toLowerCase())){
                  res  += degreeMap.get(strMass[i]) * numberMap.get(strMass[i - 1]);
                  i--;
               }
           }
           else if(numberMap.containsKey(strMass[i].toLowerCase())){
               res += numberMap.get(strMass[i]);
           }
           else {
                throw new NumberException(strMass[i]);
           }
        }

        return  res ;
    }

    public class NumberException extends Exception{

        public NumberException(String res){
            super("Error in word: " + res);
        }
    }

    private void initializeNumberMap(){
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        numberMap.put("ten", 10);
        numberMap.put("eleven", 11);
        numberMap.put("twelve", 12);
        numberMap.put("thirteen", 13);
        numberMap.put("fourteen", 14);
        numberMap.put("fifteen", 15);
        numberMap.put("sixteen", 16);
        numberMap.put("seventeen", 17);
        numberMap.put("eighteen", 18);
        numberMap.put("nineteen", 19);
        numberMap.put("twenty", 20);

        numberMap.put("thirty", 30);
        numberMap.put("forty", 40);
        numberMap.put("fifty", 50);
        numberMap.put("sixty", 60);
        numberMap.put("seventy", 70);
        numberMap.put("eighty", 80);
        numberMap.put("ninety", 90);

    }

    private void initializeDegreeMap(){
        degreeMap.put("hundred", 100);
        degreeMap.put("thousand", 1000);
    }
}
