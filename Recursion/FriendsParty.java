public class FriendsParty {
    public static void main(String[] args) {
        int friends = 4;
        int ans = partyInvite(friends);
        System.out.println(ans);
    }
    static int partyInvite(int n){
        if(n <= 1){
            return 1;
        }
        return partyInvite(n-1) + (n-1) * partyInvite(n-2);
    }
}
