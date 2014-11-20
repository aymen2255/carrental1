package fr.treeptik.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.treeptik.dao.ClientDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.pojo.Client;
import fr.treeptik.pojo.Contrat;
import fr.treeptik.utils.ConnectionUtils;

public class ClientJDBCDAO implements ClientDAO {

	@Override
	public Client save(Client c) throws DAOException {

		try {
			Connection connection = ConnectionUtils.getConnection();
			String sql = "insert into client (nomcl,adresse,ville ) values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, c.getNomcl());
			statement.setString(2, c.getAdresse());
			statement.setString(3, c.getVille());
			statement.executeUpdate();
			ResultSet keys = statement.getGeneratedKeys();
			keys.next();
			c.setCodecl(keys.getInt(1));
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur save" + c);
		}
		return c;
	}


	@Override
	public Client findByPk(Integer id) throws DAOException {
		Client client=null;
		try {
			Connection connection = ConnectionUtils.getConnection();
			String sql = "Select * from client c where c.codecl=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet res = statement.executeQuery();
			res.next();
			client = new Client();
			client.setCodecl(res.getInt(1));
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur select" );
		}
		return client;
	}
	//ALTER TABLE contrat	ADD FOREIGN KEY (codecl)REFERENCES client(codecl) ON DELETE CASCADE;
	@Override
	public void remove(Client entite) throws DAOException {
		
		try {
			
			Connection connection = ConnectionUtils.getConnection();
			ContratJDBCDAO contratJDBCDAO = new ContratJDBCDAO();
			List<Contrat> findByIdClient = contratJDBCDAO.findByIdClient(entite.getCodecl());
			
			for (int i = 0; i < findByIdClient.size(); i++) {
				contratJDBCDAO.remove(findByIdClient.get(i));
			}
			
			
			//contratJDBCDAO.remove(entite.getListContrats().get(1));
			String sql2 = "delete from client where codecl = ?";
			PreparedStatement statement = connection.prepareStatement(sql2);
			statement.setInt(1, 7);
			statement.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur delete");
		}

	}


	@Override
	public List<Client> findAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}


}
