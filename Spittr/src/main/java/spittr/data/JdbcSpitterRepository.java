package spittr.data;
import org.springframework.stereotype.Repository;

import spittr.Spitter;
@Repository
public class JdbcSpitterRepository implements SpitterRepository {
	private Spitter objSpitter = new Spitter();
	@Override
	public Spitter save(Spitter spitter) {
		objSpitter.setId((long) 1);
		objSpitter.setUsername(spitter.getUsername());
		objSpitter.setPassword(spitter.getPassword());
		objSpitter.setFirstName(spitter.getFirstName());
		objSpitter.setLastName(spitter.getLastName());
		objSpitter.setEmail(spitter.getEmail());
		return objSpitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		// TODO Auto-generated method stub
		return objSpitter;
	}

}
