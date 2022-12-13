package com.activities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activities.domain.Competition;
import com.activities.service.CompetitionService;

@RestController
@RequestMapping("/competition")
@CrossOrigin("*")
public class CompetitionController {
	
	@Autowired
	CompetitionService competitionService;
	
	@GetMapping
	public ResponseEntity<List<Competition>> listEnabledCompetitions(){
        List<Competition> list = competitionService.listCompetitions();
        return new ResponseEntity<List<Competition>>(list, HttpStatus.OK);
    }

}

