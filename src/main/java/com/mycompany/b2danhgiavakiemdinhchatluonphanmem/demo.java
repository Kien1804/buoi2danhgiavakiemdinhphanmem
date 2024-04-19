/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.b2danhgiavakiemdinhchatluonphanmem;

/**
 *
 * @author cyeng
 */
public class demo {
    public static void main(String args[]) {
        int[] a = {2, 3, 5, 6, 4, 8, 9, 11};
        
        int sum = 0;
        for (int x: a)
            if (Utils.ktNt(x) == true )
                sum+= x;
        
        System.out.println(sum);
    }
}