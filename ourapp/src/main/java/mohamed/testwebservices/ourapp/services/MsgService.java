package mohamed.testwebservices.ourapp.services;

import java.sql.Date;

import mohamed.testwebservices.ourapp.model.Msg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MsgService {

	public Msg setMsg(){
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Msg.class);
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Msg m1 = new Msg();
		m1.setAuth("AAAAAAA");
		m1.setMsg("DDDDDDDDDD");
		m1.setDte(new Date(0));
		ss.save(m1);
		tr.commit();
		
		return m1;
	}

}
