
import javax.print.DocFlavor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Player {
    private String name;
    private static int jumlahPlayer;
    
    //overloading construktor
    //opsi 1;
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
        
    }
    //opsi2
    Player(){
        Player.jumlahPlayer++;
      this.name = "player" +Player.jumlahPlayer++;;
    }
    
    void show(){
        System.out.println("Name :" +this.name);
}
    }
