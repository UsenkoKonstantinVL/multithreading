package Table;

import java.util.HashMap;

/**
 * Таблица для хранения значений
 */
public class Table {

    private HashMap<String, Integer> map;

    public Table(){
        map = new HashMap<>();
    }

    /***
     * Функция добавления к таблице
     * @param str ключ значения
     * @param num само значение
     */
    synchronized public void put(String str, Integer num){
        if(map.containsKey(str))
        {
            return;
        }

        map.put(str, num);
    }

    /***
     * Функция для вывода самого минимального значения в таблице
     * @return Минимальное значение таблици в виде строки(буквенное представление)
     */
    synchronized public String get(){

        if(map.size() == 0)
        {
            return null;
        }

        String res = getMin();
        map.remove(res);
        return  res;
    }

    /***
     * Функция, которая определяет минимальное значение в таблице
     * @return строка минимального значения
     */
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
