package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CustomizedException.OddNumberException;



class MagicSquareTest {

	private MagicSquare magic;
	
	public void setupScenary1() {
		magic = new MagicSquare();
	}
	
	public void setupScenary2() {
		magic = new MagicSquare();
		
	}
	
	public void setupScenary3() {
		magic = new MagicSquare();
	}
	
	public void setupScenary4() {

	}
	@Test
	
	public void testInitForm1(){
		setupScenary1();
		try {
			int[][] matriz = magic.initSquare(3, "NO", "Up");
			int[][] verified = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
			
		}catch(NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch(OddNumberException i) {
			fail("No debía producer excepcion");
			
		}
	}
	
	@Test
	public void testInitForm2() {
			setupScenary1();
			try {
				int[][] matriz = magic.initSquare(3, "NE", "Up");
				int[][] verified = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };

				
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						assertTrue(matriz[i][j] == verified[i][j]);
					}
				}
			}catch (NullPointerException e) {
			fail("No debía producer excepcion");
				
			}catch (OddNumberException i) {
			fail("No debía producer excepcion");
				
			}
}
	
	@Test
	public void testInitForm3() {
		setupScenary1();
			try {
				
			int[][] matriz = magic.initSquare(3, "NE", "RIGHT");
			int[][] verified = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
			}catch (NullPointerException e) {
				fail("No debía producer excepcion");
				
			}catch (OddNumberException i) {
				fail("No debía producer excepcion");
				
			}
	}
	
	@Test
	public void testInitForm4 () {
		setupScenary1();
		
		try {
			int[][] matriz = magic.initSquare(3, "SE", "RIGHT");
			int[][] verified = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };

			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
		}catch (NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch (OddNumberException i) {
			fail("No debía producer excepcion");
			
		}
	}
	
	@Test
	public void testInitForm5 () {
		setupScenary1();
		
		try {
		
			int[][] matriz = magic.initSquare(3, "SO", "LEFT");
			int[][] verified = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };

			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
		}catch (NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch (OddNumberException i) {
			fail("No debía producer excepcion");
			
		}
	}
	
	@Test
	public void testInitForm6 () {
		setupScenary1();
		
		try {
		
			int[][] matriz = magic.initSquare(3, "NO", "LEFT");
			int[][] verified = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };

			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
		}catch (NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch (OddNumberException i) {
			fail("No debía producer excepcion");
			
		}
			
	}
	
	@Test
	public void testInitForm7 () {
		setupScenary1();
		
		try {
		
			int[][] matriz = magic.initSquare(3, "SE", "DOWN");
			int[][] verified = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
		}catch (NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch (OddNumberException i) {
			fail("No debía producer excepcion");
			
		}
			
	}
	
	@Test
	public void testInitForm8 () {
		setupScenary1();
		
		try {
		
			int[][] matriz = magic.initSquare(3, "SO", "DOWN");
			int[][] verified = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };

			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					assertTrue(matriz[i][j] == verified[i][j]);
				}
			}
		}catch (NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch (OddNumberException i) {
			fail("No debía producer excepcion");
		}
			
		
	}
	
	@Test
	public void testInitForm9 () {
		setupScenary2();
		
		try {
		
			int[][] matriz = magic.initSquare(2, "NO", "Up");
			}
		catch (NullPointerException e) {
			fail("No debía producer excepcion");
			
		}catch (OddNumberException i) {
			assertTrue(true, "Se produjo correctamente la excepcion");
		}
	}
			
	
	@Test
	public void testInitForm10() {
		setupScenary3();
		try {
			int[][] matriz = magic.initSquare(3, null, null);
		} catch (NullPointerException e) {
			assertTrue(true, "Se produjo correctamente la excepcion");
		}catch (OddNumberException i) {
			fail("Debió producir una null pointer exception pero produjo una Odd Number Exception");
		}
	}
	
	@Test
	public void testInitForm11() {
		setupScenary4();
		try {
			int[][] matriz = magic.initSquare(0 , null, "Up");
			
			fail("Debió producir una null pointer exception");
			
		}catch (NullPointerException e) {
			assertTrue(true, "Se produjo correctamente la excepcion");
		}catch (Exception exc) {
			
			fail("Debió producir una null pointer exception pero produjo una OddNumberException");
			
		}	
	}
	
	
}
