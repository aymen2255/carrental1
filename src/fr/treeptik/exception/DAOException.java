package fr.treeptik.exception;

public class DAOException extends Exception{

	private static final long serialVersionUID = 1L;

	public DAOException (Exception e, String  message){
		super(message, e);
	}
	
}
