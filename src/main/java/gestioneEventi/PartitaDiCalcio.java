package gestioneEventi;

import javax.persistence.Entity;

@Entity
public class PartitaDiCalcio extends Evento {

	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int numeroGolSquadraDiCasa;
	private int numeroGolSquadraOspite;

	public PartitaDiCalcio() {

	}

	public PartitaDiCalcio(String _squadraDiCasa, String _squadraOspite, String _squadraVincente,
			int _numeroGolSquadraDiCasa, int _numeroGolSquadraOspite) {

	}

	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}

	public void setSquadraDiCasa(String _squadraDiCasa) {
		this.squadraDiCasa = _squadraDiCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String _squadraOspite) {
		this.squadraOspite = _squadraOspite;
	}

	public String getSquadraVincente() {
		return squadraVincente;
	}

	public void setSquadraVincente(String _squadraVincente) {
		this.squadraVincente = _squadraVincente;
	}

	public int getNumeroGolSquadraDiCasa() {
		return numeroGolSquadraDiCasa;
	}

	public void setNumeroGolSquadraDiCasa(int _numeroGolSquadraDiCasa) {
		this.numeroGolSquadraDiCasa = _numeroGolSquadraDiCasa;
	}

	public int getNumeroGolSquadraOspite() {
		return numeroGolSquadraOspite;
	}

	public void setNumeroGolSquadraOspite(int _numeroGolSquadraOspite) {
		this.numeroGolSquadraOspite = _numeroGolSquadraOspite;
	}

	@Override
	public String toString() {
		return "PartitaDiCalcio [ " + squadraDiCasa + ", " + squadraOspite + ", " + squadraVincente + ", "
				+ numeroGolSquadraDiCasa + ", " + numeroGolSquadraOspite + " ]";

	}

}
