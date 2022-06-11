package com.jpademo.repository;

import com.jpademo.entity.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    void delete(Todo deleted);
    List<Todo> findAll();
    Todo save(Todo persisted);




}