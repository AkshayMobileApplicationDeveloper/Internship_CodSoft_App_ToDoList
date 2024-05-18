package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.todolist.Adapter.TodoAdapter;
import com.example.todolist.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView task_Recycler_view;
    private TodoAdapter taskAdapter;
    private List<ToDoModel> toDoModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.parseColor("#ffe2d0"));

        toDoModels= new ArrayList<>();
        task_Recycler_view=findViewById(R.id.task_Recycler_view);

        task_Recycler_view.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter=new TodoAdapter(this);
        task_Recycler_view.setAdapter(taskAdapter);



        ToDoModel task=new ToDoModel();
        task.setTask("This is the task what to do today..........");
        task.setDiscription("Now, I am writing something about this project ." +
                "which is used the function what i am coding here ");
        task.setStatus(0);
        task.setId(1);


        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);
        toDoModels.add(task);


        taskAdapter.setToDoList(toDoModels);

    }
}