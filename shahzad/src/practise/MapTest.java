package practise;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapTest {

    Map<Character,List<Integer>> listMap = new HashMap<>();

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        m.put("a",4);  //overwrites the value if putting same key again
        //System.out.println("get(d) : "+m.get("d")); //returns null as key="d" is not in map
        MapTest mt = new MapTest();
        //mt.printUsingKeys(m);
        //mt.printValues(m);
        mt.printUsingEntrySet(m);

        Pair obj1 = new Pair('a',1);
        Pair obj2 = new Pair('b',4);
        Pair obj3 = new Pair('a',2);
        Pair[] array = {obj1,obj2,obj3};
        //mt.createMapOfStringAndList(array);
        mt.createMapOfStringAndListVersion2(array);

    }

    private void createMapOfStringAndListVersion2(Pair[] array) {

        for(int i=0;i< array.length;++i) {
            List<Integer> l = listMap.getOrDefault(array[i].key,new LinkedList<Integer>());
            l.add(array[i].value);
            listMap.put(array[i].key,l);
        }
        print();
    }

    private void print() {
        for(Map.Entry entry : listMap.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
    }

    private void createMapOfStringAndList(Pair[] array) {

        for(int i=0;i< array.length;++i) {
            if(listMap.containsKey(array[i].key)) {
                List<Integer> l = listMap.get(array[i].key);
                l.add(array[i].value);
                //listMap.put(array[i].key,l);
            }
            else {
                List<Integer> l = new LinkedList<>();
                l.add(array[i].value);
                listMap.put(array[i].key,l);
            }
        }
        print();
    }

    private void printUsingEntrySet(Map<String, Integer> m) {
        for(Map.Entry entry : m.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
    }

    private void printValues(Map<String, Integer> m) {
        for(Integer value : m.values()){
            System.out.println(" value: "+value);
        }
    }

    private void printUsingKeys(Map<String, Integer> m) {
        for(String key: m.keySet()) {
            System.out.println("key: "+key+" value: "+m.get(key));
        }
    }
}

class Pair {
    char key;
    int value;

    Pair(char key, int value) {
        this.key= key;
        this.value = value;
    }
}