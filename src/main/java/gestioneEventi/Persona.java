package gestioneEventi;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persone")

public class Persona {

	@Id
	// @GeneratedValue
	private long id;

	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;

	@Enumerated(EnumType.STRING)
	private Sesso sesso;

	@OneToMany(mappedBy = "persona")
	private Set<Partecipazione> listaPartecipazioni;

	@ManyToMany
	@JoinTable(name = "GaraDiAtletica_Persona", joinColumns = @JoinColumn(name = "Persona_id"), inverseJoinColumns = @JoinColumn(name = "GaraDiAtletica_id"))
	private Set<GaraDiAtletica> setGaraDiAtletica;

	// costruttori, getters e setters...
	public Persona() {

	}

	public Persona(long _id, String _nome, String _cognome, String _email, LocalDate _dataNascita, Sesso _sesso) {
		this.id = _id;
		this.nome = _nome;
		this.cognome = _cognome;
		this.email = _email;
		this.dataNascita = _dataNascita;
		this.sesso = _sesso;
	}

	public Persona(long _id, String _nome, String _cognome, String _email, LocalDate _dataNascita, Sesso _sesso,
			Set<Partecipazione> _listaPartecipazioni) {
		this.id = _id;
		this.nome = _nome;
		this.cognome = _cognome;
		this.email = _email;
		this.dataNascita = _dataNascita;
		this.sesso = _sesso;
		this.listaPartecipazioni = _listaPartecipazioni;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String _cognome) {
		this.cognome = _cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String _email) {
		this.email = _email;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate _dataNascita) {
		this.dataNascita = _dataNascita;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso _sesso) {
		this.sesso = _sesso;
	}

	public Set<Partecipazione> getListaPartecipazioni() {
		return listaPartecipazioni;
	}

	public void setListaPartecipazioni(Set<Partecipazione> _listaPartecipazioni) {
		this.listaPartecipazioni = _listaPartecipazioni;
	}

	@Override
	public String toString() {
		return "Persona [ " + id + ", " + nome + ", " + cognome + ", " + email + ", " + dataNascita + ", " + sesso
				+ " ]";

	}
}
