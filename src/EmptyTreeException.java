
public class EmptyTreeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyTreeException(){
		System.out.println("Tree is empty");
	}
	
	public EmptyTreeException(String i){
		super(i);
		
		System.out.println("Tree is empty");
	}
}
