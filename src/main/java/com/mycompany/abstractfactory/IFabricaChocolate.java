/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author igor_
 */
public interface IFabricaChocolate {
    AChocolate criarOvo1(String nome, int peso, String cor, int amargor, double preco);
    AChocolate criarOvo2(String nome, int peso, String cor, int amargor, double preco);
    AChocolate criarOvo3(String nome, int peso, String cor, int amargor, double preco);
}
