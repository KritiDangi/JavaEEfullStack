package com.visa.prj.Client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.visa.prj.Entity.Item;
import com.visa.prj.Entity.Mobile;
import com.visa.prj.Entity.Tv;
import com.visa.prj.Util.JPAUtil;

public class InheritanceClient {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		/*Mobile m =new Mobile(1,"OnePlus 5T",45000.00,"4G");
		Tv tv=new Tv(2,"Sony Bravia",120000.00,"OLED");
		em.persist(m);
		em.persist(tv);
		*/
		
		Query query = em.createQuery("from  items");
		List<Item> items = query.getResultList();
		for(Item i : items) {
			System.out.println(i.getName());
			if( i instanceof Mobile) {
				Mobile m = (Mobile) i;
				System.out.println(m.getConnectivity());
			}
		}

		em.getTransaction().commit();
	}

}
