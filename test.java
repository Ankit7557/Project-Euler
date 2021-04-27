import java.util.Scanner;
import java.util.ArrayList;
public class test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <String> num=new ArrayList<String>();
        int n=sc.nextInt();  
        sc.nextLine();
        String[] in=new String[n];
        for(int i=0;i<n;i++){
            in[i]=sc.nextLine();
        }
        char[] vow={'a','e','i','o','u'};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(in[i].charAt(0)==vow[j]&&in[i].charAt(in[i].length()-1)==vow[j]){
                    num.set(i,in[i]);
                }
            }
        }
        String r=" ";
        for(int i=0;i<num.size();i++){
           r=r+num.get(i);
        }
        System.out.println(r);
    }
}