package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;


public interface GenericDAO <T, PK>{
	T save(T entite)throws DAOException;
	T findByPk(PK id)throws DAOException;
	void remove(T entite)throws DAOException;
	List<T> findAll()throws DAOException;
}
