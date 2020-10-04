import java.util.*;
class Saddle_Point
{
void saddle()
{
int rowmin,col,i,j,n,p,sp=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of square matrix");
n=in.nextInt();
int arr[][]=new int[n][n];
p=arr.length;
System.out.println("Enter the matrix elements");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
arr[i][j]=in.nextInt();
System.out.println("The Matrix entered");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(arr[i][j]+" ");
System.out.println();
}
for(i=0;i<p;i++)
{
rowmin=arr[i][0];
col=0;sp=1;
for(j=1;j<arr[i].length;j++)
{
if(arr[i][j]<rowmin)
{
rowmin=arr[i][j];
col=j;
}
}
for(j=0;j<p;j++)
{
if(arr[j][col]>rowmin)
{
sp=0;
break;
}
}
if(sp==1)
System.out.println("The Saddle Point is "+rowmin);
}
if(sp==0)
System.out.println("No saddle point");
}
public static void main(String ars[])
{
Saddle_Point ob=new Saddle_Point();
ob.saddle();
}
}