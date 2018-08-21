/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Hp
 */
public class Method2 {
    public static int a( int x, int y, int z)
    {
        return x + y + z;
    }
    public static void main(String[] args)
    {
        int x;
        int bil1=1, bil2 =2, bil3 =3; 
       
        x = a(bil1,bil2,bil3);
        
        System.out.println("Hasil : " +x);
        
       
    }
}
