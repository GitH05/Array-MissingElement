// Finding the missing number:
import java.util.Scanner;
public class MissingElement
{
public static void main(String[] args)
{
int i,size,c;
int sum=0;
int n,Mn=0,NSum=0;
System.out.println("Enter the numbers in order:1 2 3 .....n");
Scanner s=new Scanner(System.in);
System.out.println("Ente the size of the Array:");
size=s.nextInt();
int a[]=new int[size + 1];
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<size;i++)
{

System.out.print(a[i]+" ");
}
//System.out.print("\nSum:"+sum);

for(i=0;i<size;i++)
{
sum=sum+a[i];
NSum=size*(size+1)/2;
Mn=NSum-sum;
}
System.out.println("\nSum:"+sum);
System.out.println("\nMissing Number:"+Mn);

}
}