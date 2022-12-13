package com.activities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.activities.domain.Competition;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Integer> {

	@Query(value = "{call list_enabled_competitions()}", nativeQuery = true)
	List<Competition> listEnabledCompetitions();

}
