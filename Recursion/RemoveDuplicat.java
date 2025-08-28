package Recursion;

public class RemoveDuplicat {
    public static void removeDuplicate (String str , int i , StringBuilder newStr , boolean map[]) {
        if (i== str.length()) {
            System.out.println(newStr);
            return;
        }

        char currCh = str.charAt(i);
        if (map[currCh - 'a'] == true) {
            // duplicate
            removeDuplicate(str, i+1, newStr, map);
        } 
        else {
            map[currCh - 'a'] = true; 
            removeDuplicate(str, i+1, newStr.append(currCh), map);
        }

    }
    public static void main(String[] args) {
        String str = "lokkeeshpattil";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
