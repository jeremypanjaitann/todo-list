module TodoListApp {
    requires java.sql;
    requires spring.context;
    requires spring.beans;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
    opens todoapp.config;
}