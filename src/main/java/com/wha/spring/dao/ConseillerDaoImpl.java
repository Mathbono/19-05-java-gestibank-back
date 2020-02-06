package com.wha.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.spring.idao.IConseillerDao;
import com.wha.spring.model.Adresse;
import com.wha.spring.model.Conseiller;

@Repository("conseillerDao")
public class ConseillerDaoImpl extends AbstractDao implements IConseillerDao {

	public void saveConseiller(Conseiller conseiller) {
		persist(conseiller);
	}
	
	public Conseiller findConseillerByMatr(int matr) {
		return (Conseiller) getSession().get(Conseiller.class, matr);
	}
	
	public List<Conseiller> findAllConseillers() {
		String req ="SELECT c FROM Conseiller c";
		List<Conseiller> listConseillers = getSession().createQuery(req).list();
		return listConseillers ;
	}
	
	public void updateConseiller(Conseiller conseiller) {
		getSession().update(conseiller);
	}
	
	public void deleteConseillerbyMatr(int matr) {
		getSession().delete(Conseiller.class);
	}
	
	public void saveAdresse(Adresse adresse) {
		persist(adresse);
	}
}
