package com.example.guardian.controller;

import com.example.guardian.model.Groot;
import com.example.guardian.model.SomemessageNotFoundException;
import com.example.guardian.model.Yondu;
import com.example.guardian.service.GrootService;
import com.example.guardian.service.YonduService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.MissingFormatArgumentException;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @MockBean
    private GrootService grootService;

    @MockBean
    private YonduService yonduService;


    @Autowired
    private MockMvc mockMvc;
    Groot groot = new Groot("test");
    Yondu yondu = new Yondu(1.0, 1.0);

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void canTranslate() throws Exception {
        when(grootService.groot("test")).thenReturn(groot);
        mockMvc.perform(get("/groot").param("received", "test"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received", is("test")))
                .andExpect(jsonPath("translated", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void someMessageNotFoundResponse() throws Exception {
        when(grootService.groot(null)).thenThrow(new SomemessageNotFoundException("I am Groot!"));
        mockMvc.perform(get("/groot"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void canCountSpeed() throws Exception {
        when(yonduService.yondu(1.0, 1.0)).thenReturn(yondu);
        mockMvc.perform(get("/yondu").param("distance", "1.0")
                .param("time", "1.0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(1.0)))
                .andExpect(jsonPath("time", is(1.0)))
                .andExpect(jsonPath("speed", is(1.0)))
                .andDo(print());
    }

    @Test
    public void missingDistanceAndTimeErrorResponse() throws Exception {
        when(yonduService.yondu(null, null)).thenThrow(new SomemessageNotFoundException("Please provide a distance and a time!"));
        mockMvc.perform(get("/yondu"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("Please provide a distance and a time!")))
                .andDo(print());
    }





}
