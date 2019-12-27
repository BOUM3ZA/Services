package mohamed.testwebservices.ourapp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mohamed.testwebservices.ourapp.model.Msg;
import mohamed.testwebservices.ourapp.model.Utilisateur;

public class Message_Iuser implements Iuser{
	
	Configuration con = new Configuration().configure().addAnnotatedClass(Msg.class);
	SessionFactory sf = con.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	@Override
	public Utilisateur adduser(Utilisateur u) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Utilisateur> listeUser() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Utilisateur getUser(long id_user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Utilisateur update_user(Utilisateur u) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean delete_user(long id_user) {
		// TODO Auto-generated method stub
		return false;
	}

//**********************************implemented methodes ***********************	
	
	@Override
	public Msg addmessage(Msg m) {
		ss.save(m);
		tr.commit();
		return m;
	}
	
	@Override
	public List<Msg> listeMsg() {
		List<Msg> list = ss.createCriteria(Msg.class).list();
		return list;
	}

	@Override
	public List<Msg> listMsgUser(long id_user) {
		Query query = ss.createNativeQuery("select id, msg, dte, auth from msg_tab m where m.utl_id = "+id_user);
		List<Msg> results = query.list();
		//List<Msg> list = ss.createNamedQuery("select * from msg_tab m where m.utl_id = "+id_user).list();
		return results;
	}

	@Override
	public Msg update_msg(Msg m) {
		ss.update(m);
		tr.commit();
		return m;
	}

	@Override
	public boolean delete_msg(long id_msg) {
		Message_Iuser msr = new Message_Iuser();
		Msg m = msr.getMsg(id_msg);
		ss.delete(m);
		tr.commit();
		return false;
	}
	
	@Override
	public Msg getMsg(long id_msg) {
		Msg m = (Msg) ss.get(Msg.class, id_msg);
		return m;
	}

}
