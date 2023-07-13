package gestioneEventi;

import java.util.Set;

import javax.persistence.Id;

public class GaraDiAtletica extends Evento {

	@Id
	// @GeneratedValue
	private long id;

	// @OneToMany(mappedBy = "evento")
	private Set<Persona> setAtleti;

	private Persona vincitore;

	public GaraDiAtletica() {

	}

	public GaraDiAtletica(long _id, Set<Persona> _setAtleti, Persona _vincitore) {

	}

	public long getId() {
		return id;
	}

	public Set<Persona> getSetAtleti() {
		return setAtleti;
	}

	public void setSetAtleti(Set<Persona> _setAtleti) {
		this.setAtleti = _setAtleti;
	}

	public Persona getVincitore() {
		return vincitore;
	}

	public void setVincitore(Persona _vincitore) {
		this.vincitore = _vincitore;
	}

	@Override
	public String toString() {
		return "PartitaDiAtletica [ " + id + ", " + setAtleti + ", " + vincitore + " ]";

	}

}
