/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot_2101092021_modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class tugas {
    public static void main (String[] args){
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
      int angka1 =2;
      int angka2 =3;
      int angka3 =4;
      int max=0;
      
      try{
          System.out.print("Masukkan Angka1 : ");
          angka1 = Integer.parseInt(dataIn.readLine());
          System.out.print("Masukkan Angka2 : ");
          angka2 = Integer.parseInt(dataIn.readLine());
          System.out.print("Masukkan Angka3 : ");
          angka3 = Integer.parseInt(dataIn.readLine());
          
          max=(angka1>=max)?angka1:max;
          max=(angka2>=max)?angka3:max;
          
          }catch(IOException e){
          System.out.println("Error!");
      }
        System.out.println("max = "+max);
    }
}