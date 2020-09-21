/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Main {
    //run debug
    public static void main(String[] args) {
      //overloading pada construktor
        Player player1 = new Player ("saitama");
        Player player2 =new Player ();
        Player player3 =new Player ();
        Player player4=new Player ("Asta");
        
        player1.show();
        player2.show ();
        player3.show ();
        player4.show ();
        
        //overloadin methods
        int a = Matematika.tambah(1, 20);
        System.out.println(a);
        double b = Matematika.tambah (1, 0.98);
        System.out.println(b);
    }
}
