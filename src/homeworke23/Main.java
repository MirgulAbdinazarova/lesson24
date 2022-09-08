package homeworke23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        ArrayList<Integer> arr1=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            arr1.add(i, random.nextInt(2));
            linkedList.add(i, random.nextInt(2));

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr1);
        System.out.println(linkedList);

        sort(arr);
        sort(arr1);
        sort(linkedList);

    }

    public static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("After sorting:"+ Arrays.toString(arr));
    }
    public static void sort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println("After sorting:"+arrayList);
    }
    public static void sort(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        System.out.println("After sorting:"+linkedList);
    }
}
