package com.company;

public class zad3 {



    static int searchIndex(int[] array, int value) {
        var index = 0;
        var limit = array.length - 1;
        while (index <= limit) {
            int point = (int) Math.ceil((index + limit) / 2);
            double entry = array[point];
            if (value > entry) {
                index = point + 1;
                continue;
            }
            if (value < entry) {
                limit = point - 1;
                continue;
            }
            return point; // value == entry
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};


        int index = searchIndex(arr, 11);

        System.out.println(index);


    }
}
