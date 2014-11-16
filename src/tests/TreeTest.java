package tests;

import static org.junit.Assert.*;
import main.*;

import org.junit.Ignore;
import org.junit.Test;

public class TreeTest {

	@Test
	public void testTree() {
		try{	
		}
		
		catch(Exception e){
			assertTrue(false);
		}
		
		assertTrue(true);
	}

	@Test
	public void testTreeIntArray() {
		int[] testFixed = randomArray(100);
		int[] testRnd = randomArray();
		Tree testF = new Tree(testFixed);
		Tree testR = new Tree(testRnd);
		
		assertArrayEquals(testF.getTree(), testFixed);
		assertArrayEquals(testR.getTree(), testRnd);
	}
	
	@Ignore("Test not completed")
	@Test
	public void testPrint() {
		int[] testFixed = randomArray(100);
		System.out.println(printArray(testFixed));
		
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testSwap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeftValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeftIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRightIndex() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRightValue() {
		fail("Not yet implemented");
	}
	
	private int[] randomArray(int length){
		int[] toReturn = new int[length];
		
		for (int i = 0; i < toReturn.length; i++){
			toReturn[i] = (int)(Math.random() * 10000);
		}
		
		return toReturn;
	}
	
	private int[] randomArray(){
		int[] toReturn = new int[(int)(Math.random() * 10000)];
		
		for (int i = 0; i < toReturn.length; i++){
			toReturn[i] = (int)(Math.random() * 10000);
		}
		
		return toReturn;
	}
	
	private String printArray(int[] to){
		String toReturn = "";
		
		for (int i = 0; i<to.length; i++){
			toReturn = toReturn + to[i] + ", ";
		}
		
		toReturn = toReturn + "end";
		
		return toReturn;
	}
}
