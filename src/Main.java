import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Product> maps=new HashMap<>();
        maps.put(24,new Product("constructor"));
        maps.put(4,new Product("ball"));
        maps.put(0,new Product("soft toy"));
        maps.put(3,new Product("toy soldiers"));
        for (Map.Entry<Integer,Product>entry:maps.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println("\n");
        maps.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Product>comparingByValue())
                .forEach(System.out::println);

        System.out.println(maps.keySet()+"\n");
        System.out.println();
        System.out.println(maps.entrySet()+"\n");








    }
}