package ProjetoJDBC;

import java.io.Serializable;
import java.util.Objects;

public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer id;
	
	public Departamento() {
	}
	
	public Departamento(String nome, Integer id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return "Departamento [nome=" + nome + ", id=" + id + "]";
	}
}
