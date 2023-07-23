package ProjetoJDBC;
import java.util.List;

public interface DepartamentoDAO {

	void insert(Departamento obj);
	void update(Departamento obj);
	void deleteByID(Integer id);
	Departamento FindById(Integer id);
	List<Departamento> FindAll();
}
