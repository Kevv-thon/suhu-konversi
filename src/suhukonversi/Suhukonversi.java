/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhukonversi;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Suhukonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cel, fah, kel, rea;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih konversi celcius kemana? \n 1. Celcius ke fahrenheit \n 2. Celcius ke reamur \n 3. Celcius ke kelvin");
        int pilih = input.nextInt();
        
        switch(pilih) {
            case 1 : System.out.print("Masukkan celcius : ");
            cel = input.nextDouble();
            fah = (9/5 * cel) + 32;
            System.out.println("Suhu fahrenheit adalah : " +fah);
            break;
            case 2 : System.out.print("Masukkan celcius : ");
            cel = input.nextDouble();
            rea = (4/5 * cel);
            System.out.println("Suhu reamur adalah     : " +rea);
            break;
            case 3 : System.out.print("Masukkan celcius : ");
            cel = input.nextDouble();
            kel = cel + 273;
            System.out.println("Suhu kelvin adalah : " +kel);
            break;
            
        }
    }
    
}
