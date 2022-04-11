package arbolbinario;

public class Pruebas {

    public static void main(String[] args) {
        System.out.println("********** PRUEBAS ARBOL BINARIO DE EXPRESION **********");
        Arbol uno = new Arbol("52+83-*4/");
        Arbol dos = new Arbol("92+3+4*");
        Arbol tres = new Arbol("29*37-5*+8/");
        Arbol cuatro = new Arbol("9");

        uno.mostrarExpresion();
        uno.calcularValor();
        dos.mostrarExpresion();
        dos.calcularValor();
        tres.mostrarExpresion();
        tres.calcularValor();
        cuatro.mostrarExpresion();
        cuatro.calcularValor();
    }
}

