/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07032018;


import java.util.*;
public class Ex66 {
    public static void main(String[] args)
 {
    int sum = 1;
	 int ctr = 0; 
	 int n = 0; 
    	
		while (ctr < 100) {
			n++; 
			if (n % 2 != 0) { 
			// check if the number is even
				if (is_Prime(n)) {
					sum += n; 
					ctr++; 
				}
			}	
		}
		System.out.println("\nSum of the first 100 prime numbers: "+sum); 	
	 }
	
   	public static boolean is_Prime(int n) {
		for (int i = 3; i * i <= n; i+= 2) {
			if (n % i == 0) {
				return false; 
			}
		}
		return true;
	}
}
