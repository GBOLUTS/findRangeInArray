package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer> (Arrays.asList(4,6,7,8,10,11,12,13,14,100,101));
        Collections.sort (arr);
        ArrayList<String> sArr = Tools.createStringCopyArray(arr);
        Tools.findAllRanges(sArr);
        Tools.printBeautifulArray(sArr);
    }
}


