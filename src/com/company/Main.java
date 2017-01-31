package com.company;

public class Main {

    public static void main(String[] args) {

        int [] arr = {-3,2,-1,1,-2,-3};
        int i = 0, j = arr.length-1;
        while (i < j)
        {
            if (arr[i] < 0)
                i++;
            else if(arr[j] > 0)
                j--;
            else
            {
                int temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }


    }
}
