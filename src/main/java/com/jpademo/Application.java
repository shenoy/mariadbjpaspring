package com.jpademo;


import com.jpademo.config.ApplicationConfiguration;
import com.jpademo.entity.Todo;
import com.jpademo.repository.TodoRepository;
import com.jpademo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {



    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        CourseService todoSearchService = applicationContext.getBean( CourseService.class);
        Todo todo = new Todo();
        todo.setVersion(1l);
        todo.setTitle("todo title");
        todo.setDescription("no description");
        todo.setId(1l);
        todoSearchService.save(todo);
        System.out.println(todoSearchService.list());
    }
}
