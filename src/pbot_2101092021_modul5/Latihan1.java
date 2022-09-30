/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbot_2101092021_modul5;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan1 {
    public static void main (String[] args){
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
      String word1 ="";
      String word2 ="";
      String word3 ="";
      String gabung ="";
      
      try{
          System.out.print("Enter word1 : ");
          word1 = dataIn.readLine();
          System.out.print("Enter word2 : ");
          word2 = dataIn.readLine();
          System.out.print("Enter word3 : ");
          word3 = dataIn.readLine();
          }catch(IOException e){
          System.out.println("Error!");
      }
        System.out.println(word1+" "+word2+" "+word3);
    }
}
