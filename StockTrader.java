import java.util.*;
public class Stocks
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] prices=new int[n];
        for(int i=0; i<n ; i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(maxProfit(prices));
        sc.close();
    }
    public static int maxProfit(int[] prices){
        if(prices.length==0){
            return 0;
        }
        int minPrice=prices[0];
        int maxProfit=0;
        for(int p:prices){
            if(p<minPrice){
                minPrice=p;
            }else{
                int q=p-minPrice;
                maxProfit=maxProfit>q?(maxProfit:q);
            }
        }
        return maxProfit;
    }
}
