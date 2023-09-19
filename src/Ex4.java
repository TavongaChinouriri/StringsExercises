public class Ex4 {
    //Write a Java program to detect double and triple spaces in a string.
    public static void main(String[] args){
        String myname = " Tav  onga,Chinou   riri";
        //single space in String
        System.out.println(myname.indexOf(" "));
        // double space in String
        System.out.println(myname.indexOf("  "));
        //triple space in String
        System.out.println(myname.indexOf("    "));

    }
}
