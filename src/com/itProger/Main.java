package com.itProger;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){
	int array [] = new int[20];
	Random random = new Random();
        int maxNegative = 0;
        int minPositive = 0;

	for (int i=0; i<array.length; i++) {

        array[i] = (random.nextInt(20) - 10);
        }
	     System.out.println("Первоначальный массив: " + Arrays.toString(array));
	for (int j =0; j<array.length; j++){
	    if(array[j]<0){
	        if (array[j]<array[maxNegative]){
	        maxNegative = j;
        }
	        else if (array[maxNegative]>= 0){
            maxNegative = j;
        }
        }
	    else if (array[j]>0){
	        if (array[j]<array[minPositive]){
	            minPositive = j;
	        }
	        else if (array[minPositive]<=0){
	            minPositive = j;
            }
        }
        }
        int x = array[maxNegative];
        array[maxNegative] = array[minPositive];
        array[minPositive]= x;
        System.out.println("Финальный массив: " + Arrays.toString(array));
        System.out.println("Местами поменяли числа " + array[minPositive] + " и " + array[maxNegative]);

    }

}


