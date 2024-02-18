package com.au.mafik.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.au.mafik.model.UserDTO1;
@Component
public class DAO {

	public void save(UserDTO1 dto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		entityManager.close();
	}
	
	
	
	
	public List<UserDTO1> usersDetails() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Query query = entityManager.createQuery("from UserDTO1");
		List<UserDTO1> list = query.getResultList();
		entityManager.close();
		return list;
	}




	public UserDTO1 getUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		UserDTO1 find= entityManager.find(UserDTO1.class, id);
		return find;
		// TODO Auto-generated method stub
		
	}




	public void saveupdate(UserDTO1 userup ) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(userup);
		entityTransaction.commit();
		entityManager.close();
	}




	public void delete(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		UserDTO1 find = entityManager.find(UserDTO1.class, id);
		entityManager.remove(find);
		entityTransaction.commit();
		entityManager.close();
		
	}
	
}
