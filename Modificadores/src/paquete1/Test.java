package paquete1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import paquete1.*;

//PROTECTED: Atributos desde la clase hija
/**
 *
 * @author LORENA
 */
public class Test {

    public static void main(String[] args) {
//PUBLICO
        Clase1 obj1 = new Clase1(); //Constructor por defecto
//        System.out.println("Imprimiendo por consola: " + obj1.atributoPublico);
//        obj1.metodoPublico();

//PROTECTED
        Clase2 claseHija = new Clase2();
        System.out.println("Clase hija: " + claseHija);
    }

}
