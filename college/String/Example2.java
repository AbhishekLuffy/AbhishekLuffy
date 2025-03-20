package String;

public class Example2 {
    public static void main(String[] args) {
        String name = "luffy";
        String r = "";

        for(int i = name.length()-1 ; i >= 0 ; i--){
            char ch = name.charAt(i);

            r = r + ch;
        }
        System.out.println(r);
    }
}
