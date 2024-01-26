package modeloTest;

import static org.junit.Assert.*;

import modelo.Peliculas;

import org.junit.Test;

public class PeliculasTest {

	@Test
	public void testEqualsObject() {
		Peliculas pelicula1 = new Peliculas();
		pelicula1.setIdPeliculas("1");
		pelicula1.setTituloPeliculas("Interestellar");
		pelicula1.setGeneroPeliculas("Ciencia ficcion");
		pelicula1.setDuracionPeliculas("140");

		Peliculas pelicula2 = new Peliculas();
		pelicula2.setIdPeliculas("1");
		pelicula2.setTituloPeliculas("Interestellar");
		pelicula2.setGeneroPeliculas("Ciencia ficcion");
		pelicula2.setDuracionPeliculas("140");

		assertEquals(pelicula1, pelicula2);
	}

	@Test
	public void testGetIdPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setIdPeliculas("3");
		assertEquals("3", pelicula.getIdPeliculas());
	}

	@Test
	public void testSetIdPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setIdPeliculas("220");
		assertEquals("220", pelicula.getIdPeliculas());
	}

	@Test
	public void testGetTituloPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setTituloPeliculas("Interestellar");
		assertEquals("Interestellar", pelicula.getTituloPeliculas());
	}

	@Test
	public void testSetTituloPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setTituloPeliculas("Interestellar");
		assertEquals("Interestellar", pelicula.getTituloPeliculas());
	}

	@Test
	public void testGetDuracionPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setDuracionPeliculas("200");
		assertEquals("200", pelicula.getDuracionPeliculas());
	}

	@Test
	public void testSetDuracionPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setDuracionPeliculas("120");
		assertEquals("120", pelicula.getDuracionPeliculas());
	}

	@Test
	public void testGetGeneroPeliculas() {
		Peliculas pelicula = new Peliculas();
		pelicula.setGeneroPeliculas("Drama");
		assertEquals("Drama", pelicula.getGeneroPeliculas());
	}

	@Test
	public void testSetGeneroPeliculas() {

		Peliculas pelicula = new Peliculas();
		pelicula.setGeneroPeliculas("Drama");
		assertEquals("Drama", pelicula.getGeneroPeliculas());
	}

	@Test
	public void testToString() {
		Peliculas pelicula = new Peliculas();

		pelicula.setIdPeliculas("2");
		pelicula.setTituloPeliculas("titanic");
		pelicula.setDuracionPeliculas("120");
		pelicula.setGeneroPeliculas("drama");

		String cadenaEsperada = "Peliculas [idPeliculas=2, tituloPeliculas=titanic, duracionPeliculas=120, generoPeliculas=drama]";
		assertEquals(cadenaEsperada, pelicula.toString());
	}

}
