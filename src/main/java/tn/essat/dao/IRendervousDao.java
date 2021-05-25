package tn.essat.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Rendervous;
@Repository
public interface IRendervousDao extends JpaRepository<Rendervous, Integer>{

}