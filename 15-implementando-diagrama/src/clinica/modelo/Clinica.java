package clinica.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Clinica {

	private final String nome;
	private final String CNPJ;
	private final String razaoSocial;
	
	private final ArrayList<Medico> medicos =
			new ArrayList<>();
	private final ArrayList<Paciente> pacientes =
			new ArrayList<>();
	private final ArrayList<Consulta> consultas =
			new ArrayList<>();
	
	public Clinica(String nome, String CNPJ, 
			       String razaoSocial) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.razaoSocial = razaoSocial;
	}
	
	public void cadastrarPaciente(Paciente p) {
		pacientes.add(p);
	}
	
	public void cadastrarMedico(Medico m) {
		medicos.add(m);
	}
	
	public Paciente buscarPaciente(String CPF) {
		for (Paciente p : pacientes) {
			if (p.getCPF().equals(CPF)) {
				return p;
			}
		}
		throw new PacienteNaoEncontradoException();
	}
	
	public Medico buscarMedico(int CRM) {
		for (Medico m : medicos) 
			if (m.getCRM() == CRM) return m;
		
		throw new MedicoNaoEncontradoException();
	}
	
	public Consulta agendarConsulta(int CRM, String CPF,
			LocalDateTime dataHora) {
		Medico   m = buscarMedico(CRM);
		Paciente p = buscarPaciente(CPF);
		Consulta c = new Consulta(m, p, dataHora);
		consultas.add(c);
		return c;
	}

	public String getNome() {
		return nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	
	
	
}
