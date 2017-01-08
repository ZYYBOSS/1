package com.java2.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.java2.web.entity.UserEntity;

@Repository
public class UserRepository implements IUserRepositiory {
	@PersistenceContext
	EntityManager em;
	
	public List<UserEntity> getUsers(){
		return em.createQuery("from UserEntity",UserEntity.class).getResultList();
	}
	
	public void addUser(UserEntity user){
		em.persist(user);
	}
	
	@Override
	public void deleteUser(Long id) {
		em.remove(em.find(UserEntity.class, id));
	}

	@Override
	public UserEntity getUserById(Long id){
		return em.find(UserEntity.class, id);
	}

	@Override
	public void updateUser(UserEntity user) {
		em.merge(user);
	}


}
