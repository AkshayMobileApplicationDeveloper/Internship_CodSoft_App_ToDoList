package com.example.todolist.Model;

public class ToDoModel {
    private  int id , status ;
    private  String Task;
    private  String discription;

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }


}
