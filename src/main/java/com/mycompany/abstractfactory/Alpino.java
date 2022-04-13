/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author igor_
 */
public class Alpino extends AChocolate{

    public Alpino(String nome, int peso, String cor, int amargor, double preco) {
        super.nome = nome;
        super.peso = peso;
        super.cor = cor;
        super.amargor = amargor;
        super.preco = preco;
    }

    @Override
    public void exibeInfo() {
        System.out.println(nome+", "+peso+", "+cor+", "+amargor+", "+preco);
    }
    
}
