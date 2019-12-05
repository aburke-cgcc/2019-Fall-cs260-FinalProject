package edu.cgcc.cs260;

public class Song{
    //Members
    private String name;
    private int duration;

    //Member functions
    //construct a song
    public Song(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    //Name Getter
    public String getName(){
        return name;
    }

    //set name
    public void setName(String name){
        this.name = name;
    }
    //Duration getter
    public int getDuration(){
        return duration;
    }


    //song name + duration
    public String toString(){
        return this.name + ": " + this.duration;
    }




}



