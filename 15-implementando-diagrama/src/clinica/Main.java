package clinica;

import java.time.LocalDate;
import java.time.LocalDateTime;

import clinica.modelo.Clinica;
import clinica.modelo.Consulta;
import clinica.modelo.Genero;
import clinica.modelo.Medico;
import clinica.modelo.Paciente;
import clinica.modelo.PacienteNaoEncontradoException;
import clinica.modelo.TipoSanguineo;

public class Main {
	public static void main(String[] args) {
		TipoSanguineo t = TipoSanguineo.AB_Negativo;
		System.out.println(t);
		System.out.println(t.name());
		System.out.println(t.ordinal());
		// Caminho Feliz!
		Medico regis = new Medico("Régis Guimarães", 
				"88877722233", 11456);
		
		Paciente yuri = new Paciente("Yuri Maciel", 
				"99977722233", TipoSanguineo.A_Positivo, 
				Genero.Masculino, LocalDate.of(1996, 3, 23));
		
		Clinica matheusClinica = 
				new Clinica("MClínica", 
						"222333444999922", 
						"Matheus e Cia.");
		
		matheusClinica.cadastrarPaciente(yuri);
		matheusClinica.cadastrarMedico(regis);
		
		System.out.println(
			matheusClinica.buscarPaciente("99977722233"));
		
		System.out.println(
			matheusClinica.buscarMedico(11456));
		
		Consulta con = matheusClinica
				.agendarConsulta(11456, "99977722233", 
				LocalDateTime.of(2018, 5, 12, 15, 0));
		
		System.out.println(con);
		System.out.println(con.getSituacao()); // Agendada
		
		con.realizar("Virose", "Tomar água e dormir bem");
		
		System.out.println(con.getSituacao()); // Realizada
		
		// Caminhos Excepcionais
		
		try {
			matheusClinica.buscarPaciente("66288399393");
		} catch (PacienteNaoEncontradoException ex) {
			System.out.println("Deu certo!");
		}
		
		
	}
}
