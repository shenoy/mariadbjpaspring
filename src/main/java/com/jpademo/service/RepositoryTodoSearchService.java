package com.jpademo.service;


import com.jpademo.entity.Todo;
import com.jpademo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public final class RepositoryTodoSearchService implements CourseService {

    @Autowired
    private  TodoRepository repository;

    @Transactional
    @Override
    public List<Todo> list(){
        List<Todo> searchResults = repository.findAll();
        return searchResults;
    }

    public void save(Todo todo){
        repository.save(todo);
    }
}