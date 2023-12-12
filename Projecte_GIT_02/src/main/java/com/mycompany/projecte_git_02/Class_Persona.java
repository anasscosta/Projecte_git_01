/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecte_git_02;

/**
 *
 * @author dam
 */
public class Class_Persona {
    private final String nom;
    private final int edat;
    
    
    public Class_Persona(String nom,int edat)
    {
    this.nom= nom;
    this.edat= edat;
    }
    public void saludar(){
        
    System.out.println("Hola, soc en " + nom + "i tinc "+ edat + " anys.");
    }
}
