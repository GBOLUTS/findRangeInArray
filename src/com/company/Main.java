package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int positionToCheck=0;
        ArrayList<Integer> arr = new ArrayList<Integer> (Arrays.asList(4,6,7,8,10,11,12,13,14,100,101));
        Collections.sort (arr);

        ArrayList<String> sArr = new ArrayList<String>();//Создаём String копию последовательности для изменения
        for (int i =0; i < arr.size(); i++){
            sArr.add(String.valueOf(arr.get(i)));
        }

        while(positionToCheck<sArr.size())
        {positionToCheck=findRanges(sArr,positionToCheck);}


        printBeautifulArray(sArr);
    }
//Методы
    private static void printBeautifulArray(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++)
        {
            if (i > 0){
                System.out.print(",");
                }else{
                    System.out.print("(");
                     }

            System.out.print(arr.get(i));

            if (i == (arr.size() - 1)){
                System.out.println(")");
            }
        }
    }

    private static int findRanges(ArrayList<String> list, int a){
        int range = 1;
        int position = a;
        while ((position<list.size()-1) && (Integer.parseInt(list.get(position))+1==Integer.parseInt(list.get(position+1)))){
            range+=1;
            position+=1;
        }
        if (range < 3) {return a + 1;}
        else{
            String strRange = new String(list.get(a) + "-"+ list.get(a + range-1));
            list.add(a, strRange);/*Вначале вставляем Range, потом удаляем элементы после него, которые попали в него*/
            for (int i = a+1; i < a+range+1;i++){
                list.remove(a+1);

            }
        }
        return a+1;
    }

}
	// write your code here

