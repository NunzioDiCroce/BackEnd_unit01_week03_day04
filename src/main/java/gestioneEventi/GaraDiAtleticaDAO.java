package gestioneEventi;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GaraDiAtleticaDAO {

	private final EntityManager entityManager;

	public GaraDiAtleticaDAO(EntityManager _entityManager) {
		this.entityManager = _entityManager;
	}

	public void save(GaraDiAtletica _garaDiAtletica) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(_garaDiAtletica);
		entityTransaction.commit();
		System.out.println("GaraDiAtletica salvata correttamente");
	}

	public GaraDiAtletica findById(long _id) {
		GaraDiAtletica garaDiAtleticaCercata = entityManager.find(GaraDiAtletica.class, _id);
		return garaDiAtleticaCercata;
	}

	public void findByIdAndDelete(long _id) {
		GaraDiAtletica garaDiAtleticaCercata = entityManager.find(GaraDiAtletica.class, _id);
		if (garaDiAtleticaCercata != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(garaDiAtleticaCercata);
			entityTransaction.commit();

		} else {
			System.out.println("GaraDiAtletica non trovata");
		}
	}

	public void refresh(long _id) {
		// GaraDiAtletica garaDiAtleticaCercata =
		// entityManager.find(GaraDiAtletica.class, _id);

		// garaDiAtleticaCercata.setTitolo("REFRESH!");
		// System.out.println("GaraDiAtletica con refresh del titolo:");
		// System.out.println(garaDiAtleticaCercata);

		// entityManager.refresh(garaDiAtleticaCercata);
		// System.out.println("GaraDiAtletica con titolo presente nel database:");
		// System.out.println(garaDiAtleticaCercata);

	}

}
