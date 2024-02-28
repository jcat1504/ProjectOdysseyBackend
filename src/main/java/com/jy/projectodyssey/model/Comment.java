package com.jy.projectodyssey.model;
import jakarta.persistence.*;

@Entity
@Table(name ="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Column(nullable = false)
    private String text;
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    // Corrected setter
    public void setTask(Task task) {
        this.task = task;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


