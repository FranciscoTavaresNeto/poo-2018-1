package clinica.modelo;

import java.time.LocalDateTime;

public class Consulta {

	private final Medico medico;
	private final Paciente paciente;
	private final LocalDateTime dataHora;
	
	private Situacao situacao;
	
	private Prontuario prontuario;
	private Cancelamento cancelamento;
	
	public Consulta(Medico m, Paciente p, 
			LocalDateTime dataHora) {
		this.medico = m;
		this.paciente = p;
		if (dataHora.isBefore(LocalDateTime.now())) {
			throw new DataHoraPassadaException();
		}
		this.dataHora = dataHora;
		this.situacao = Situacao.Agendada;
	}

	public Medico getMedico() {
		return medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public Prontuario getProntuario() {
		return prontuario;
	}

	public Cancelamento getCancelamento() {
		return cancelamento;
	}

	public Prontuario realizar(String diagnostico, 
							   String prescricao) {
		
		if (this.situacao == Situacao.Cancelada
				|| this.situacao == Situacao.Suspensa) {
			throw new ConsultaFoiCanceladaException();
		}
		if (this.situacao == Situacao.Realizada) {
			throw new ConsultaJaFoiRealizadaException();
		}
		
		this.prontuario = 
				new Prontuario(diagnostico, prescricao);
		this.situacao = Situacao.Realizada;
		return this.prontuario;
	}
	
	public Cancelamento cancelar(String motivo, boolean medico) {
		
		if (this.situacao == Situacao.Realizada) {
			throw new ConsultaJaFoiRealizadaException();
		}
		
		if (this.situacao == Situacao.Cancelada ||
				this.situacao == Situacao.Suspensa) {
			throw new ConsultaFoiCanceladaException();
		}
		
		this.cancelamento = 
			new Cancelamento(motivo, medico ? "Médico" : "Paciente");
		this.situacao = Situacao.Cancelada;
		return this.cancelamento;
	}
	
	public Cancelamento suspender(String motivo, boolean medico) {
		
		if (this.situacao == Situacao.Realizada) {
			throw new ConsultaJaFoiRealizadaException();
		}
		
		if (this.situacao == Situacao.Cancelada ||
				this.situacao == Situacao.Suspensa) {
			throw new ConsultaFoiCanceladaException();
		}
		
		this.cancelamento =
			new Cancelamento(motivo, medico ? "Médico" : "Paciente");
		this.situacao = Situacao.Suspensa;
		return this.cancelamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
