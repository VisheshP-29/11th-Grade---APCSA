public class Main 
{
  /** arrays of shows to add to the play list */
  public static final String[] SHOW_GROUP_1 =  {"The Mandalorian", "The Office", "IT", 
    "Stranger Things", "Riverdale", "American Vandal", "Big Hero 6", "The Princess Bride", 
    "The Breakfast Club", "The Fast and the Furious", "The Hunger Games", "Pitch Perfect", 
    "Gossip Girl", "Switched at Birth", "Teen Titans", "Attack on Titan", "Spirited Away", 
    "Howl's Moving Castle", "Walking Dead"};
  public static final String[] SHOW_GROUP_2 =  {"Frozen 2", "The Lion King", "WALL-E", 
    "Aladdin", "Mulan", "Brave", "Maleficent", "The Brave Little Toaster"};
    
  /** arrays for testing methods */
  public static final String[] TEST_CONTAINS = {"The", "Titan", "Brave"};
  public static final int[] TEST_REMOVE = {4, 6, 15};

  public static void main(String[] args) 
  {
    // Setup ShowPlaylist object #1, testing addShow and numShows methods
    ShowPlaylist group1 = new ShowPlaylist();
    System.out.println("Group #1 before adding: " + group1.toString());
    for (String title : SHOW_GROUP_1)
    {
      group1.addShow(title);
    }
    System.out.println("Group #1 number of shows: " + group1.getNumShows());
    System.out.println("Group #1 play list: " + group1.toString());
    System.out.println();

    // Setup ShowPlaylist object #2, testing addShow and numShows methods
    ShowPlaylist group2 = new ShowPlaylist();
    System.out.println("Group #2 before adding: " + group2.toString());
    for (String title : SHOW_GROUP_2)
    {
      group2.addShow(title);
    }
    System.out.println("Group #2 number of shows: " + group2.getNumShows());
    System.out.println("Group #2 play list: " + group2.toString());
    System.out.println();

    // Test getNumContains method
    System.out.println("Testing getNumContains method");
    for (String check : TEST_CONTAINS)
    {
      System.out.println("Number of shows containing \"" + check + "\":");
      System.out.println("Group #1 contains:"  + group1.getNumContains(check));
      System.out.println("Group #2 contains: " + group2.getNumContains(check));
    }
    System.out.println();

    // Test removeSmaller method
    System.out.println("Testing removeSmaller method");
    for (int minLen : TEST_REMOVE)
    {
      System.out.println("Removing shows with length smaller than " + minLen + ":");
      System.out.println("Group #1 removed: " + group1.removeSmaller(minLen));
      System.out.println("Group #2 removed: " + group2.removeSmaller(minLen));
    }
    System.out.println("After removeSmaller calls:");
    System.out.println("Group #1 number of shows: " + group1.getNumShows());
    System.out.println("Group #1 play list: " + group1.toString());
    System.out.println("Group #2 number of shows: " + group2.getNumShows());
    System.out.println("Group #2 play list: " + group2.toString());
    System.out.println();
  }
}