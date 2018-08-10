package packageDAO;

import packageProduct.Mobile;

public class MobileDaoDb implements MobileDAO {

	@Override
	public void addMobile(Mobile mobile) {
		System.out.println(mobile.getName()+" added to database");
		
	}
}
