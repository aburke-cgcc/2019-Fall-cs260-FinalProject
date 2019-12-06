/**
 * Creates a Linked list to be used as a playlist
 */
package edu.cgcc.cs260;

import java.util.LinkedList;

public class MakePlayist {
    LinkedList<Song> playList = new LinkedList<>();
    private String name;

    /**
     * Creates a linked list
     * @param name
     */
    public MakePlaylist(String name){
        this.name = name;
        System.out.println("New playlist created");
    }

    /**
     * 
     * @return playlist name
     */
    public String getPlaylistName(){
        return name;
    }

    /**
     * Rename the playlist
     */
    public void renamePlaylist(String name){
        this.name = name;
    }

    /**
     * Add a song to playlist that contains:
     * @param name
     * @param duration
     */
    public void addSong(String name, int duration){
        playList.add(new Song(name, duration));
        System.out.println("new song " + name + ": " + duration + "s" + "added to playlist" + this.name);
    }


}
