package edu.cgcc.cs260;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class createLinkedList {
    LinkedList<Song> playList = new LinkedList<>();
    private String name;

    //playlist constructor
    public createLinkedList(String name){
        this.name = name;
        System.out.println("New playlist created");
    }

    //get playlist name
    public String getPlaylistName(){
        return name;
    }

    //rename
    public void renamePlaylist(String name){
        this.name = name;
    }
    //add song to playlist
    public void addSong(String name, int duration){
        playList.add(new Song(name, duration));
        System.out.println("new song " + name + ": " + duration + "s" + "added to playlist" + this.name);
    }

    //delete playlist
    private void deletePlaylist(){
        this. = null;
    }



}
