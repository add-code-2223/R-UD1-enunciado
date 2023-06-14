/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rud1.main;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import rud1.modelo.Book;

/**
 *
 * @author maria
 */
public class BookFilesMain {

	private static final String BOOK_TAG = "book";
	private static final String BOOK_TITLE = "title";
	private static final String BOOK_AUTHOR_TAG = "author";
	private static final String BOOK_ID_ATT = "id";

	private static final int STRING_LENGTH = 30;

	private static final String BOOKS_INPUT_FILE = Paths.get("src", "rud1", "docs", "bookstore.xml").toString();
	private static final String BOOKS_OUTPUT_FILE = Paths.get("src", "rud1", "docs", "books.dat").toString();

	

	public static void main(String[] args) {

		List<Book> books = fileToList(BOOKS_INPUT_FILE);
		mostrarBooks(books);
		listToFile(books);
		Book book = readBookInPosition(4);
		if (book != null) {
			System.out.println(book);
		}

	}

	private static void mostrarBooks(List<Book> books) {
		System.out.println("----------------------------");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("----------------------------");
	}

	private static ArrayList<Book> fileToList(String ruta) {

		ArrayList<Book> booksList = new ArrayList<>();

		// TO DO
		/*
		 * 1- Completa el método fileToList. Toma como parámetro de entrada la ruta
		 * donde se encuentra el fichero bookstore.xml (sito en rud1.docs). Utiliza con
		 * el API de DOM para leer el fichero y crea un ArrayList<Book>. Utiliza las
		 * constantes ya proporcionadas. Se proporciona ya la clase Book. (4 puntos)
		 */
		return booksList;

	}

	private static void listToFile(List<Book> books) {
//TO DO

		/*
		 * 2- Completa el método listToFile. Toma como parámetro de entrada la lista
		 * ArrayList<Book> y crea un fichero de acceso aleatorio books.dat. Utiliza las
		 * constantes ya proporcionadas. Utiliza tanto para title como author una
		 * longitud fija de 30 caracteres. (3 puntos)
		 */

	}

	private static Book readBookInPosition(int pos) {

		Book book = null;

		// TO DO

		/*
		 * 3-Completa el método readBookInPosition. Toma como parámetro de entrada un
		 * entero con la posición del registro en el fichero aleatorio books.dat y
		 * devuelve el objeto Book con los datos leídos en esa posición o null si la
		 * posición está fuera del fichero o ha habido algún error. Si el entero de
		 * entrada es 1, leerá el primer Book, si es 2, el segundo, y así sucesivamente.
		 * Deberá controlarse si la posición está fuera del rango del datos del fichero
		 * books.dat. (3 puntos)
		 */

		return book;

	}

}
