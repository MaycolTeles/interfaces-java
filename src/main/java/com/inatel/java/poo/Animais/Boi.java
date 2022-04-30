package com.inatel.java.poo.Animais;

public class Boi extends Mamifero {

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Vou jogar LoL!!");
    }
    
}