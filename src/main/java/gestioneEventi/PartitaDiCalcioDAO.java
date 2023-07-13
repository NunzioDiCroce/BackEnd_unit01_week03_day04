package gestioneEventi;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartitaDiCalcioDAO {

	private final EntityManager entityManager;

	public PartitaDiCalcioDAO(EntityManager _entityManager) {
		this.entityManager = _entityManager;
	}

	public void save(PartitaDiCalcio _partitaDiCalcio) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(_partitaDiCalcio);
		entityTransaction.commit();
		System.out.println("PartitaDiCalcio salvata correttamente");
	}

	public PartitaDiCalcio findById(long _id) {
		PartitaDiCalcio partitaDiCalcioCercata = entityManager.find(PartitaDiCalcio.class, _id);
		return partitaDiCalcioCercata;
	}

	public void findByIdAndDelete(long _id) {
		PartitaDiCalcio partitaDiCalcioCercata = entityManager.find(PartitaDiCalcio.class, _id);
		if (partitaDiCalcioCercata != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(partitaDiCalcioCercata);
			entityTransaction.commit();

		} else {
			System.out.println("PartitaDiCalcio non trovata");
		}
	}

	public void refresh(long _id) {
		// PartitaDiCalcio partitaDiCalcioCercata =
		// entityManager.find(PartitaDiCalcio.class, _id);

		// partitaDiCalcioCercata.setTitolo("REFRESH!");
		// System.out.println("PartitaDiCalcio con refresh del titolo:");
		// System.out.println(partitaDiCalcioCercata);

		// entityManager.refresh(partitaDiCalcioCercata);
		// System.out.println("PartitaDiCalcio con titolo presente nel database:");
		// System.out.println(partitaDiCalcioCercata);

	}

}
