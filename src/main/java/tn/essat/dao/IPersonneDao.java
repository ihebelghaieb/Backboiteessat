package tn.essat.dao;

import java.util.List;

import tn.essat.model.Personne;



public interface IPersonneDao {
	public List<Personne> getAllPersonnes();
	public Personne getPersonne(int id);
	public void addPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(int id);

}
