package gestioneEventi;

import javax.persistence.Id;

public class Concerto extends Evento {

	@Id
	// @GeneratedValue
	private long id;

	private Genere genere;
	private boolean inStreaming;

	public Concerto() {

	}

	public Concerto(long _id, Genere _genere, boolean _inStreaming) {

	}

	public long getId() {
		return id;
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
		return "Concerto [ " + id + ", " + genere + ", " + inStreaming + " ]";

	}

}
