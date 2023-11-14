package GoldmanSachs;

import java.util.HashSet;

public class CheckIfPanagram {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        for(char i: sentence.toCharArray()) {
            if(!set.contains(i)) {
                set.add(i);
            }
        }
        if(set.size() == 26) return true;

        return false;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        CheckIfPanagram obj = new CheckIfPanagram();
        System.out.println(obj.checkIfPangram(sentence));
    }
}
