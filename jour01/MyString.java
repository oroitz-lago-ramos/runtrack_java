package jour01;

public class MyString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello World");
        String s3 = s1;
        String s4 = "This is a string".substring(0, 4);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);       
    } 
}
