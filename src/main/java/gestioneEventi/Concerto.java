package gestioneEventi;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Concerto extends Evento {

	@Enumerated(EnumType.STRING)
	private Genere genere;

	private boolean inStreaming;

	public Concerto() {

	}

	public Concerto(Genere _genere, boolean _inStreaming) {

	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere _genere) {
		this.genere = _genere;
	}

	public boolean getInStreaming() {
		return inStreaming;
	}

	public void setInStreaming(boolean _inStreaming) {
		this.inStreaming = _inStreaming;
	}

	@Override
	public String toString() {
		return "Concerto [ " + genere + ", " + inStreaming + " ]";

	}

}
