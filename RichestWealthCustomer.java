//leetcode 1672

public class RichestWealthCustomer {
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;

        for(int i =0; i < accounts.length; i++) {
            int total = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }

            // if ( total > wealth) {
            //     wealth = total;
            // }

            wealth = Math.max(wealth, total);
        }
        return wealth;
    }

    public static void main(String[] args) {
        int[][] arr = { {1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
}
