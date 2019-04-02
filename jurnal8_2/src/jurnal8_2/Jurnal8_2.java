/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8_2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Jurnal8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.print("Masukkan angka: ");
        Scanner sc = new Scanner(System.in); 
        int i; 
        int n = sc.nextInt(); 
 
        for (i = 0; i < (2 * n) + 1; i++) { 
 
            for (int j = 0; j < (2 * n) + 1; j++) { 
 
                if (i < n) { 
                    if ((j > n - i) && (j < n + i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print(" "); 
                    } 
                } else { 
 
                    if ((j > i - n) && (j < 3*n-i)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print(" "); 
                    } 
                } 
            }
            System.out.println(); 
        } 
     
    }
}
