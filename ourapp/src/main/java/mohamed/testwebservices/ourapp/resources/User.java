package mohamed.testwebservices.ourapp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mohamed.testwebservices.ourapp.Implement_Iuser;
import mohamed.testwebservices.ourapp.model.Utilisateur;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class User {
	
	//MsgService srv = new MsgService();
	Implement_Iuser users = new Implement_Iuser();

	@POST
	@Path("/add")
	public Utilisateur setUser(Utilisateur u){
		return users.adduser(u) ;
	}
	
	@GET
	public List<Utilisateur> getusers(){
		return users.listeUser() ;
	}
	 
	@GET
	@Path("/{id}")
	public Utilisateur getuser(@PathParam("id") long id){
		return users.getUser(id);
	}
	
	@PUT
	@Path("/{id}")
	public Utilisateur upUser(@PathParam("id") long id, Utilisateur u){
		u.setId(id);
		return users.update_user(u);
	}
	
	@DELETE
	@Path("/{id}")
	public boolean del_user(@PathParam("id") long id){
		return  users.delete_user(id);
	}
	
}
