package com.example.finalapp.datas;

public class News {
    private int id;
    private String title;
    private String text;
    private String pic;
    private String date;
    private String time;

    public News(int id, String title, String text, String pic, String date, String time) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.pic = pic;
        this.date = date;
        this.time = time;
    }

    //getters
    public int getId() {return id;}
    public String getTitle() {return title;}
    public String getText() {return text;}
    public String getPicture() {return pic;}
    public String getDate() {return date;}
    public String getTime() {return time;}

    //setters
    public void setId(int id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}
    public void setText(String text) {this.text = text;}
    public void setPicture(String picture) {this.pic = picture;}
    public void setDate(String date) {this.date = date;}
    public void setTime(String time) {this.time = time;}
}
