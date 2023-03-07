package homeworks.additionalHomeWorks.morse;

public class MorseDemo {
    public static void main(String[] args) {
        DecodeMorse decoding = new DecodeMorse();
        Encode encode = new Encode();

        String encoded = "Привіт, як справи?";
        String codded1 = ".−−. .−. −.−− .−− .. − --..--    −... .−.. .. −.    .−.− −.−    ... .−−. .−. .− .−− −.−− ..--..";

        System.out.println("Decoded text");
        decoding.decodingMorse(codded1);
        System.out.println("encoded text");
        System.out.println(encode.encode(encoded));

    }
}
