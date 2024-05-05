package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
