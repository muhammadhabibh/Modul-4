/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author SMK TELKOM
 */
public class testline {
    public static void main (String [] args){
        Line a = new Line ( 4, 5, 7, 9);
        Line b = new Line ( 8, 2, 4, 2);
        System.out.println("Lenght a : "+a.getlenght());
        System.out.println("Lenght b : "+b.getlenght());
        System.out.println("aLen > bLen = "+a.isGreater(a,b));
        System.out.println("aLen < bLen = "+a.isLess(a,b));
        System.out.println("aLen = bLen = "+a.isEqual(a,b));
    }
}
