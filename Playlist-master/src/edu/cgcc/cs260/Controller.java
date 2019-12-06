/**
 * Controls the traversal of the playlist
 * @author Isaak Henry
 */
package edu.cgcc.cs260;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;


public class Controller {
    /**
     * Control Playlist traversal
     * @param playlist
     */
    public static void play(LinkedList<Song> playlist) {
            Scanner UI = new Scanner(System.in);
            Menu menu = new Menu();
            boolean forward = true;
            boolean traverse = true;
            ListIterator<Song> listIterator = playlist.listIterator();
            Song Song = new Song("Name", 0);

            //Check if the playlist is empty
            if (playlist.size() == 0) {
                System.out.println("No playlist found.");
                return;
            } else {
                //if the playlist is not empty, print the menu
                System.out.println("Choose an option");
                Menu.printMenu();
            }

            // while not choosing to quit, we will scan the menu
            // line by line to find the option we want
            while (traverse) {
                int choose = UI.nextInt();
                UI.nextLine();


            /*
            1 - Play Song
            2 - Stop Song
            3 - Delete song
            4 - Skip Forward
            5 - Skip Backward
            6 - Play Playlist
            7 - Stop Playlist
            8 - Delete Playlist
            9 - Quit Playlist
             */
                switch(choose){
                    case 1:
                        //Play Song
                        if(!forward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            forward = true;
                        }
                        if(listIterator.hasNext()){
                            System.out.println("Playing" + listIterator.next().toString());
                        } else {
                            System.out.println("The playlist is now over");
                            forward = false;
                        }
                        break;
                    case 2:
                        //Stop Song
                        Song.stopSong();

                    case 3:
			//delete current song
                        //Check if playlist has any songs
                        if (playlist.size() > 0) {
			    //if it does, remove the song currently playing
                            listIterator.remove();
		            //play the next song
                            if(listIterator.hasNext()){
                                System.out.println("Playing" + listIterator.next());
                            } else if(listIterator.hasPrevious()){
                                System.out.println("Playing" + listIterator.previous());
                            }
                        }
                    case 4:
                        //Skip Forward
                        //if there is a next song in the playlist, move forward to the next song
                        if (!forward) {
                            if (listIterator.hasNext())
                                listIterator.next();
                            forward = true;
                        }
                        //if moving forward, print the song name and time
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        }
                        //if playlist is over, print a message
                        else {
                            System.out.println("Adios, playlist is over");
                            forward = false;
                        }
                        break;
                    case 5:
			//Previous Song
			//check if there is a previous node
                        if(forward){
                            if (listIterator.hasPrevious()) {
				//goto previous node
                                listIterator.previous();
                            }
                            forward = false;
                        }
			//play previous song
                        if(listIterator.hasPrevious()){
                            System.out.println("Playing" + listIterator.previous().toString());
                        } else {
			    //If at beginning of playlist, alert user
                            System.out.println("At beginning of playlist");
                            forward = true;
                        }
                        break;
                    case 6:
				//play playlist
                    case 7:
				//stop playlist
                    case 8:
				//delete playlist

                        listIterator.remove();
                        break;
                    case 9:
                        System.out.println("Goodbye");
                        traverse = false;
                        System.exit(0);
                }
	    }
        }
}
