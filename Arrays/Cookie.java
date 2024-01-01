import java.util.Arrays;

public class Cookie {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;

        for (int greed : g)
            if (contentChildren < s.length && s[contentChildren++] >= greed) continue;
            else break;

        return contentChildren;
    }
}
