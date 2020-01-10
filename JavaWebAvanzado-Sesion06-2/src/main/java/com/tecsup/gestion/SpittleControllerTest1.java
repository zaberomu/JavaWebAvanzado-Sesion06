package com.tecsup.gestion;
import org.junit.Test;
import com.tecsup.gestion.HomeController;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
public class SpittleControllerTest1 {
	@Test
	public void testHomePage() throws Exception{
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		SpittleController controller = new SpittleController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
		//MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"));
		//assertEquals("home",controller.home());
	}
}
