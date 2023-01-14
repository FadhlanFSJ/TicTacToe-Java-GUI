/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpbo2;
import java.util.Random;


 
public class Quizpbo2 {

    public static void main(String[] args) {
        Random r = new Random();
        int rand = 0;
        while(true){
            rand = r.nextInt(9);
            if(rand != 0) break;
        }
        System.out.println(rand);
    }
    
}
