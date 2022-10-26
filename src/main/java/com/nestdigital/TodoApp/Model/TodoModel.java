package com.nestdigital.TodoApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class TodoModel {
    @Id
    @GeneratedValue

    private int id;
    private int userid;
    private String todo;
    private String postdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public TodoModel() {
    }

    public TodoModel(int id, int userid, String todo, String postdate) {
        this.id = id;
        this.userid = userid;
        this.todo = todo;
        this.postdate = postdate;
    }
}
