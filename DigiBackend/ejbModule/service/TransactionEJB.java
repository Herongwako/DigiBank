package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;


@Stateless
@LocalBean
public class TransactionEJB {
	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	public void AddNewTran(TransactionEntity transactionEntity) {
		System.out.println("====================adding transaction to the DB=================");
		em.persist(transactionEntity);
	}


}
