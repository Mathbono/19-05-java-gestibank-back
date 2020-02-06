package com.wha.spring.idao;

import java.util.List;

import com.wha.spring.model.Adresse;
import com.wha.spring.model.Conseiller;

public interface IConseillerDao {

	public void saveConseiller(Conseiller conseiller);
	public Conseiller findConseillerByMatr(int matr);
	public List<Conseiller> findAllConseillers();
	public void updateConseiller(Conseiller conseiller);
	public void deleteConseillerbyMatr(int matr);
	public void saveAdresse(Adresse adresse);
}
