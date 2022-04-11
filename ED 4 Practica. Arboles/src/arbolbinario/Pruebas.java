package arbolbinario;

public class Pruebas {

    public static void main(String[] args) {
        System.out.println("********** PRUEBAS ARBOL BINARIO DE EXPRESION **********");
        Arbol uno = new Arbol("52+83-*4/");
        Arbol dos = new Arbol("92+3+4*");
        Arbol tres = new Arbol("29*37-5*+8/");
        Arbol cuatro = new Arbol("9");

        System.out.print("Expresion: ");
        uno.mostrarExpresion();
        System.out.print("Resultado: " + uno.calcularValor());
        System.out.println();
        System.out.print("Expresion: ");
        dos.mostrarExpresion();
        System.out.print("Resultado: " + dos.calcularValor());
        System.out.println();
        System.out.print("Expresion: ");
        tres.mostrarExpresion();
        System.out.print("Resultado: " + tres.calcularValor());
        System.out.println();
        System.out.print("Expresion: ");
        cuatro.mostrarExpresion();
        System.out.print("Resultado: " + cuatro.calcularValor());
        System.out.println();
    }
}

