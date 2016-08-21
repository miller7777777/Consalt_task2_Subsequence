package com.consalt.subsequence;

/*
Заданы две последовательности X1, X2,..., Xn и Y1, Y2,..., Yk произвольных элементов  (java.lang.Object).   Определить,  можно  ли  получить последовательность X путем вычеркивания некоторых элементов из Y? В качестве входных параметра в метод передаются два списка: первый – список Xi, второй – список Yi.

 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> listX;
        ArrayList<Object> listY;

        listX = new ArrayList<Object>();
        listY = new ArrayList<Object>();


        //Пример заполнения листа X
        listX.add("Васька");
        listX.add("Рыжик");
        listX.add("Мурка");
        listX.add(5);
        listX.add(7);
        listX.add("Черныш");
        listX.add("77");
        listX.add(77);
        listX.add(66);


        //Пример заполнения листа Y
        listY.add("Фантик");
        listY.add("Лунтик");
        listY.add("Васька");
        listY.add("Бобер");
        listY.add("Рыжик");
        listY.add("32");
        listY.add(32);
        listY.add("Мурка");
        listY.add(2);
        listY.add(5);
        listY.add("5");
        listY.add("7");
        listY.add(7);
        listY.add("Черныш");
        listY.add("22");
        listY.add(22);
        listY.add(7);
        listY.add("77");
        listY.add("Барсик");
        listY.add(77);
        listY.add(66);

        boolean result = isSubsequence(listX, listY);  //сравниваем списки
        System.out.println(result);
    }



    //Метод сравнивает листы X и Y. Если лист X можно получить вычеркиванием некоторых элементов листа Y, возвращается true, иначе false
    private static boolean isSubsequence(List<Object> list1, List<Object> list2){

        int i = 0;
        int j = 0;
        int checkSum = 0;
        while (i < list1.size()){
            if(j == list2.size()){
                break;
            }
            if (list1.get(i).equals(list2.get(j))){
                checkSum++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        if(checkSum == list1.size()){
            return true;
        }else {
            return false;
        }


    }
}
