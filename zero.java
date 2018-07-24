import java.util.Arrays;
import java.util.Scanner;
public class zero {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,j,a=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
		      arr[i]=sc.nextInt();
		}
			Arrays.sort(arr);
			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
				a=arr[i]+arr[j];
				
				if(a==0){
					System.out.println(arr[i]+" "+arr[j]);
					break;
			}
			}
			}

}
}