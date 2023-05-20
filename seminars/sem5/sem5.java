import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import javax.swing.text.html.HTMLDocument.Iterator;

public class sem5{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("пять","five");
        map.put("два","two");
        map.put("один","one");

        System.out.println(map.get("пять"));

        map.remove("пять"); //вернет five
        map.put("пять","five");  // если ключ "пять" уже есть - то изменит значение
        map.remove("пять", "five"); //вернет true or false
        System.out.println(map.get("пять"));

        //итерация
        map.keySet(); // возращает список всех ключей
        for(String key: map.keySet()){  //foreach
            System.out.println(map.get(key));
        }  //при for each не можем  удалить

        // 1.05.00 lect // можем удалять
        // Iterator<String> iterator = map.keySet().iterator();
        // while(iterator.hasNext){
        //     String key  = iterator.next();
        //     System.out.println(map.get(key));
        // }

        // можно удалить, нельзя изменить
        Set keys = map.keySet();  
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(map.get(keys.toArray()[i]));
        }

        map.values(); // возращает коллекцию всех значений
        map.entrySet(); // пара ключ - значение
        map.replace(null, null, null); // замена // null верннет если нет ключа инвче true
        map.getOrDefault(keys, null); // пытается взять ключ keys. если не находит - возврат default
        map.containsKey("шесть"); // существует ли ключ
        map.containsValue("5"); // существует ли значение
        map.putIfAbsent("шесть", "six" ); //если значения нет то запишет. Если значение есть - то вернет null и ничего не сделает
        map.put("пять","five");  // если ключ "пять" уже есть - то изменит значение
        
        map.forEach((a,b)-> System.out.println(a + " " + b)); // перебор for each// позволяет использовать но не менять
        
        map.compute("шесть",(k,v) -> v+"!"); //изменяет значение переменной
        //map.computeIfPresent(null, null); // compute - с защитой
        //map.computeIfAbsent(null, null);
        //передаем ключ, - возращает пару ключ-значение(k,v), со  значением чтото можем делать
        System.out.println(map);

        for(String key: map.keySet()){ // перебор по всем ключам 
            map.compute(key, (k,v) -> "~"+v); // ко всем значения добавляем ~ в начале
            map.merge(key, ".", String::concat); //добавляем "." к уже имеющиммся значениям.
        }
        System.out.println(map);

        //map.putAll(map); // в новый словарь кладем все элементы из другого map
        //map.merge(null, null, null) - объединение?
        map.merge("один", "1", String::concat ); //ключ, "значение", тут лямбда, либо ссылка на метод что делать с уже имющимся значением + то что передали в "значение"
        // можно многострочную лямбда.... но тогда оборачиваем в {} и добавляем return

        //Если важно, чтобы хранились в том же порядке, как мы и вводили.... а так то же самое почти
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("пять","five");
        hashMap.put("два","two");
        hashMap.put("один","one");
        System.out.println(hashMap);

        // хранит в виде дерева. Скорость чтения значительно выше чем у hashmap - поиск по дереву, а не перебором
        // но удаление элеменнтов сложна. - заново всю послежовательность пересчитать (у каждого узла только два последователя)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"five");
        treeMap.put(2,"two");
        treeMap.put(1,"one");
        treeMap.put(6,"six");
        System.out.println(treeMap); // отсортированы по ключу - особенность дерева
        System.out.println(treeMap.headMap(4, true)); // от головы  часть словаря
        System.out.println(treeMap.tailMap(4, true)); //от хвоста

        //при создании можно сразу компаратор внедрить /// какаято ошибка
        // TreeMap <Integer, String> treeMap2 = new TreeMap<>(new Comparator<Integer>() {
        //     public int compare(Integer o1, Integer o2){
        //         return o2-o1;
        //     }
        // });

    }   
}