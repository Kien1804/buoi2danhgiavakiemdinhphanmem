/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.b2danhgiavakiemdinhchatluonphanmem;

/**
 *
 * @author cyeng
 */
public class Utils {
    public static boolean ktNt(int n ) {
        
        if (n >= 2) {
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0)
                    return false;
            return true;
        }
        
        return false;
    }
}   
