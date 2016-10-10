
public class InvalidBalanceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidBalanceException() {
		super("mensagem de erro");
	}
	
	@Override
	public String toString() {
		return "Balanço negativo.";
	}
	
	
	
}