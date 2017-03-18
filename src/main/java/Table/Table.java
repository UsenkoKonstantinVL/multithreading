package Table;

import javafx.scene.control.Tab;

import java.util.HashMap;

/**
 * Created by toshiba on 14.03.2017.
 */
public class Table {
    HashMap<String, Integer> map;

    public Table(){
        map = new HashMap<>();
    }

    synchronized public void put(String str, Integer num){
        if(map.containsKey(str))
        {
            return;
        }

        map.put(str, num);
    }

    synchronized public String get(){

        if(map.size() == 0)
        {
            return null;
        }

        String res = getMin();
        map.remove(res);
        return  res;
    }

    private String getMin(){
        String strMin = "";
        Integer intMin = 0;

        for (String s:
             map.keySet()) {
            if(strMin == ""){
                strMin = s;
                intMin = map.get(s);
            }
            else {
                if(intMin > map.get(s)){
                    intMin = map.get(s);
                    strMin = s;
                }
            }
        }

        return strMin;
    }
}
