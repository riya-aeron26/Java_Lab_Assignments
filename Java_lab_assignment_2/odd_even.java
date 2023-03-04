import javax.swing.*;
import java.util.Scanner;

public class odd_even {
    int arr[]=new int[100];
    Scanner in = new Scanner(System.in);
    public void userinput(int size){
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
    }
    public void oddeven(int size){
        int o =0,e=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                e++;
            }
            else {
                o++;
            }
        }
        int even[]=new int[e];
        int odd[]=new int[o];
        int eve =0, od=0;
        for(int j=0;j<size;j++){
           if(arr[j]%2==0){
               even[eve]=arr[j];
               eve++;
           }
           else{
               odd[od]=arr[j];
               od++;
           }
        }
        System.out.println("The even elements array are: ");
        for(int i=0;i<eve;i++){
            System.out.print(even[i] +" ");
        }
        System.out.println("");
        System.out.println("The odd elements array are: ");
        for(int i=0;i<od;i++){
            System.out.print(odd[i]+" ");
        }

    }
    public static void main(String [] args){
        System.out.println("Enter the size of the array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        odd_even obj = new odd_even();
        obj.userinput(n);
        obj.oddeven(n);

    }

}
