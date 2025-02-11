package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CountingCards {
    public static List<Integer> shuffle(List<Integer> array)
    {
        List<Integer> newArr = new ArrayList<>();
        int n = array.size();
        Random rand = new Random();

        while(n > 0){
            int i = rand.nextInt(array.size());
            if(i < array.size()){
                newArr.add(array.get(i));
                array.remove(i);
                n--;
            }
        }
        return newArr;
    }

    public static List<Integer> shuffleBetter(List<Integer> array)
    {
        List<Integer> newArr = new ArrayList<>();
        int n = array.size();
        Random rand = new Random();

        while(n > 0){
            int i = rand.nextInt(n--);
            newArr.add(array.remove(i));
        }
        return newArr;
    }

    public static List<Integer> shuffleBest(List<Integer> array)
    {
        int m = array.size();
        Random rand = new Random();
        int t, i;

        while(m > 0){
            i = rand.nextInt(m--);
            t = array.get(m);
            array.set(m, array.get(i));
            array.set(i, t);
        }
        return array;
    }
}