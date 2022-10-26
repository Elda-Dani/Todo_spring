package com.nestdigital.TodoApp.Dao;

import com.nestdigital.TodoApp.Model.TodoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface TodoDao extends CrudRepository<TodoModel,Integer> {



    @Query(value = "SELECT t.`id`, t.`postdate`, t.`todo`, t.`userid` FROM `todos` t JOIN users u ON u.id=t.userid WHERE t.`userid`=:userid",nativeQuery = true)
    List<Map<String,String>> post(Integer userid);

}
