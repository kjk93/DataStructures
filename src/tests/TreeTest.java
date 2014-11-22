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
	
	@Ignore
	@Test
	public void testTreeIntArray() {
		int[] testFixed = randomArray(100);
		int[] testRnd = randomArray();
		Tree testF = new Tree(testFixed);
		Tree testR = new Tree(testRnd);
		
		assertArrayEquals(testF.getTree(), testFixed);
		assertArrayEquals(testR.getTree(), testRnd);
	}
	
	
	@Test
	public void testPrint() {
		int[] testFixed = randomArray(100);
		int[] testRnd = randomArray();
		Tree firstTest = new Tree();
		Tree testF = new Tree(testFixed);
		Tree testR = new Tree(testRnd);
		
		//Test basic method first
		
		/** The test prints directly to the console and should only be used if
		 * 	nothing else is supposed to be printed to the console.
		 *  The test can be used by removing the comment markers.**/
		/*
		try{ 
			firstTest.print();
			
		}
		
		catch(Exception e){
			System.out.println("There was an unexpected Error");
			System.out.println(e.getMessage());
			assertTrue(false);
		}*/
		
		assertEquals(printArray(testFixed), printArray(testF.getTree()));
		if (testRnd.length != testR.getTree().length){
			int[] newEx = new int[testR.getTree().length];
			
			for (int i = 0; i < testRnd.length; i++){
				newEx[i] = testRnd[i];
			}
			
			testRnd = newEx;
		}
		assertEquals(printArray(testRnd), printArray(testR.getTree()));
		
		
	}

	@Test
	public void testAdd() {
		int[] testFixed = randomArray(100);
		int[] testRnd = randomArray();
		Tree firstTest = new Tree();
		Tree testF = new Tree(testFixed);
		Tree testR = new Tree(testRnd);
		int toInsert = (int)(Math.random() * 10000);
		
		//Test basic function first
		
		try{
			firstTest.add(toInsert);
		}
		
		catch(Exception e){
			System.out.println("There was an unexpected Error");
			System.out.println(e.getMessage());
			assertTrue(false);
		}
		
		//Test with fixed length
		int[] expanded = new int[101];
		for (int i = 0; i < testFixed.length; i++){
			expanded[i] = testFixed[i];
		}
		
		expanded[100] = toInsert;
		
		testF.add(toInsert);
		
		if (expanded.length != testF.getTree().length){
			int[] newEx = new int[testF.getTree().length];
			
			for (int i = 0; i < expanded.length; i++){
				newEx[i] = expanded[i];
			}
			
			expanded = newEx;
		}
		
		assertArrayEquals(expanded, testF.getTree());
		
		expanded = testRnd;
		
		int[] newExp = new int[expanded.length + 1];
		
		for(int i = 0; i < expanded.length; i++){
			newExp[i] = expanded[i];
		}
		
		newExp[newExp.length-1] = toInsert;
		
		expanded = newExp;
				
		testR.add(toInsert);
		
		if (expanded.length != testR.getTree().length){
			int[] newEx = new int[testR.getTree().length];
			
			for (int i = 0; i < expanded.length; i++){
				newEx[i] = expanded[i];
			}
			
			expanded = newEx;
		}
		
		assertArrayEquals(expanded, testR.getTree());
	}

	@Ignore
	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testRemoveRoot() {
		fail("Not yet implemented");
	}
	
	@Ignore("Test not Completed Yet")
	@Test
	public void testSwap() {
		//Test basic case
		Tree simple = new Tree();
		simple.add(1);
		simple.add(2);
		simple.swap(0,1);
		
		//assertArrayEquals();
	}

	@Test
	public void testGetRoot() throws EmptyTreeException {
		//Test base case
		Tree base = new Tree();
		base.add(1);
		
		assertEquals(1, base.getRoot());
		
		base = new Tree();
		
		try{
			base.getRoot();
		}
		
		catch(EmptyTreeException e){
			assertTrue(true);
		}
		
		catch(Exception e){
			System.out.println("There was an unexpected Error");
			assertTrue(false);
		}
		
		//More complex cases
		int[] toTree = new int[100];
		for (int i = 0; i < toTree.length; i++){
			toTree[i] = (int)(Math.random() * 10000);
		}
		
		Tree testF = new Tree(toTree);
		assertEquals(toTree[0], testF.getRoot());
		
		toTree = new int[(int)(Math.random() * 10000)];
		for (int i = 0; i < toTree.length; i++){
			toTree[i] = (int)(Math.random() * 10000);
		}
		
		Tree testR = new Tree(toTree);
		assertEquals(toTree[0], testR.getRoot());
	}
	
	@Ignore
	@Test
	public void testGetLeftValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeftIndex() {
		//Test base case
		Tree base = new Tree();
		
		base.add(1);
		base.add(2);
		base.add(3);
		
		assertEquals(1, base.getLeftIndex(0));
		
		try{
			base.getLeftIndex(1);
			System.out.println("Was caught");
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("Was caught");
			assertTrue(true);
		}
		
		catch(Exception e){
			System.out.println("There was an unexpected Error");
			assertTrue(false);
		}
		
		//More complex tests
		
	}
	
	@Ignore
	@Test
	public void testGetRightIndex() {
		fail("Not yet implemented");
	}

	@Ignore
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
