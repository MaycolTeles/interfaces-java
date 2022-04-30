package com.inatel.java.poo.Animais;

import com.inatel.java.poo.Interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da lontra (???");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");        
    }
    
}
