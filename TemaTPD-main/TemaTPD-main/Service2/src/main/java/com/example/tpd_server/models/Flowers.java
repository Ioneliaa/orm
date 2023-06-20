package com.example.tpd_server.models;

import com.example.tpd_server.interfaces.FlowersInterface;

import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class Flowers implements FlowersInterface, Serializable {
    private int id;
    private String name;
    private String color;

    public Flowers(){

    }
    public Flowers(int id, String title, String author) {
        this.id = id;
        this.name = title;
        this.color = author;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
