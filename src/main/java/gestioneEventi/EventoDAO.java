package gestioneEventi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class EventoDAO {

	private final EntityManager entityManager;

	public EventoDAO(EntityManager _entityManager) {
		this.entityManager = _entityManager;
	}

	public void save(Evento _evento) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(_evento);
		entityTransaction.commit();
		System.out.println("Evento salvato correttamente");
	}

	public Evento findById(long _id) {
		Evento eventoCercato = entityManager.find(Evento.class, _id);
		return eventoCercato;
	}

	public void findByIdAndDelete(long _id) {
		Evento eventoCercato = entityManager.find(Evento.class, _id);
		if (eventoCercato != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(eventoCercato);
			entityTransaction.commit();

		} else {
			System.out.println("Evento non trovato");
		}
	}

	public void refresh(long _id) {
		Evento eventoCercato = entityManager.find(Evento.class, _id);

		eventoCercato.setTitolo("REFRESH!");
		System.out.println("Evento con refresh del titolo:");
		System.out.println(eventoCercato);

		entityManager.refresh(eventoCercato);
		System.out.println("Evento con titolo presente nel database:");
		System.out.println(eventoCercato);

	}

	// - - - - - - - - - - - - - - - - getConcertiInStreaming(true/false)
	public List<Concerto> getConcertiInStreaming(boolean _trueFalse) {
		TypedQuery<Concerto> getConcertiInStreamingTrueQuery = entityManager
				.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = :_trueFalse", Concerto.class);
		return getConcertiInStreamingTrueQuery.getResultList();

	}

	// - - - - - - - - - - - - - - - - getConcertiPerGenere(List<GenereConcerto>)
	public List<Concerto> getConcertiPerGenere() {
		TypedQuery<Concerto> getConcertiPerGenereQuery = entityManager
				.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = :_trueFalse", Concerto.class);
		return null;

	}

}
