package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchAddress {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=new Branch();
		branch.setName("capgemini ");
		branch.setPhone(00330044);
		
		Address address=new Address();
		address.setCountry("india");
		address.setState("karnataka");
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}

}
