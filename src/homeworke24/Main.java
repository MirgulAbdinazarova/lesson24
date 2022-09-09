package homeworke24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer>hashSet1=new HashSet<>(Arrays.asList(1,2,3));
        System.out.println("First hashSet:"+hashSet1);
        HashSet<Integer>hashSet2=new HashSet<>(Arrays.asList(0,1,2));
        System.out.println("Second hashset:"+hashSet2);

        System.out.println(symmetricDifference(hashSet1, hashSet2));

    }
    public  static Set<Integer>symmetricDifference(Set<Integer>set1,Set<Integer>set2){
          Set<Integer>newSet=new HashSet<>(set1);
          newSet.removeAll(set2);
          set2.removeAll(set1);
           newSet.addAll(set2);

        return newSet;
    }
}
