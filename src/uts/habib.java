/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;
public class habib extends benua{
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        String password;
        String pass="Habib";
        System.out.print("Password : ");
        password = masukan.next();
        if(password.equals(pass)){
            System.out.println("---------------------------------");
            System.out.println("Password Yang Anda Masukkan Benar");
            System.out.println("---------------------------------");
            System.out.println("Benua Asia");
            System.out.println("Negara Indonesia");
            System.out.println("Ibu Kota Jakarta\n");
            System.out.println("Benua Afrika");
            System.out.println("Negara Mesir");
            System.out.println("Ibu Kota Kairo\n");
            System.out.println("Benua Australia");
            System.out.println("Negara New South Wales");
            System.out.println("Ibu Kota Sydney\n");
            System.out.println("Benua Eropa");
            System.out.println("Negara Belanda");
            System.out.println("Ibu Kota Amsterdam");
        }
        else{
            System.out.println("Password Yang Anda Masukkan Salah  ");
            System.out.println("-----------------------------------");
            System.out.println("Tidak Terdapat Daftar Benua Satupun");
        }
    }
}    

