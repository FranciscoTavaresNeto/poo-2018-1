package clinica.modelo;

import java.util.HashSet;

// final: esta classe não poderá ser estendida
public final class Medico extends Pessoa {

	private final int CRM;
	private final HashSet<Especialidade> especialidades = 
			new HashSet<>();

	public Medico(String nome, String CPF, int CRM) {
		super(nome, CPF);
		this.CRM = CRM;
	}
	
	public void addEspecialidade(Especialidade e) {
		especialidades.add(e);
	}
	
	public HashSet<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public int getCRM() {
		return CRM;
	}

	
	
}
