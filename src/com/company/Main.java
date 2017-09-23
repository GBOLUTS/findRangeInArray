package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer> (Arrays.asList(5,6,7,8));
        Collections.sort (arr);

        ArrayList<String> sarr = new ArrayList<String>();
        for (int i =0; i < arr.size(); i++){
            sarr.add(String.valueOf(arr.get(i)));
        }

        findRanges(sarr,0);

        for (int i =0; i < sarr.size(); i++)
        {
            System.out.println(sarr.get(i));
        }
    }

    public static int findRanges(ArrayList<String> list, int a){
        int range = 1;
        int position = a;
        while ((position<list.size()-1) && (Integer.parseInt(list.get(position))+1==Integer.parseInt(list.get(position+1)))){
            range+=1;
            position+=1;
        }
        if (range < 3) {return a + 1;}
        else{
            String strRange = new String(list.get(a) + "-"+ list.get(a + range));
            list.add(a, strRange);/*Вначале вставляем Range, потом удаляем элементы после него, которые попали в него*/
            for (int i = a+1; i < a+range+1;i++){
                list.remove(a+1);

            }
        }
        return a+1;
    }

}
	// write your code here

