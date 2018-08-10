package packageDAO;

import packageProduct.Mobile;

public class MobileDaoFile implements MobileDAO {

	@Override
	public void addMobile(Mobile mobile) {
		System.out.println(mobile.getName()+" added to file");
	}

}
