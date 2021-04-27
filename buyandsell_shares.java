public class buyandsell_shares{
    public static void main(String[] args) {
        
        int []arr={310,315,275,295,260,270,290,230,255,250};
        int buy=0;
        int sell=0,min=0,profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
            else if(arr[i]-arr[min]>profit){
                buy=arr[min];
                sell=arr[i];
                profit=arr[i]-arr[min];
            }
        }
        System.out.println("Shares bought at"+buy+" Shares sold at "+sell+" Profit:"+profit);


    }
}