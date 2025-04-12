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
}
