package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
