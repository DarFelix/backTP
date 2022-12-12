package com.activities.repository;

import java.time.LocalDate;
import java.util.List;

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

	@Query(value = "{call confirm_exists_user(:id)}", nativeQuery = true)
	User findUser(@Param("id") int idUser);

	@Procedure("create_user")
	void createUser(String name, String numberDoc, String city, String genre, LocalDate birthday, int idEmployee);

}
