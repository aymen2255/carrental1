package fr.treeptik.service;

import fr.treeptik.dao.ClientDAO;
import fr.treeptik.dao.DAOFactory;
import fr.treeptik.pojo.Client;

public class ClientService {
	ClientDAO dao= DAOFactory.getClientDAO();
	public Client save(Client c) {
		
		
		return c;

	}
}
