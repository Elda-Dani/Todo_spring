package com.nestdigital.TodoApp.Controller;

import com.nestdigital.TodoApp.Dao.TodoDao;
import com.nestdigital.TodoApp.Model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class TodoController {

    @Autowired
    private TodoDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpost",consumes = "application/json",produces = "application/json")
    public String addpost(@RequestBody TodoModel post){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentdate=String.valueOf(dt.format(now));
        post.setPostdate(currentdate);
        System.out.println(post.toString());
        dao.save(post);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/single", consumes = "application/json", produces = "application/json")
    List<Map<String,String>> viewsingle(@RequestBody TodoModel todo){
        return (List<Map<String,String>>) dao.post(todo.getUserid());
    }


}
