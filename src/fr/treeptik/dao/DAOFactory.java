package fr.treeptik.dao;

import fr.treeptik.dao.impl.ClientJDBCDAO;


public class DAOFactory {
	public static ClientDAO getClientDAO() {
		return new ClientJDBCDAO();
	}
}
