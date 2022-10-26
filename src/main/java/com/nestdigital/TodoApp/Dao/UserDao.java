package com.nestdigital.TodoApp.Dao;

import com.nestdigital.TodoApp.Model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface UserDao extends CrudRepository<UserModel,Integer> {

    @Query(value = "SELECT `id`, `dob`, `email`, `name`, `password`, `phone`, `place` FROM `users` WHERE `email`=:email AND `password`=:password",nativeQuery = true)
    List<UserModel> user(String email,String password);




}
