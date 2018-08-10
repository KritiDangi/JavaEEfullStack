package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.visa.prj.dto.RentalReportDTO;
import com.visa.prj.entity.Rental;

public class RentalDaoJPA implements RentalDao {

	@Override
	public void addRental(Rental r) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();		
	}

	@Override
	public List<RentalReportDTO> getReport() {
		EntityManager em=JPAUtil.getEntityManager();
		String jpql = "SELECT new com.visa.prj.dto.RentalReportDTO("
				+ "r.rentalId, c.email,  v.regNo, v.type, "
				+ "v.fuelType, r.rentalAmount, r.rentalDate) "
				+ " FROM Rental r inner join r.vehicle v inner join r.customer c";
		Query query=em.createQuery(jpql);
		return query.getResultList();
	}
}
