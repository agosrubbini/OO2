package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

	private List<Usuario> usuarios;
	
	
	public Twitter() {
		this.usuarios= new ArrayList<Usuario>();
	}
	
	/*public void agregarUsuario(Usuario us) {
		List existe = this.usuarios.stream().filter(usr -> usr.mismoNombre(us)).collect(Collectors.toList());
		if (existe.isEmpty())
			this.usuarios.add(us);
	}*/
	
	public Usuario agregarUsuario2(String nom) {
		if ( this.usuarios.stream().noneMatch(usr -> usr.mismoNombre(nom))) {
			Usuario us=new Usuario(nom);
			this.usuarios.add(us);
			return us;
		}
		else return null;
	}
	
	//flatMap
	
	public boolean eliminarUsuario(String nom) {
		Usuario us=this.usuarios.stream().filter(usr ->usr.mismoNombre(nom)).findFirst().orElse(null);
		if (us != null) {
			List<Retweet> rts = us.getRetweets();
		//for (int i = 0; i < rt.size(); i++) {
		//for (Retweet rt: rts) {	
			rts.stream().forEach(rt->this.usuarios.stream().forEach(u -> u.elimarRetweet(rt) ));
			/*for (Usuario u: this.usuarios) {
				u.elimarRetweet(rt);
			}*/
		//}
			us.eliminarTweets();
			this.usuarios.remove(us);
			return true;
		}
		return false;
	}
	//streamear todos los usr diciendole (pasandole como parametro) a cada uno q se va a eliminar un usuario(el q llego en parametro)
	//y cada usr va a tener que sacar de sus tw los que esten relacionados con ese usr. 
	//esto lo hace preguntandoles si estan relacionados, para lo q cada tw tiene q conocer a su autor(el rt va a responder por el autor de su tw  original)
	//tmb puedo filtrar por los tw q son de ese autor
}
