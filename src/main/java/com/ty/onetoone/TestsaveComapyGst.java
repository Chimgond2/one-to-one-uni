package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestsaveComapyGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("sifiyan");
		company.setPhone(3311);
		company.setWeb("www.bina dekhe type.com");

		Gst gst = new Gst();
		gst.setGst_number("69");
		gst.setCountry("india");
		gst.setState("karnataka");
		gst.setCompany(company);

		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);

		entityTransaction.commit();

	}

}
