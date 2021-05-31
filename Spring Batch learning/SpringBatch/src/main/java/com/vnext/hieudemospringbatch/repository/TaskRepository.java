package com.vnext.hieudemospringbatch.repository;

import com.vnext.hieudemospringbatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<User,Long> {
}
