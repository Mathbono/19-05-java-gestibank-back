package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.idao.IConseillerDao;
import com.wha.spring.iservice.IConseillerService;
import com.wha.spring.model.Adresse;
import com.wha.spring.model.Conseiller;

@Service("conseillerService")
@Transactional
public class ConseillerServiceImpl implements IConseillerService {
	@Autowired
	private IConseillerDao dao;

	public void saveConseiller(Conseiller conseiller) {
		dao.saveConseiller(conseiller);
	}
	public Conseiller findConseillerByMatr(int matr) {
		return dao.findConseillerByMatr(matr);
	}
	public List<Conseiller> findAllConseillers() {
		return dao.findAllConseillers();
	}
	public void updateConseiller(Conseiller conseiller) {
		dao.updateConseiller(conseiller);
	}
	public void deleteConseillerByMatr(int matr) {
		dao.deleteConseillerbyMatr(matr);
	}
	public void saveAdresse(Adresse adresse) {
		dao.saveAdresse(adresse);
	}
}
