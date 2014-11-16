public class Tree {
	int[] tree = new int[100];
	private int lastNode = -1;
	
	public Tree(){
	}
	
	public Tree(int[] array){
		for (int i = 0; i < array.length; i++){
			add(array[i]);
		}
	}
	
	public void print(){
		for (int i = 0; i < tree.length; i++){
			System.out.println(tree[i]);
		}
	}
	
	public void add(int insert){
		if (lastNode == tree.length){
			int[] nextTree = new int[tree.length * 2];
			for (int i = 0; i < tree.length; i++){
				nextTree[i] = tree[i];
			}
			
			tree = nextTree;			
		}
		
		tree[lastNode + 1] = insert;
		lastNode++;
	}
	
	public int remove(int index){
		int toReturn = -3;
		
		try{		
			toReturn = tree[index];
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("The index was outside of the tree");
		}
		
		for (int i = index; i <= lastNode; i++){
			tree[i] = tree[i + 1];
		}
		
		lastNode--;
		
		return toReturn;
		
	}
	
	public int removeRoot() throws EmptyTreeException{
		if (lastNode == -1){
			throw new EmptyTreeException();
		}
		
		int temp = getRoot();
		for (int i = 1; i <= lastNode; i++){
			tree[i-1] = tree[i];
		}
		
		lastNode--;
		
		return temp;
	}
	
	public void swap(int aIndex, int bIndex){
		int temp = tree[aIndex];
		tree[aIndex] = tree[bIndex];
		tree[bIndex] = temp;
	}
	
	public int getRoot(){
		return tree[0];
	}
	
	public int getLeftValue(int pIndex){
		if (pIndex < 0 || pIndex > tree.length - 1){
			throw new IllegalArgumentException();
		}
		
		if (pIndex == 0){
			return 1;
		}
		
		else{
			int toReturn = (pIndex * 2) - 1;
			
			try{
				return tree[toReturn];
			}
			
			catch (IndexOutOfBoundsException e){
				System.out.println("Node was at bottom of tree");
				return tree[pIndex];
			}
		}
	}
	
	public int getLeftIndex(int pIndex){
		if (pIndex < 0 || pIndex > tree.length - 1){
			throw new IllegalArgumentException();
		}
		
		if (pIndex == 0){
			return 1;
		}
		
		else{
			int toReturn = (pIndex * 2) - 1;
			
			try{
				return toReturn;
			}
			
			catch (IndexOutOfBoundsException e){
				System.out.println("Node was at bottom of tree");
				return pIndex;
			}
		}
	}
	
	public int getRightIndex(int pIndex){
		if (pIndex < 0 || pIndex > tree.length - 1){
			throw new IllegalArgumentException();
		}
		
		if (pIndex == 0){
			return 2;
		}
		
		else{
			int toReturn = pIndex * 2;
			
			try{
				return toReturn;
			}
			
			catch (IndexOutOfBoundsException e){
				System.out.println("Node was at bottom of tree");
				return pIndex;
			}
		}
	}
	
	public int getRightValue(int pIndex){
		if (pIndex < 0 || pIndex > tree.length - 1){
			throw new IllegalArgumentException();
		}
		
		if (pIndex == 0){
			return 2;
		}
		
		else{
			int toReturn = pIndex * 2;
			
			try{
				return tree[toReturn];
			}
			
			catch (IndexOutOfBoundsException e){
				System.out.println("Node was at bottom of tree");
				return tree[pIndex];
			}
		}
	}
}
