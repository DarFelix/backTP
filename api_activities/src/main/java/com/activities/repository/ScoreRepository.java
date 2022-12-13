package com.activities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.activities.domain.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {

	@Query(value = "{call confirm_user_in_competition(:id)}", nativeQuery = true)
	List<Score>confirmCompetition(@Param("id") int idUser);
	
	@Query(value = "{call top_clasification(:id)}", nativeQuery = true)
	List<Score>topClasification(@Param("id") int idCompetition);
	
	@Procedure("create_registry")
	void createScore(double score, int idUser, int idCompetition);
}
