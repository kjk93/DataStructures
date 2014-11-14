public class Heap {
	int[] array;
	
	public Heap(){
		array = new int[100];
	}
	
	public void print(){
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
