package packageOOP1Client;

import packageDAO.MobileDAO;
import packageDAO.MobileDaoDb;
import packageProduct.Mobile;
// dont use star for importing, checkstyle gives err..diff to know which package the class belongs to.
public class MobileClient {

	public static void main(String[] args) {
		Mobile m=new Mobile(611,"OnePlus5t",70000.00,"4G");
		MobileDAO dao=new MobileDaoDb();
		dao.addMobile(m);
		
	}
}
