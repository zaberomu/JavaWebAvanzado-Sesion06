package com.tecsup.gestion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/spittles")
public class SpittleController {
@Autowired	
private SpittleRepository  GestorSpittle;
public SpittleController(SpittleRepository spittleRepository ) {
	this.GestorSpittle = spittleRepository;
}
@RequestMapping(method=RequestMethod.GET)
public String spittles(Model model) {
	
	//createSpittleList( 20);
	model.addAttribute("spittleList",GestorSpittle.findSpittles(Long.MAX_VALUE, 20));
	return "spittles";
}
}
