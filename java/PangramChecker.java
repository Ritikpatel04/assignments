import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase(); 
        scanner.close();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String sentence) {
    
        boolean[] isPresent = new boolean[26];

      
        for (char c : sentence.toCharArray()) {
           
            if (c >= 'a' && c <= 'z') {
               
                isPresent[c - 'a'] = true;
            }
        }

        
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true; 
    }
}

