import java.util.*;
class os
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n,total=0,pos,temp;
long avg_wt=0,avg_tat=0;
int min,count=0,time,end;
int[] bt=new int[10];
int[] at=new int[10];
int[] p=new int[10];
int[] wt=new int[10];
int[] tat=new int[10];
int[] waiting=new int[10];
int[] turnaround=new int[10];
int[] completion=new int[10];
int[] x=new int[10];

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
x[i]=bt[i];

bt[9]=90;

for(int tm=0;tm<n;tm++)
{
if(x[tm]<=10)
{

for(time=0;count!=n;time++)
{
min=9;
for(i=0;i<n;i++)
{
if(at[i]<=time && bt[i]<bt[min] && bt[i]>0 )
min=i;
}
bt[min]--;
if(bt[min]==0)
{
count++;
end=time+1+3;
completion[min] = end;
waiting[min] = end - at[min] - x[min];
turnaround[min] = end - at[min];
}
}

System.out.println("Process\t    Arrival time    \tBurst time\t    Completion    \tTurnAround time    \tWaiting time");
for(i=0;i<n;i++)
{
System.out.println(p[i]+"\t\t"+at[i]+"\t\t    "+x[i]+"\t\t\t"+completion[i]+"\t\t     "+turnaround[i]+"\t\t\t     "+waiting[i]);
avg_wt =avg_wt + waiting[i];
avg_tat =avg_tat + turnaround[i];
}
System.out.println();
System.out.println("Average waiting time : "+avg_wt/n);
System.out.println("Average turnaround time : "+avg_tat/n);

}

else
{
System.out.println("CPU can't be alloted more than 10 times...");
}}
}}
