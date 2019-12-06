**
 * Creates a data node to use in the linked list (playlist)
 */
package edu.cgcc.cs260;

public class Song{
    //Members
    //Name of song
    private String name;
    //Duration of song
    private int duration;

    /**
     * Constructs a data node containing the name
     * and duration of a song.
     * @param name
     * @param duration
     */
    public Song(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    /**
     *
     * @return name of song
     */
    public String getName(){
        return name;
    }

    /**
     * Sets name of song
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return duration of song
     */
    public int getDuration(){
        return duration;
    }

    /**
     * Sets the duration of a song to 0
     * Stopping the song
     */
    public void stopSong(){
        this.duration = 0;
    }

    /**
     * @return the name and duration of the song
     * concatenated into a string.
     */
    public String infoString(){
        return this.name + ": " + this.duration;
    }


