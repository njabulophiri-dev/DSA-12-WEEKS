package Strings.Beginner;

public class Exercise2 {
    public static void main(String[] args) {
        String txt1 = " Hello WORLD ";
        String txt2 = txt1.trim();              //remove whitespace

        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());
        String formatted = txt2.substring(0,1).toUpperCase() + txt2.substring(1).toLowerCase();
        System.out.println(formatted);
        System.out.println(txt2.substring(0));
    }
    
}

