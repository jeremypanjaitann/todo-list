module TodoListApp {
    requires java.sql;
    requires spring.beans;
    requires spring.context;
    requires org.slf4j;
    requires javafx.fxml;
    requires javafx.controls;
    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
    opens todoapp.config;
}