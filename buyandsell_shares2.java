// write aprogram that computes the maximum profit that can be made byvbuying and sellling a share at most twice.
// The second but must be made on another date after the first sale
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class buyandsell_shares2 {
    public static void main(String[] args) {
        int a[]={12,11,13,9,12,8,14,13,15};
        List<Integer> arr= new ArrayList<Integer> () ;

        for(int i=0;i<a.length;i++){
            Collections.addAll(arr,a[i]);
        }
        ArrayList<Integer> B=new ArrayList<Integer>();
        ArrayList<Integer> C=new ArrayList<Integer>();
        int mp=10,p=0;
        for(int i=0;i<arr.size();i++){
            mp=Math.min(mp,arr.get(i));
            p=Math.max(p,arr.get(i)-mp);
            B.add(p);
            
        }
        int max_p=-1;
        for(int i=arr.size()-1;i>0;i--){
           max_p=Math.max(max_p,arr.get(i));
           p=Math.max(p, max_p-arr.get(i)+B.get(i-1));
           
        }
        C.add(p);
        for(int i=0;i<C.size();i++){
           
            System.out.println("Max Profit"+C.get(i));
        }
    }
}
