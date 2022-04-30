package com.inatel.java.poo;

import com.inatel.java.poo.Animais.Boi;
import com.inatel.java.poo.Animais.Cachorro;
import com.inatel.java.poo.Animais.Lontra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        // INSTANCIANDO OS OBJETOS
        Boi boi = new Boi("Bobby", 100);
        Cachorro cachorro = new Cachorro("Bobby", 100);
        Lontra lontra = new Lontra("Lontra", 100);

        // CHAMANDO OS MÉTODOS
        boi.emitirSom();
        cachorro.emitirSom();
        lontra.emitirSom();

        // CHAMANDO OS MÉTODOS ESPECIAIS
        lontra.nadar();

        
    }
}
