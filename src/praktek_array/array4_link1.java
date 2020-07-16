/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek_array;

/**
 *
 * @author Fujitsu
 */
public class array4_link1 {
    public static void main(String[] args) {
        int matrikA [][] = {{7,9,5},
                            {1,5,0},
                            {4,1,2}};
        int matrikB [][] = {{5,7,3},
                            {0,4,6},
                            {3,4,5}};
        System.out.println("Matrik A");
        for (int i = 0 ; i < matrikA.length ; i++)
        {
            for (int j= 0 ; j< matrikA[i].length ;j++)
            {
                System.out.print(matrikA [i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Matrik B");
        for(int k = 0 ; k < matrikB.length ; k++)
        {
            for(int l = 0 ; l < matrikB [0].length ; l++)
            {
                System.out.print(matrikB [k] [l] + " ");
            }
            System.out.println();
            
        int matrikC [][] = new int[matrikA.length] [matrikA[0].length];
        System.out.println();
        System.out.println("Hasil Pengurangan");
        System.out.println();
        for (int m = 0; m < matrikC.length; m++) {
            for (int n = 0; n < matrikC[0].length; n++) {
                matrikC[m][n] = matrikA[m] [n] - matrikB [m][n];
                System.out.print(matrikC[m][n] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Hasil Penjumlahan");
        System.out.println();
        for (int m = 0; m < matrikC.length; m++) {
            for (int n = 0; n < matrikC[0].length; n++) {
                matrikC[m][n] = matrikA[m][n] + matrikB [m][n];
                System.out.print(matrikC[m][n] + "\t");
            }
            System.out.println();
        }
    }
}

}
