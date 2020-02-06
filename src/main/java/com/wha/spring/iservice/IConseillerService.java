package com.wha.spring.iservice;

import java.util.List;

import com.wha.spring.model.Adresse;
import com.wha.spring.model.Conseiller;

public interface IConseillerService
{
	public void saveConseiller(Conseiller conseiller);
	public Conseiller findConseillerByMatr(int matr);
	public List<Conseiller> findAllConseillers();
	public void updateConseiller(Conseiller conseiller);
	public void deleteConseillerByMatr(int matr);
	public void saveAdresse(Adresse adresse);
}
