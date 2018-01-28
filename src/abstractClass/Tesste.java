/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author YvesLambert
 */
public class Tesste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Les méthodes d'un chien 

    Chien c = new Chien("Gris bleuté", 20);

    c.boire();

    c.manger();

    c.deplacement();

    c.crier();

    System.out.println(c.toString());

            

    System.out.println("--------------------------------------------");

    //Les méthodes de l'interface

    c.faireCalin();

    c.faireLeBeau();

    c.faireLechouille();

        

    System.out.println("--------------------------------------------");

    //Utilisons le polymorphisme de notre interface

    Exnerte r = new Chien();

    r.faireLeBeau();

    r.faireCalin();

    r.faireLechouille();
    }
    
}
