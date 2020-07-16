/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek_array;

import static javafx.beans.binding.Bindings.length;
/**
 *
 * @author Fujitsu
 */
public class array3_link2 {
    public static void main(String[] args) {
        String [][] kontak = {{"Lala","08111"},{"Lili","08122"},{"Lulu","08133"}};
        
        for (int x=0; x < kontak. length; x++){
            System.out.println("Nama: " + kontak[x][0]);
            System.out.println("Nomor:" + kontak[x][1]);
            System.out.println("--------------------------");
        }
    }

}
