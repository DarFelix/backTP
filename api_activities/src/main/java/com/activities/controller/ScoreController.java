package com.activities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activities.domain.Score;
import com.activities.service.ScoreService;

@RestController
@RequestMapping("/score")
@CrossOrigin("*")
public class ScoreController {

	@Autowired
	ScoreService scoreService;

	@GetMapping("/confirmCompetition/{idUser}")
	public ResponseEntity<List<Score>> confirmCompetition(@PathVariable int idUser) {
		List<Score> list = scoreService.confirmCompetition(idUser);
		return new ResponseEntity<List<Score>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/top/{idCompetition}")
	public ResponseEntity<List<Score>> topClasification(@PathVariable int idCompetition) {
		List<Score> list = scoreService.topClasification(idCompetition);
		return new ResponseEntity<List<Score>>(list, HttpStatus.OK);
	}
	
	@PostMapping
    public ResponseEntity<?> createScore(@RequestBody Score score){
		scoreService.createScore(score);
        return new ResponseEntity<Object>("participación guardada", HttpStatus.CREATED);
    }
}
