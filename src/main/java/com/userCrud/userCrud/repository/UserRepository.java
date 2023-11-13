package com.userCrud.userCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userCrud.userCrud.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
