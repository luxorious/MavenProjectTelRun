package homeworks.additionalHomeWorks.HWlesson6.set;

public class WordFinderDemo {
    public static void main(String[] args) {
        UniqueWordFinder uf = new UniqueWordFinder();

        String str = "ghbdsn. ghbdsn, zr: ndj] cghfdb&";
        System.out.println(uf.find(str));
    }
}
