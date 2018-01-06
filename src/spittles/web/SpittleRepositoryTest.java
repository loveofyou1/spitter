package spittles.web;

import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import spittles.Spittle;
import spittles.data.SpittleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


public class SpittleRepositoryTest {

    @Test
    public void shouldShowRecentSpittles() throws Exception {
        //List<Spittle> expectedSpittles = createSpittleList(20);
        List<Spittle> expectedSpittles = createSpittleList(50);
        SpittleRepository mockSpittleRepository = mock(SpittleRepository.class);
        //when(mockSpittleRepository.findSpittle(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
        when(mockSpittleRepository.findSpittle((long) 238900, 50)).thenReturn(expectedSpittles);

        SpittleController spittleController = new SpittleController(mockSpittleRepository);
        MockMvc mockMvc = standaloneSetup(spittleController).setSingleView(new InternalResourceView("/spittles.jsp  " +
                "")).build();
        /**mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"))
         .andExpect(model().attributeExists("spittleList"))
         .andExpect(model().attribute("spittleList", JUnitMatchers.hasItems(expectedSpittles.toArray())));*/
        mockMvc.perform(get("/spittles?before=238900&count=50")).andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", JUnitMatchers.hasItems(expectedSpittles.toArray())));
    }


    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
