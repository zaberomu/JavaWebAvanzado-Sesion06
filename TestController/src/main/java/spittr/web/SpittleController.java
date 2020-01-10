package spittr.web;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	 private static final Logger logger = LoggerFactory.getLogger(SpittleController.class);	
	  
	  private static final String MAX_LONG_AS_STRING = "9223372036854775807";
	
	  private SpittleRepository spittleRepository;

	  @Autowired
	  public SpittleController(SpittleRepository spittleRepository) {
	    this.spittleRepository = spittleRepository;
	    logger.info("paso la creacion constructor");
	   /* spittleRepository.findSpittles(Long.MAX_VALUE, 20);*/
	  }

	  @RequestMapping(method=RequestMethod.GET)
	    public String Kpittles(Model model) {
		  
		/* List<Spittle> spittles = new ArrayList<Spittle>();
		 spittles = createSpittleList(20);*/
		   logger.info("paso createSpittlesList");
	        model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
	      /*  return "1";*/
	       return "spittles";
	  }
	
	  @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
	  public String spittle(@PathVariable("spittleId") long spittleId, Model model) {
		/*  Date date = new Date();
		  Spittle spittle = new Spittle("Spittle "+spittleId ,date) ;
          spittle = findOne(spittleId);*/
	
	    model.addAttribute("spittle",spittleRepository.findOne(spittleId));
	    return "spittle";
	  }

  
	/*  private List<Spittle> createSpittleList(int count) {
		    List<Spittle> spittles = new ArrayList<Spittle>();
		    for (long i=0; i < count; i++) {
		      spittles.add(new Spittle("Spittle " + i, new Date()));
		      logger.info("Valor "+ i);
		    }
		    return spittles;
		  }*/
	  	  
	  private Spittle findOne(long id){
		  Date date = new Date();
		  Spittle obj = new Spittle("Spittle "+ id,date);
		  String str = "Spittle " + id;
		  for (Spittle spittle: spittleRepository.findSpittles(Long.MAX_VALUE, 20)) {
			  if (spittle.getMessage().equals(str)) { 
				  logger.info("Encontrado spittleId "+spittle.getMessage());
				  obj=spittle;
			}		      
	    }
		  return obj;	   
}

}