import java.util.*;

public class shuffleArray
{

  public static void main (String args[])
  {
    
    int originalArray[] = { 1, 2, 3, 4, 5, 6, 7 };

    System.out.println ("array before shuffling...");

  
  for (int value:originalArray)
      {
	System.out.print (value + " ");
      }

    System.out.println ("\n");

  
    customShuffle (originalArray);



    System.out.println ("array after shuffling...");

   
  for (int value:originalArray)
      {
	System.out.print (value + " ");
      }

  }

  public static void customShuffle (int[]array)
  {
    Random random = new Random ();
    int n = array.length;

    for (int i = n - 1; i > 0; i--)
      {

	int j = random.nextInt (i);


	array[i] = array[i] + array[j];
	array[j] = array[i] - array[j];
	array[i] = array[i] - array[j];
      }

  }
}
