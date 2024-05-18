package com.example.todolist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.MainActivity;
import com.example.todolist.Model.ToDoModel;
import com.example.todolist.R;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder> {
    private List<ToDoModel> ToDoList;
    private MainActivity activity;

    public TodoAdapter(MainActivity activity) {
        this.activity = activity;
    }

    @NonNull
    @Override
    public TodoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.tasklayout,parent,false);
        return  new TodoAdapter.ViewHolder(itemView);

//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tasklayout,parent,false);
//        return new TodoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.ViewHolder holder, int position) {
        ToDoModel item = ToDoList.get(position);
        holder.todo_list_task.setText(item.getTask());
        holder.todo_list_task.setChecked(toBoolean(item.getStatus()));
        holder.todo_list_task_description.setText(item.getDiscription());


    }

    @Override
    public int getItemCount() {
        return ToDoList.size();
    }

    private  Boolean toBoolean(int m){

        return m!=0;
    }

    public void setToDoList(List<ToDoModel> toDoList){
        this.ToDoList=toDoList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox todo_list_task;
        TextView todo_list_task_description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            todo_list_task=itemView.findViewById(R.id.todo_list_task);
            todo_list_task_description=itemView.findViewById(R.id.todo_list_task_description);

        }
    }
}
