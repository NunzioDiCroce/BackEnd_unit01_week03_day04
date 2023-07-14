package gestioneEventi;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class GaraDiAtletica extends Evento {

	@ManyToMany
	@JoinTable(name = "GaraDiAtletica_Persona", joinColumns = @JoinColumn(name = "GaraDiAtletica_id"), inverseJoinColumns = @JoinColumn(name = "Persona_id"))
	private Set<Persona> setAtleti;

	@ManyToOne
	@JoinColumn(name = "GaraDiAtletica_id", referencedColumnName = "id")
	private Persona vincitore;

	public GaraDiAtletica() {

	}

	public GaraDiAtletica(Set<Persona> _setAtleti, Persona _vincitore) {
		// super(titolo, dataEvento, descrizione, tipoEvento,
		// numeroMassimoPartecipanti);
		this.setAtleti = _setAtleti;
		this.vincitore = _vincitore;

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
		return "PartitaDiAtletica [ " + setAtleti + ", " + vincitore + " ]";

	}

}
