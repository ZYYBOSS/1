package com.java2.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.java2.web.entity.AddressEntity;

@Repository
public class AddressRepository implements IAddressRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<AddressEntity> getAddress(){		
		return em.createQuery("from AddressEntity",AddressEntity.class).getResultList();
	}
	
	@Override
	public void addAddress(AddressEntity address){
		em.persist(address);
	}
	@Override
	
	public void deleteAddress(Long id) {
		em.remove(em.find(AddressEntity.class, id));
	}


	@Override
	public void updateAddress(AddressEntity address) {
		em.merge(address);
	}

	@Override
	public AddressEntity getAddressById(Long id) {
		return em.find(AddressEntity.class, id) ;
	}

}
