package string;

public class Hello {
    public static void main(String[] args) {
        String s1 = "name1|name2|name3|name4";
        String s2 = "abcdhello";
        //String s3 = "Hello";
        String s3 = new String("Hello");


        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareTo(s3));
        String s4 = s2.substring(1,5);
        System.out.println(s4);

        String ar[] = s1.split("|");
        for(String a:ar){
            System.out.println(a);
        }

    }
}
