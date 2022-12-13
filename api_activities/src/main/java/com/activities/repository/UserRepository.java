package com.activities.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.activities.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "{call list_users()}", nativeQuery = true)
	List<User> listUsers();

	@Procedure("create_user")
	void createUser(String name, String numberDoc, String city, String genre, LocalDate birthday, int idEmployee);
	
	@Query(value = "{call search_user_employ(:id)}", nativeQuery = true)
	public Optional<User> findUserByIdEmploy(@Param("id") int idEmployee);
	
	@Procedure("delete_inscript_user")
	void deletePreInscriptUser(int idUser);

}
