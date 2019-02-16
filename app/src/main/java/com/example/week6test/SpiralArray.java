package com.example.week6test;

public class SpiralArray {
    static int [][] beforeSpiral;

    public static void main(String [] args){
        beforeSpiral = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12,}, {13,14,15,16}};

        toSpiral();

    }

    public static void toSpiral(){
        int m = beforeSpiral.length;
        int n = beforeSpiral[0].length;
        int i, k = 0, l = 0;

        while (k < m && l < n)
        {

            for (i = l; i < n; ++i)
            {
                System.out.print(beforeSpiral[k][i]+" ");
            }
            k++;

            for (i = k; i < m; ++i)
            {
                System.out.print(beforeSpiral[i][n-1]+" ");
            }
            n--;

            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(beforeSpiral[m-1][i]+" ");
                }
                m--;
            }

            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(beforeSpiral[i][l]+" ");
                }
                l++;
            }
        }
    }

}
