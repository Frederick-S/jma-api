package jmo.controller;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;
import jmo.dto.AnalysisRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TokenizerController {
    @ResponseBody
    @PostMapping("/tokenize")
    public ResponseEntity<List<Token>> tokenize(@RequestBody AnalysisRequest analysisRequest) {
        if (StringUtils.isEmpty(analysisRequest.getText())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Tokenizer tokenizer = new Tokenizer();
        List<Token> tokens = tokenizer.tokenize(analysisRequest.getText());

        return new ResponseEntity<>(tokens, HttpStatus.OK);
    }
}
