package arbolbusqueda;

public class Pruebas {

	// Pruebas ------------------------------------------------------------
	public static void main(String[] args) {
		System.out.println("-------------- Arbol binario de busqueda ------------");
		Alumno uno = new Alumno("Felipe García", 1253, 5.3);
		Alumno dos = new Alumno("Adriana Torres", 2345, 7.0);
		Alumno tres = new Alumno("Alicia Blazquez Martín", 5622, 10.0);
		Alumno cuatro = new Alumno("Diego Perez Gonzalez", 8135, 8.0);
		Alumno cinco = new Alumno("Mar Hernando Lopez", 8217, 6.3);
		Alumno seis = new Alumno("Pedro Jimenez del Pozo", 8510, 3.0);
		Alumno siete = new Alumno("Eduardo Parra Martín", 8765, 6.7);
		ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
		arbol.insertar(tres);
		arbol.insertar(seis);
		arbol.insertar(dos);
		arbol.insertar(uno);
		arbol.insertar(siete);
		arbol.insertar(cuatro);
		arbol.insertar(cinco);
		ListaOrdinalAlumnos a = arbol.aLista();
		System.out.println("Lista alumnos por orden de matrícula: ");
		a.mostrar();
		System.out.println();
		Alumno max = arbol.getCalificacionMaxima(5000, 8500);
		double media = arbol.getCalificacionMedia(5000, 8500);
		System.out.println("El alumnos con la calificación maxima cuya matrícula está comprendida entre 5000 y 8500 es: ");
		max.mostrar();
		System.out.println("La calificación media de los alumnos cuya matrícula esta comprendida entre 5000 y 8500 es: " + media);
		System.out.println();
		max = arbol.getCalificacionMaxima(500, 1000);
		media = arbol.getCalificacionMedia(500, 1000);
		System.out.println("El alumnos con la calificación maxima cuya matrícula está comprendida entre 500 y 1000 es: ");
		max.mostrar();
		System.out.println("La calificación media de los alumnos cuya matrícula esta comprendida entre 500 y 1000 es: " + media);
		System.out.println();
		System.out.println("¿El árbol es equilibrado?" + arbol.esEquilibrado());
		System.out.println();
		arbol.borrar(1253);
		System.out.println("Se ha borrado al alumno con matrícula 1253. Nueva lista de alumnos");
		a = arbol.aLista();
		a.mostrar();
		System.out.println("¿El árbol es equilibrado?" + arbol.esEquilibrado());
	}
}
