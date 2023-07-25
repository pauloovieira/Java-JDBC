package DAO;
import java.util.List;

import ProjetoJDBC.Departamento;

public interface DepartamentoDAO {

	void insert(Departamento obj);
	void update(Departamento obj);
	void deleteByID(Integer id);
	Departamento FindById(Integer id);
	List<Departamento> FindAll();
}
