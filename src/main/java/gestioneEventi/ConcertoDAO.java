package gestioneEventi;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ConcertoDAO {

	private final EntityManager entityManager;

	public ConcertoDAO(EntityManager _entityManager) {
		this.entityManager = _entityManager;
	}

	public void save(Concerto _concerto) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(_concerto);
		entityTransaction.commit();
		System.out.println("Concerto salvato correttamente");
	}

	public Concerto findById(long _id) {
		Concerto concertoCercato = entityManager.find(Concerto.class, _id);
		return concertoCercato;
	}

	public void findByIdAndDelete(long _id) {
		Concerto concertoCercato = entityManager.find(Concerto.class, _id);
		if (concertoCercato != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(concertoCercato);
			entityTransaction.commit();

		} else {
			System.out.println("Concerto non trovato");
		}
	}

	public void refresh(long _id) {
		// Concerto concertoCercato = entityManager.find(Concerto.class, _id);

		// concertoCercato.setTitolo("REFRESH!");
		// System.out.println("Concerto con refresh del titolo:");
		// System.out.println(concertoCercato);

		// entityManager.refresh(concertoCercato);
		// System.out.println("Concerto con titolo presente nel database:");
		// System.out.println(concertoCercato);

	}

}
