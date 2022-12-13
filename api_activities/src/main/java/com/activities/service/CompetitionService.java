package com.activities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activities.domain.Competition;
import com.activities.repository.CompetitionRepository;

@Service
public class CompetitionService {

	@Autowired
	CompetitionRepository competitionRepository;

	public List<Competition> listCompetitions() {
		return competitionRepository.listEnabledCompetitions();
	}

}