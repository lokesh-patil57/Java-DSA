
public class  SubString {
    public static String subString(String str , int si , int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    } 
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(0,5));
        System.out.println(subString(str, 0, 5));
    }
}
