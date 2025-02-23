package one123;

import java.util.stream.IntStream;

public class ReverseStringStreams {
    public static void main(String[] args){
        String str = "suegrfer";
        int len = str.length();
        IntStream.range(0, len).mapToObj(i -> str.charAt(len-1-i)).forEach(System.out :: print);
    }
}
