package fr.treeptik.runtime;

import java.util.List;

import fr.treeptik.dao.ClientDAO;
import fr.treeptik.dao.DAOFactory;
import fr.treeptik.dao.impl.ClientJDBCDAO;
import fr.treeptik.dao.impl.ContratJDBCDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.pojo.Client;
import fr.treeptik.pojo.Contrat;
import fr.treeptik.utils.ConnectionUtils;

public class Main {

	public static void main(String[] args) throws DAOException {
		getClient(6);
		Client clt = new Client();
		clt.setCodecl(7);
		removeClient(clt);
		
		/*ContratJDBCDAO contratJDBCDAO = new ContratJDBCDAO();
		List<Contrat> findByIdClient = contratJDBCDAO.findByIdClient(7);
		for (Contrat contrat : findByIdClient) {
			System.out.println(contrat.getNocontrat());
			
		}*/
	}

	public static void addClient() {
		Client c = new Client("toto", "adresse", "ville");
		ClientDAO clientDAo = DAOFactory.getClientDAO();
		try {
			clientDAo.save(c);
			ConnectionUtils.commitTX();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Client getClient(Integer id) {
		Client c = new Client();
		
		ClientJDBCDAO clientJDBCDAO = new ClientJDBCDAO();
		try {
			clientJDBCDAO.findByPk(id);
			c.setCodecl(id);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		return c;
	}
	public static void removeClient(Client c) throws DAOException{
		ClientJDBCDAO clientJDBCDAO = new ClientJDBCDAO();
		clientJDBCDAO.remove(c);
		ConnectionUtils.commitTX();
	}
	
	/*
	 * public void removeClient(entite) { 
	 * ClientJDBCDAO clientJDBCDAO = new ClientJDBCDAO();
	 * entity = clientjdbcdao.getclient(id)
	 *  clientJDBCDAO.remove(entite); }
	 */
}
