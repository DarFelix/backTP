package com.activities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activities.domain.Score;
import com.activities.repository.ScoreRepository;

@Service
public class ScoreService {

	@Autowired
	ScoreRepository scoreRepository;

	public List<Score> confirmCompetition(int idUser) {
		return scoreRepository.confirmCompetition(idUser);
	}
	
	public List<Score> topClasification(int idCompetition) {
		return scoreRepository.topClasification(idCompetition);
	}
	
	public void createScore(Score score) {
		scoreRepository.createScore(score.getScore(), score.getUser().getIdUser(), score.getCompetition().getCompetition_id());

	}
}
