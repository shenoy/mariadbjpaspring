package com.jpademo.service;

import com.jpademo.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Todo> list();
    void save(Todo todo);
}
