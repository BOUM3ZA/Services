package mohamed.testwebservices.ourapp;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mohamed.testwebservices.ourapp.model.Msg;
import mohamed.testwebservices.ourapp.model.Utilisateur;



public class Implement_Iuser implements Iuser{

	Configuration con = new Configuration().configure().addAnnotatedClass(Utilisateur.class);
	SessionFactory sf = con.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();

	@Override
	public Utilisateur adduser(Utilisateur u) {
		ss.save(u);
		tr.commit();
		return u;
	}
    
	@Override
	public List<Utilisateur> listeUser() {
        List<Utilisateur> list = ss.createCriteria(Utilisateur.class).list();
		return list;
	}

	@Override
	public Utilisateur getUser(long id_user) {
		Utilisateur u = (Utilisateur) ss.get(Utilisateur.class, id_user);
		return u;
	}
	
	@Override
	public Utilisateur update_user(Utilisateur u) {
		ss.update(u);
		tr.commit();
		return u;
	}
	
	@Override
	public boolean delete_user(long id_user) {
		Implement_Iuser isr = new Implement_Iuser();
		Utilisateur u = isr.getUser(id_user);
		ss.delete(u);
		tr.commit();
		return true;
	}
	
	//**************************Messages Methodes **********************
	@Override
	public Msg addmessage(Msg m) {
		return null;
	}

	@Override
	public List<Msg> listeMsg() {
		return null;
	}

	@Override
	public List<Msg> listMsgUser(long id_user) {
		//List<Msg> list = (List<Msg>) ss.get(Msg.class, utl.id_user);
		return null;
	}

	@Override
	public Msg update_msg(Msg m) {
		
		return null;
	}

	@Override
	public boolean delete_msg(long id_msg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Msg getMsg(long id_msg) {
		// TODO Auto-generated method stub
		return null;
	}


}
