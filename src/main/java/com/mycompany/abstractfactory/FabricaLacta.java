/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author igor_
 */
public class FabricaLacta implements IFabricaChocolate{

    @Override
    public AChocolate criarOvo1(String nome, int peso, String cor, int amargor, double preco) {
        return new AoLeite(nome, peso, cor, amargor, preco);
    }

    @Override
    public AChocolate criarOvo2(String nome, int peso, String cor, int amargor, double preco) {
        return new Oreo(nome, peso, cor, amargor, preco);
    }

    @Override
    public AChocolate criarOvo3(String nome, int peso, String cor, int amargor, double preco) {
        return new SonhoValsa(nome, peso, cor, amargor, preco);
    }
    
}