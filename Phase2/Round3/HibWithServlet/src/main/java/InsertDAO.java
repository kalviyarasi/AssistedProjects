
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertDAO {

	
	public int insert(Employee e) {
		SessionFactory sf=Config.hibConfig();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int r=(int)s.save(e);
		return r;
	}
}



