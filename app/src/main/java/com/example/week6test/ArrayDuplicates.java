package com.example.week6test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDuplicates {
    static String [][] stringArray;

    public static void main(String [] args){
        stringArray = new String[][]{{"hey", "there", "woah"},
                {"life", "is", "great"}, {"but", "wait", "hey"}};

        getDuplicateCoords();


    }

    public static void getDuplicateCoords(){
        List<String> coords = new ArrayList<>();
        List<String> done = new ArrayList<>();


        for(int i=0; i<stringArray.length;i++){
            for(int j=0; j<stringArray[i].length;j++){
                if(!done.contains(stringArray[i][j])){
                    List<String>returnedList = new ArrayList<>();
                    returnedList = findDuplicates(i, j);
                    if (returnedList != null){
                        for (String string: returnedList) {
                            coords.add(string);
                        }

                    }

                }
                done.add(stringArray[i][j]);
            }
        }

        for (String string:coords) {
            System.out.println(string);
        }

    }

    public static List findDuplicates(int x, int y){
        List<String>returnList = new ArrayList<>();
        for (int i=x; i<stringArray.length; i++){
            for (int j=0;j<stringArray.length;j++){
                if(stringArray[x][y].equals(stringArray[i][j])){
                    returnList.add(new String("(" + i + "," + j + ")"));
                }
            }
        }

        if(returnList.size()>1){
            return returnList;
        }
        else{
            return null;
        }

    }

}
