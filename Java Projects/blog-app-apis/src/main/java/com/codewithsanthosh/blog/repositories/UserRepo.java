package com.codewithsanthosh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsanthosh.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
