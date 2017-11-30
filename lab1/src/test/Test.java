package test;

import org.testng.annotations.Test;


import lab1.Variant10;

import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;

import lab1.Variant10.Addition;

public class Test {
	Variant10 obj = new Variant10();


	//////////////////////////////////////////
	
	@Test(dataProvider = "inputProvider")
	public void inputTest(double p1, double p2, double p3) {
		assertEquals(new Variant10().Begin16(p1, p2), p3);
	}

	@DataProvider
	public Object[][] inputProvider() {
		return new Object[][] { { 2.022, 0.012, 2.01}, { 4.572, 0.072, 4.5} };
	}


	//////////////////////////////////////////
	
	
	//////////////////////////////////////////

	@Test(dataProvider = "booleanProvider")
	public void inputTest(int p1, boolean p2) {
		assertEquals(new Variant10().Boolean16(p1), p2);
	}

	@DataProvider
	public Object[][] booleanProvider() {
		return new Object[][] { { 80, true}, { 87, false} };
	}

	//////////////////////////////////////////
	
	
	//////////////////////////////////////////
	
	@Test(dataProvider = "arrayProvider")
	public void arrayTest(int[] array, int value) {
		assertEquals(new Variant10().Array33(array), value);
	}
	
	@DataProvider
	public Object[][] arrayProvider() {
		return new Object[][] { { new int[] { 1, 3, 5}, 5 }};
	}

	//////////////////////////////////////////
	
	
	//////////////////////////////////////////
	
	@Test(dataProvider = "booleanProvider")
	public void booleanTest(int p1, int p2, boolean p3) {
		assertEquals(new Variant10().booleanTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] booleanProvider() {
		return new Object[][] { { 5, 3, false }, { 1, 4, true }, { 0, 1, true } };
	}

	//////////////////////////////////////////

	
	//////////////////////////////////////////
	
	@Test(dataProvider = "switchProvider")
	public void switchTest(int p1, char s, char r) {
		assertEquals(new Variant10().switchTask(p1, s), r);
	}

	@DataProvider
	public Object[][] switchProvider() {
		return new Object[][] { { 0, 'S', 'S'}, { -1, 'E', 'S'} };
	}
	
	//////////////////////////////////////////
	
	
	//////////////////////////////////////////
	
	@Test(dataProvider = "whileProvider")
	public void whileTest(int a, int c) {
		assertEquals(new Variant10().whileTask(a), c);
	}
	
	@DataProvider
	public Object[][] whileProvider() {
		return new Object[][] { { 9, 1 }, { 81, 3 }, { 85, 4 }, { 27, 2 }};
	}
	
	//////////////////////////////////////////
	

	//////////////////////////////////////////
	
	@Test(dataProvider = "forProvider")
	public void forTest(int n, double p2) {
		assertEquals(new Variant10().forTask(n), p2);
	}

	@DataProvider
	public Object[][] forProvider() {
		return new Object[][] { { 5, 2.083333333333333 }, { 100, 5.177377517639621 }, 
		{ 1000, 7.484470860550343 } };
	
	}
	///////////////////////////////////////////////////


	//////////////////////////////////////////
	
	
	
	@Test(dataProvider = "arrayProvider")
	public void arrayTest(int[] array, int value) {
		assertEquals(new Variant10().arrayTask(array), value);
	}
	
	@DataProvider
	public Object[][] arrayProvider() {
		return new Object[][] { { new int[] { 1, -2	}, 0 }, {new int[] {2,-3,2,2}, 3} };
	}
	
	
	
	//////////////////////////////////////////

	
	//////////////////////////////////////////

	@Test(dataProvider = "matrixProvider")
	public void twoDimensionArrayTest(int[][] input, int[][] output) {
		int[][] array=new Variant10().twoDimensionArrayTask(input);
		for(int i = 0; i < input.length; ++i)
		   assertEquals(array[i], output[i]);
	}

	@DataProvider
	public Object[][] matrixProvider() {
		int[][] input = { {1, 2, 3, 4},
						{21, 12, 3, 14},
						{10, 20, 13, 4},
						{11, 22, 13, 24} };	

		int[][] output = { {3, 4, 1, 2},
							{3, 14, 21, 12},
							{13, 4, 10, 20}, 
							{13, 24, 11, 22}};
		
		


		return new Object[][] { {input, output}};

	}

}

