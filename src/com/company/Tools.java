package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Gboluts on 24.09.2017.
 */
public class Tools {


//
//    static int findNextInteger(BufferedReader reader) throws IOException {
//        reader.readLine();
//    }

    static ArrayList<String> createStringCopyArray(ArrayList<Integer> array) {
        ArrayList<String> sArr = new ArrayList<String>();//Создаём String копию последовательности для изменения
        for (int i = 0; i < array.size(); i++){
            sArr.add(String.valueOf(array.get(i)));
        }
        return sArr;
    }

   private static void findRanges(ArrayList<String> list, int a){//Проверяет первые элементы массива, пока не закончится Range
        int range = 1;
        int position = a;
        while ((position<list.size()-1) && (Integer.parseInt(list.get(position))+1==Integer.parseInt(list.get(position+1)))){
            range+=1;
            position+=1;
        }
        if (range < 3) {}
        else{
            String strRange = new String(list.get(a) + "-"+ list.get(a + range-1));
            list.add(a, strRange);/*Вначале вставляем Range, потом удаляем элементы после него, которые попали в него*/
            for (int i = a+1; i < a+range+1;i++){
                list.remove(a+1);

            }
        }
    }

    static void findAllRanges(ArrayList<String> array) {
        int positionToCheck=0;
        while(positionToCheck< array.size())
        {
            findRanges(array,positionToCheck);
            positionToCheck++;
        }
    }

    static void printBeautifulArray(ArrayList<String> arr) {
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

}
