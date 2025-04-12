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
}
