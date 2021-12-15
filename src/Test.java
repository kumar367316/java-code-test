import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        // HashMap with Country as key and capital as value
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("India","Delhi");
        map.put("Japan","Tokyo");
// Iterating java iterator
        System.out.println("Iterating java Iterator");
        Iterator<String> countryKeySetIterator=map.keySet().iterator();
        while(countryKeySetIterator.hasNext()) {
            String countryKey = countryKeySetIterator.next();
            map.put("Nepal", "KathMandu");
            System.out.println(countryKey);
        }


        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
