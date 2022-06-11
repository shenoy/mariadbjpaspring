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
        Todo todo1 = getTodo(1l, "wake up", "wake up at 6 am ", 1l);
        Todo todo2 = getTodo(1l, "brush teeth", "brush teeth ", 2l);
        Todo todo3 = getTodo(1l, "hair", "comb hair", 3l);
        Todo todo4 = getTodo(1l, "shower", "have shower ", 4l);
        Todo todo5 = getTodo(1l, "breakfast", "have breakfast ", 5l);

        todoSearchService.save(todo1);
        todoSearchService.save(todo2);
        todoSearchService.save(todo3);
        todoSearchService.save(todo4);
        todoSearchService.save(todo5);

        todoSearchService.list().forEach(System.out::println);
    }

    static Todo getTodo(Long version, String title, String description, Long id){
        Todo todo = new Todo();
        todo.setVersion(version);
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setId(id);
        return todo;
    }
}
