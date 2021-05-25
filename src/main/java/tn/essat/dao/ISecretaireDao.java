package tn.essat.dao;
import java.util.List;

import tn.essat.model.Secretaire;



public interface ISecretaireDao {
	public List<Secretaire> getAllSecretaire();
	public Secretaire getSecretaire(int id);
	public void addSecretaire(Secretaire e);
	public void updateSecretaire(Secretaire e);
	public void deleteSecretaire(int id);

}