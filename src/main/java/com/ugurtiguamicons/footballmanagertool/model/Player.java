package com.ugurtiguamicons.footballmanagertool.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Player implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private Float salary;
    private String position;
    @Column(nullable = false, updatable = false)
    private String playerCode;

    public Player() {}

    public Player(String name, Float salary, String position, String playerCode){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.playerCode = playerCode;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Float getSalary(){
        return salary;
    }

    public void setSalary(Float salary){
        this.salary = salary;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }
}


