/**
 * The ShowPlaylist class displays the movies from two groups.
 * It then diplays the number of movies containing
 * a given string. It also removes movies with a name that has 
 * a length smaller than that of a given value, and displays
 * the number of movies removed. At the end it displays 
 * the movies that weren't removed.
 * @author Vishesh Prasad 
 * Collaboraters: N/A
 * Teacher Name: Mrs. Ishman
 * Period: 4
 * Due Date: 03-31-2020
 */
 
import java.util.ArrayList;

public class ShowPlaylist
{
  /** list of shows being streamed */
  private ArrayList<String> playlist;
  
  /**
   * The class constructor, instantiating the 
   * instance variable playlist.
   */
  public ShowPlaylist()
  {
    playlist = new ArrayList<String>();
  }
  
  /**
   * Adds a show to the end of the instance
   * variable playlist.
   * @param newShow name of the show being added
   */
  public void addShow(String newShow)
  {
    playlist.add(newShow);
  }
  
  /**
   * Gets the number of shows currently in
   * the playlist variable.
   * @return the number of shows currently in the
   * playlist variable
   */
  public int getNumShows()
  {
    return playlist.size();
  }
  
  /**
   * Gets the number of show titles that contain
   * the given string
   * @param checkShow is the string that is being checked
   * against the show title
   * @return the number of show titles containing
   * the given string
   */
  public int getNumContains(String checkShow)
  {
    int numContains = 0;
    for (String check : playlist)
    {
      if(check.contains(checkShow))
      {
        numContains++;
      }
    }
    return numContains;
  }
  
  /**
   * Removes shows with a title length less than 
   * a given value
   * @param minLength the minimum title length
   * @return the number of shows removed
   */
  public int removeSmaller(int minLength)
  {
    int numRemoved = 0;
    for (int index = 0; index < playlist.size(); index++)
    {
      String title = playlist.get(index);
      int length = title.length();
      if (length < minLength)
      {
        playlist.remove(index);
        index--;
        numRemoved++;
      }
    }
    return numRemoved;
  }
  
  /**
   * Converts the show object in the playlist
   * arrayList into a string to be displayed
   * @return the string holding the name of the show
   */
  @Override
  public String toString()
  {
    return playlist.toString();
  }
}