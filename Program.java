import java.util.*;
class os
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//int bt[10],p[10],wt[10],tat[10],pr[10],at[10];
int i,j,n,total=0,pos,temp,avg_wt,avg_tat;
int[] bt=new int[10];
int[] at=new int[10];
int[] p=new int[10];
int[] wt=new int[10];
int[] tat=new int[10];

//int[] intArray = new int[20];

System.out.println("Enter total number of process");
n=sc.nextInt();
System.out.println();
System.out.println("Enter arrival time and burst time");
System.out.println();
for(i=0;i<n;i++)
{
System.out.println("P[" + i + "]");
System.out.println("Arrival time:");
at[i]=sc.nextInt();
System.out.println("Burst time:");
bt[i]=sc.nextInt();
System.out.println();
p[i]=i+1;
}

for(i=0;i<n;i++)
{
pos=i;
for(j=i+1;j<n;j++)
{
if(at[j]<at[pos])
pos=j;
}
temp=at[i];
at[i]=at[pos];
at[pos]=temp;

int temp1=bt[i];
bt[i]=bt[pos];
bt[pos]=temp1;

int temp2=p[i];
p[i]=p[pos];
p[pos]=temp2;
}

System.out.println("Process\t    Arrival time    \tBurst time    \tWaiting time");
for(i=0;i<n;i++)
{
System.out.println(p[i]+"\t\t"+at[i]+"\t\t    "+bt[i]);
}




}}
