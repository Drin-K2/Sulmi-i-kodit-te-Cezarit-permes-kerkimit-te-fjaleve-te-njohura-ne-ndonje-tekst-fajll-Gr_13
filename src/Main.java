import java.util.*;
import java.io.*;

class CaesarCipherAttack {
  private static final int ALPHABET_SIZE = 26;
    
  public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
       for (char ch : text.toCharArray()) {
           if (Character.isLetter(ch)) {
                char base;
                if (Character.isUpperCase(ch)) {
                    base = 'A';
                } else {
                    base = 'a';
                }
                result.append((char) ((ch - base - shift + ALPHABET_SIZE) % ALPHABET_SIZE + base));
            }  else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static List<String> loadDictionary(String filePath) {
        List<String> words = new ArrayList<>();
        Scanner scanner = null;
        try {
            File file=new File(filePath);
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Gabim në leximin e skedarit: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return words;
    }

  public static boolean containsKnownWords(String text, List<String>dictionary) {
    for (String word : text.toLowerCase().split("[^a-zA-Z0-9']+"))
      {
        if(dictionary.contains(word)) return true;
      }
    return false;
  }
  
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String encryptedText = "";
  
        System.out.println("Zgjedh një opsion:");
        System.out.println("1. Shkruaj tekstin e enkriptuar");
        System.out.println("2. Importo tekstin nga një skedar");
        System.out.print("Opsioni: ");
        int choice = inputScanner.nextInt();
        inputScanner.nextLine(); // konsumon newline që mbetet
      
        if (choice == 1) {
                System.out.print("Jep tekstin e enkriptuar: ");
                encryptedText = inputScanner.nextLine();
          } else if (choice == 2) {
                System.out.print("Jep rrugën e skedarit të tekstit të enkriptuar (shembull: encrypted.txt): ");
                String filePath = inputScanner.nextLine();
                try {
                    encryptedText = new String(Files.readAllBytes(new File(filePath).toPath()));
                } catch (IOException e) {
                    System.out.println("Gabim gjatë leximit të skedarit: " + e.getMessage());
                    inputScanner.close();
                    return;
                }
          } else {
                System.out.println("Opsion i pavlefshëm!");
                inputScanner.close();
                return;
        }
        
        String dictionaryFile = "src/TextFile.txt";
        List<String> dictionary = loadDictionary(dictionaryFile);

        for (int shift = 1; shift < ALPHABET_SIZE; shift++) {
            String decryptedText = decrypt(encryptedText, shift);
            if (containsKnownWords(decryptedText, dictionary)) {
                System.out.println("Mundësi për kyçin: " + shift);
                System.out.println("Teksti i dekriptuar: " + decryptedText);
                break;
            }
        }

        inputScanner.close();//mbyllim scanerin
    }
}
