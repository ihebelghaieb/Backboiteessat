package tn.essat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IPatientDao;
import tn.essat.model.Patient;
@CrossOrigin("*")
@RestController
public class MedicineService{
	@Autowired
	private IPatientDao daop;
	
	public void setDaop(IPatientDao daop) { this.daop = daop;}
	
	@GetMapping("/listePatient")
	public List<Patient> fct1(){
	return daop.findAll();
	}

}
