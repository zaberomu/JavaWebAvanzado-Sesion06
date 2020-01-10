package com.tecsup.gestion;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.tecsup.gestion.HomeController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.test.web.servlet.MockMvc;
public class HomeControllerTest {
@Test
public void testHomePage() throws Exception{
	HomeController controller = new HomeController();
	MockMvc mockMvc = standaloneSetup(controller).build();
	mockMvc.perform(get("/")).andExpect(view().name("home"));
	//assertEquals("home",controller.home());
}
}
