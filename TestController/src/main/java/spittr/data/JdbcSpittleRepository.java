package spittr.data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spittr.Spittle;
@Repository
public class JdbcSpittleRepository implements SpittleRepository {
	private List<Spittle> spittles = new ArrayList<Spittle>();
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		/*List<Spittle> spittles = new ArrayList<Spittle>();*/
	    for (long i=0; i < count; i++) {
	      spittles.add(new Spittle("Spittle " + i, new Date()));
	    }
	    return spittles;
	}

	@Override
	public Spittle findOne(long id) {
		 Date date = new Date();
		  Spittle obj = new Spittle("Spittle "+ id,date);
		  String str = "Spittle " + id;
		  for (Spittle spittle: spittles) {
			  if (spittle.getMessage().equals(str)) { 				
				  obj=spittle;
			}		      
	    }
		  return obj;	
	}

}
