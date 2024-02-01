public class SBnumRev {
    public static void main(String[] args) {
        int OGnum = 12345;

        String originalString = Integer.toString(OGnum);

        StringBuilder rev = new StringBuilder(originalString).reverse();
        int revNum = Integer.parseInt(rev.toString());

        System.out.println(revNum);
    }
}