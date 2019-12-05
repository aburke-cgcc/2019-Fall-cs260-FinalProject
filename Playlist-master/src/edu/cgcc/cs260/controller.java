
package edu.cgcc.cs260;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;


public class controller {
        //members

        public static void playlistTraversal(LinkedList<Song> playlist) {
            Scanner UI = new Scanner(System.in);
            printOptions menu = new printOptions();
            
            boolean forward = true;
            boolean backward = true;
            boolean isQuit = false;
            ListIterator<Song> listIterator = playlist.listIterator();

            if (playlist.size() == 0) {
                System.out.println("screw off and try again");
                //userAlerts.useralert; IF WE DECIDE TO GO THE ABSTRACT ALERTS ROUTE
                return;
            } else {
                System.out.println("NOW PLAYING" + listIterator.next().toString());
                printOptions.printMenu();
            }
            // while not choosing to quit, we will scan the menu
            // line by line to find the option we want

            while (!isQuit) {
                int choose = UI.nextInt();
                UI.nextLine();


            /*
            1 - Play playlist
            2 - Stop song
            3 - Delete song
            4 - Skip Forward
            5 - Skip Backward
            6 - Quit Playlist
             */
                switch(choose) {
                    case 1:
                    case 2:
                    	
                    	
                    case 3:
                    case 4:
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
                        //if there is a previous song in the playlist, move backward to the previous song
                        if (!backward) {
                            if (listIterator.hasPrevious())
                                listIterator.previous();
                            backward = true;
                        }
                        //if moving backward, print the song name and time
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                        //if playlist is at head, print a message
                        else {
                            System.out.println("You've reached the begining of it all.");
                            backward = false;
                        }
                        break;

                    case 6:
                    	//if quit is selected 
                    	if (isQuit)
                    		System.exit(0);


                }
            }
           
            	
            	
           


            //get user input as in if playPlaylist is selected then do
            //if next node != null point to next node, else alert user something
            //call play() when pointed to next node that isn't null
        }
		
}
