package homeworks.additionalHomeWorks.morse;

import java.io.IOException;

public class MorseDemo {
    public static void main(String[] args) throws IOException {
        DecodeMorse decode = new DecodeMorse();
        Encode encode = new Encode();

        FileUtils file = new FileUtils();
        String wap = file.readTextFileToString("src/main/resources/file.txt");



        String encoding = "Привіт, як справи?";
        String decoding = ".−−. .−. −.−− .−− .. − --..--    .−.− −.−    ... .−−. .−. .− .−− −.−− ..--..";

        System.out.println("Decoded text");
        decode.decodingMorse(decoding);
        System.out.println("encoded text");
        long startTime = System.currentTimeMillis();
//        System.out.println(encode.encode(wap));
        System.out.println("time wap = " + (System.currentTimeMillis()-startTime));

    }
}
