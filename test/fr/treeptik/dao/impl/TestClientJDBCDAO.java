package fr.treeptik.dao.impl;

import org.junit.Assert;
import org.junit.Test;

import fr.treeptik.dao.ClientDAO;
import fr.treeptik.dao.DAOFactory;
import fr.treeptik.exception.DAOException;
import fr.treeptik.pojo.Client;

public class TestClientJDBCDAO {

	
	@Test
	public void shouldsaveClient(){
		ClientDAO ClientDAO = DAOFactory.getClientDAO();
		Client c = new Client("toto","adress","ville");
		try{
			c = ClientDAO.save(c);
			Assert.assertNotNull(c);
			Assert.assertNotNull(c.getCodecl());
		}catch (DAOException e){
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
