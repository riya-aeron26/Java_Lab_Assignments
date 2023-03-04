import java.util.Scanner;

public class distance {
    int arr[]=new int[100];
    Scanner in = new Scanner(System.in);
    public void userinput(int size){
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
    }
    public int indexofminimumdist(int size){
        int min=0;
        for(int i=1;i<size-1;i++){
            if(Math.abs(arr[min]-arr[min+1])>Math.abs(arr[i]-arr[i+1])){
                min =i;
            }
        }
        return min;
    }
    public static void main(String [] args){
        System.out.println("Enter the size of the array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        distance obj = new distance();
        obj.userinput(n);
        int a = obj.indexofminimumdist(n);
        System.out.println("INDEX IS :  "+a);
    }
}
