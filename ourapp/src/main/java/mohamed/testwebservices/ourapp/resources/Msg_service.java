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

import mohamed.testwebservices.ourapp.Message_Iuser;
import mohamed.testwebservices.ourapp.model.Msg;



@Path("messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Msg_service {
	
	Message_Iuser ms = new Message_Iuser();
	
	@POST
	@Path("/add")
	public Msg setMsg(Msg m){
		return ms.addmessage(m) ;
	}
	
	@GET
	public List<Msg> getMsgs(){
		return ms.listeMsg();
	}
	
	@GET
	@Path("/{id}")
	public Msg getM(@PathParam("id") long id){
		return ms.getMsg(id);
	}
	
	@GET
	@Path("/user/{id}")
	public List<Msg> getMsg_user(@PathParam("id") long id){
		return ms.listMsgUser(id);
	}
	
	@PUT
	@Path("/{id}")
	public Msg upMsg(@PathParam("id") long id, Msg m){
		m.setId(id);
		return ms.update_msg(m);
	}
	@DELETE
	@Path("/{id}")
	public boolean del_user(@PathParam("id") long id){
		return  ms.delete_msg(id);
	}
	

}
