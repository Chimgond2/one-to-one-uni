package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetBranchAddress {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 3);

		if (branch != null) {
			System.out.println(branch.getId());
			System.out.println(branch.getName());
			System.out.println(branch.getPhone());
			System.out.println("===============");
			Address address = branch.getAddress();
			System.out.println(address.getCountry());
			System.out.println(address.getState());
			System.out.println(address.getId());
		}
	}

}
