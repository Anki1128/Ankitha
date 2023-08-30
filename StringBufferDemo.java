package string;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Study");
        System.out.println(sb);

        sb.append ("world");
        System.out.println(sb);

        String s1 = "Hello";
        String s3 = s1.concat ("world");
        System.out.println(s3);

    }


}
