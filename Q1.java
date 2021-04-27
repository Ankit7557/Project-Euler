import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
            int num=sc.nextInt();
            String o="";
            while(num!=0){
                int s=num%2;
                String a=String.valueOf(s);
                 o=a+o;
                num=num/2;
            }
            System.out.println(o);
            System.out.println();
        }
        sc.close();
        
        
        
        
    }

}