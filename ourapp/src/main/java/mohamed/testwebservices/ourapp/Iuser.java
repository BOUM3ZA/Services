package mohamed.testwebservices.ourapp;

import java.util.List;

import mohamed.testwebservices.ourapp.model.Msg;
import mohamed.testwebservices.ourapp.model.Utilisateur;

public interface Iuser {
	
	public Utilisateur adduser(Utilisateur u);
	public Msg addmessage(Msg m);
	public List<Utilisateur> listeUser();
	public Utilisateur getUser(long id_user);
	public Msg getMsg(long id_msg);
	public List<Msg> listeMsg();
	public List<Msg> listMsgUser(long id_user);
	public Utilisateur update_user(Utilisateur u);
	public Msg update_msg(Msg m);
	public boolean delete_user(long id_user);
	public boolean delete_msg(long id_msg);
	
}
