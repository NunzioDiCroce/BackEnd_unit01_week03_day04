package gestioneEventi;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "locations")

public class Location {

	@Id
	// @GeneratedValue
	private long id;

	private String nome;
	private String citta;

	@OneToMany(mappedBy = "location")
	private Set<Evento> eventi;

	// costruttori, getters e setters...
	public Location() {

	}

	public Location(long _id, String _nome, String _citta) {
		this.id = _id;
		this.nome = _nome;
		this.citta = _citta;
	}

	public Location(long _id, String _nome, String _citta, Set<Evento> _eventi) {
		this.id = _id;
		this.nome = _nome;
		this.citta = _citta;
		this.eventi = _eventi;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String _citta) {
		this.citta = _citta;
	}

	public Set<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(Set<Evento> _eventi) {
		this.eventi = _eventi;
	}

	@Override
	public String toString() {
		return "Location [ " + id + ", " + nome + ", " + citta + " ]";

	}
}
