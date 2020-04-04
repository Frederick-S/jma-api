package jmo;

import com.fasterxml.jackson.databind.ObjectMapper;
import jmo.dto.AnalysisRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class TokenizerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnBadRequest() throws Exception {
        mockMvc.perform(post("/tokenize")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(new AnalysisRequest())))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void shouldGenerateTokens() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        AnalysisRequest analysisRequest = new AnalysisRequest();
        analysisRequest.setText("もしも自分のことを「馬鹿ブス貧乏」と言われたなら、当然のことながらいい気はしないだろう。");

        mockMvc.perform(post("/tokenize")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(analysisRequest)))
                .andExpect(status().isOk())
                .andDo(mvcResult -> {
                    String body = mvcResult.getResponse().getContentAsString();

                    Assertions.assertTrue(body.length() > 0);
                });
    }
}
