package Refacoring;


/*
 * Created the class InvalidAccessExeption that it looks like the UML
 */
class InvalidAccessException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAccessException(String message) {
		super(message);
	}
}
