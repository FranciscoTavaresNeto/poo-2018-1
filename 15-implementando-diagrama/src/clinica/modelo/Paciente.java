package clinica.modelo;

import java.time.LocalDate;
import java.time.Period;

public class Paciente extends Pessoa {

	private final TipoSanguineo tipoSanguineo;
	private final Genero genero;
	private final LocalDate dataNascimento;
	
	public Paciente(String nome, String CPF,
			TipoSanguineo tipoSanguineo, Genero genero,
			LocalDate dataNascimento) {
		super(nome, CPF);
		this.tipoSanguineo = tipoSanguineo;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public Genero getGenero() {
		return genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public int getIdade() {
		return Period.between(dataNascimento, 
				LocalDate.now()).getYears();
	}
	
	
	
	
	
	
	
	
}
