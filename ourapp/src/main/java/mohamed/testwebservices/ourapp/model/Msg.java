package mohamed.testwebservices.ourapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="msg_tab")
public class Msg implements Serializable{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String msg;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date dte;
	private String auth;
	private long utl_id;
	
	public Msg() {
		super();
	}
	public Msg(long id, String msg, Date dte, String auth, long utl_id) {
		super();
		this.id = id;
		this.msg = msg;
		this.dte = dte;
		this.auth = auth;
		this.utl_id = utl_id;
	}
	
	public long getUtl_id() {
		return utl_id;
	}
	public void setUtl_id(long utl_id) {
		this.utl_id = utl_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getDte() {
		return dte;
	}
	public void setDte(Date dte) {
		this.dte = dte;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}


	

}
