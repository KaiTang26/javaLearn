package com.Exec1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {1, 4, 3};

        int [] b = {2, 0, 6};

        int [] m = Merges(a,b);


        for(int i = 0; i<m.length; i++){

            System.out.println(m[i]);
        }

    }

    public static int[] Merges(int[] a, int[] b){

        int len = a.length + b.length;

        int [] z = new int[len];

        System.arraycopy(a, 0, z, 0, a.length);

        System.arraycopy(b, 0, z, a.length, b.length);

        Arrays.sort(z);

        return z;

    }
}
