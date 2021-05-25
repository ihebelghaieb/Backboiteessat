package tn.essat.dao;
import java.util.List;

import tn.essat.model.Medicine;



public interface IMedicineDao {
	public List<Medicine> getAllMedicine();
	public Medicine getMedicine(int id);
	public void addMedicine(Medicine e);
	public void updateMedicine(Medicine e);
	public void deleteMedicine(int id);

}