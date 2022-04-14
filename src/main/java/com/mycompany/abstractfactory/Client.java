/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author igor_
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IFabricaChocolate garoto = new FabricaGaroto();
        IFabricaChocolate lacta = new FabricaLacta();
        IFabricaChocolate nestle = new FabricaNestle();
        
        AChocolate newOvo = garoto.criarOvo1("Crocante", 215, "Rosa", 50, 29);
        System.out.println(newOvo.nome);
        
        AChocolate newOvo1 = lacta.criarOvo1("Ao leite", 170, "Preto", 60, 27);
        System.out.println(newOvo1.nome);
        
        AChocolate newOvo2 = nestle.criarOvo1("Alpino", 337, "Azul", 40, 17);
        System.out.println(newOvo2.nome);
    }
    
}
