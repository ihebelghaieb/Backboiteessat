package tn.essat.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Salleattente;
@Repository
public interface ISalleattenteDao extends JpaRepository<Salleattente, Integer>{

}