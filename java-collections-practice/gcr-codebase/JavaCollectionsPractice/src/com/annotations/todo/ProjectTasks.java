
package com.annotations.todo;

public class ProjectTasks {

    @Todo(task = "Implement login feature", assignedTo = "Mohit", priority = "HIGH")
    public void login() {
    }

    @Todo(task = "Add payment gateway", assignedTo = "Rahul")
    public void payment() {
    }
}
