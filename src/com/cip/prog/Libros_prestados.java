package com.cip.prog;

public class Libros_prestados {

	public static void main(String[] args) {

		Libro libro1 = new Libro("El Quijote de La Mancha", "Miguel de Cervantes", 2, 1);
		Libro libro2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 1);

		System.out.println("Libro 1:");
		System.out.println("Titulo: " + libro1.getTitulo());
		System.out.println("Autor: " + libro1.getAutor());
		System.out.println("Ejemplares: " + libro1.getEjemplares());
		System.out.println("Prestados: " + libro1.getPrestados());
		System.out.println();

		System.out.println("Libro 2:");
		System.out.println("Titulo: " + libro2.getTitulo());
		System.out.println("Autor: " + libro2.getAutor());
		System.out.println("Ejemplares: " + libro2.getEjemplares());
		System.out.println("Prestados: " + libro2.getPrestados());
		System.out.println();

		if (libro1.prestamo()) {
			System.out.println("TRUE  " + libro1.getTitulo());

		} else {
			System.out.println("FALSE " + libro1.getTitulo());
		}

		if (libro1.devolucion()) {
			System.out.println("TRUE " + libro1.getTitulo());
		} else {
			System.out.println("FALSE " + libro1.getTitulo());
		}

		if (libro2.prestamo()) {
			System.out.println("TRUE  " + libro2.getTitulo());
		} else {
			System.out.println("FALSE " + libro2.getTitulo());
		}
		if (libro2.devolucion()) {
			System.out.println("TRUE " + libro2.getTitulo());
		} else {
			System.out.println("FALSE " + libro2.getTitulo());
		}

	}

}
