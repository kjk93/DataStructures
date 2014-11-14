
public class EmptyTreeException extends Exception{
	
	public EmptyTreeException(){
		System.out.println("Tree is empty");
	}
	
	public EmptyTreeException(String i){
		super(i);
		
		System.out.println("Tree is empty");
	}
}
