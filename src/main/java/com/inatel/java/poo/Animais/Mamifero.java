package com.inatel.java.poo.Animais;

public abstract class Mamifero {

    // DECLARANDO OS ATRIBUTOS
    protected String nome;
    protected double vida;


    // DEFININDO OS MÉTODOS
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }
    
}
