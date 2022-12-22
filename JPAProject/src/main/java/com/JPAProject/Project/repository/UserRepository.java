package com.JPAProject.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPAProject.Project.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
