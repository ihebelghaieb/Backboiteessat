package tn.essat.dao;



import java.util.List;

import tn.essat.model.Patient;



public interface IPatientDao {
	public List<Patient> getAllEtudiants();
	public Patient getPatient(int id);
	public void addPatient(Patient e);
	public void updatePatient(Patient e);
	public void deletePatient(int id);
	public List<Patient> findAll();

}