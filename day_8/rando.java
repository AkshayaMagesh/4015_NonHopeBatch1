public class rando {
    public static void main(String[] args) {
        String input = "a1b2c3";
        String result = "";
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(Character.isLetter(ch)) {
                result += ch;;
            }
        }
        System.out.println(result);
    }
}