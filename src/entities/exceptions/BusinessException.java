package entities.exceptions;

public class BusinessException extends RuntimeException{
	private static final long serialVersionUID = 1L; // Declara a vers�o de uma classe Serializable

	public BusinessException(String msg) {
		super(msg);
	}
}
