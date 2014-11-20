package fr.treeptik.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.dao.ContratDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.pojo.Contrat;
import fr.treeptik.utils.ConnectionUtils;

public class ContratJDBCDAO implements ContratDAO {

	@Override
	public Contrat save(Contrat entite) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Contrat> findByIdClient(Integer id) throws DAOException {
		//Contrat contrat = new Contrat();
		List<Contrat> contrats = new ArrayList<Contrat>();
		try {

			Connection connection = ConnectionUtils.getConnection();
			String sql1 = "select * from contrat where codecl = ?";

			PreparedStatement statement = connection.prepareStatement(sql1);
			statement.setInt(1, id);
			ResultSet res = statement.executeQuery();
			
			while (res.next()) {
				Contrat c = new Contrat();
				c.setNocontrat(res.getInt(1));
				c.setCodecl(res.getInt(5));
				contrats.add(c);
			}
			
		
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur delete");
		}
		return contrats;
	}

	@Override
	public void remove(Contrat entite) throws DAOException {
		//Contrat contrat = findByPk(entite.getCodecl());
		List<Contrat> contrats = new ArrayList<Contrat>();
		contrats=findAll();
		try {

			Connection connection = ConnectionUtils.getConnection();
			for (Contrat contrat2 : contrats) {
				String sql = "delete from prevoir where nocontrat = ?";
				PreparedStatement statement1 = connection.prepareStatement(sql);
				statement1.setInt(1, contrat2.getNocontrat());
				statement1.executeUpdate();
			}
			
			
			
			String sql1 = "delete from contrat where codecl = ?";

			PreparedStatement statement = connection.prepareStatement(sql1);
			statement.setInt(1, 7);
			statement.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur delete");
		}

	}

	@Override
	public List<Contrat> findAll() throws DAOException {
	List<Contrat> contrats = new ArrayList<Contrat>();
	
		try {

			Connection connection = ConnectionUtils.getConnection();
			String sql1 = "select * from contrat where codecl = ?";

			PreparedStatement statement = connection.prepareStatement(sql1);
			statement.setInt(1, 1);
			ResultSet res = statement.executeQuery();
			while (res.next()) {
				Contrat c = new Contrat();
				c.setNocontrat(res.getInt(1));
				c.setCodecl(res.getInt(5));
				contrats.add(c);
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur delete");
		}
		return contrats;
	}


	@Override
	public Contrat findByPk(Integer id) throws DAOException {
		Contrat contrat = new Contrat();
		try {

			Connection connection = ConnectionUtils.getConnection();
			String sql1 = "select * from contrat where codecl = ?";

			PreparedStatement statement = connection.prepareStatement(sql1);
			statement.setInt(1, 1);
			ResultSet executeQuery = statement.executeQuery();
			contrat.setNocontrat(id);
			//contrat.setCodecl(executeQuery.getInt(5));
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException(e, "ClientJDBCDAO erreur delete");
		}
		return contrat;
	}
}
