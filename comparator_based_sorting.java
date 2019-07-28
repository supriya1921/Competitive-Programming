/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		// your code goes here
	        int n=sc.nextInt();
		   ArrayList<Pair> a=new ArrayList<>();
		   for( int i=0;i<n;i++)
		   a.add(new Pair(0,0));
		    for( int i=0;i<n;i++)
		    {
		        Pair x=a.get(i);
		        x.first=sc.nextInt();
		    }
		    for( int i=0;i<n;i++)
		    {
		        Pair x=a.get(i);
		        x.sec=sc.nextInt();
		    }
		    Collections.sort(a, new myComparator());
		   
		   int flag1=0,
		    flag2=0,
		    flag3=0,
		    min1=0,
		    min2=0,
		    min3=0,
		    ans1=1000000,ans2=1000000;
		for( int i=0;i<n;i++)
		{
		    if(a.get(i).sec==1&&flag1==0)
		    {
		        flag1=1;
		        min1=a.get(i).first;
		    }
		    if(a.get(i).sec==2&&flag2==0)
		    {
		        flag2=1;
		        min2=a.get(i).first;
		    }
		    if(a.get(i).sec==3&&flag3==0)
		    {
		        flag3=1;
		        min3=a.get(i).first;
		    }
		}
		if(flag1==1&&flag2==1)
		{
		    ans1=min1+min2;
		}
		if(flag3==1)
		ans2=min3;
		System.out.println(Math.min(ans1,ans2));
	}
}
class Pair{
    int first;
    int sec;
    Pair( int first,int sec)
    {
        this.first=first;
        this.sec=sec;
    }
}
class myComparator implements Comparator<Pair>
{
    public int compare( Pair a, Pair b)
    {
        if(a.sec==b.sec)
        {
            if(a.first>b.first)
            return 1;
            else if( a.first<b.first)
            return -1;
            else
            return 0;
        }    
        else if(a.sec>b.sec)
        return 1;
        else 
        return -1;
    
    }
}
