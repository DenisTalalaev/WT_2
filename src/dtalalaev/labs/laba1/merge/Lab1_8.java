package dtalalaev.labs.laba1.merge;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab1_8 {

    public static ArrayList<Integer> findMergeIndexes(ArrayList<Integer>  arr1, ArrayList<Integer>  arr2){
        if(arr2.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<Integer> indexes = new ArrayList<>();
        int i = 0;
        int j = 0;
        while( i < arr1.size() && j < arr2.size()) {
            if(arr1.get(i) <= arr2.get(j)) {
                i++;
            } else {
                indexes.add(i); j++;
            }
        }
        while (j < arr2.size()) {
            indexes.add(i);
            j++;
        }
        return indexes;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(4);

        b.add(2);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(5);
        b.add(6);
        b.add(7);
        System.out.println(Arrays.toString(findMergeIndexes(a, b).toArray()));

    }
}
