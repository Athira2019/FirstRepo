package com.coding;

public class Chocolate {

	public static void main(String[] args) {
		Chocolate chocolate=new Chocolate();
		int ways=chocolate.birthday(new int[]{1, 2, 1, 3, 2}, 3, 2);
		System.out.println(ways);

	}
	 int birthday(int[] s, int d, int m) {
        int ways=0;
        
         
        for(int i=0;i<s.length;i++)
        { 
            if (s[i]==d)
            {
                ways++;
            }
            else if(s[i]!=m)
           {
               if(d==m+s[i])
               ways++;

           }else if(s[i]==m)
           {
               for(int j=0;j<s.length;j++)
               {
                   if((s[i]+s[j])==d)
                      ways++;
               }
           }
          
        }
		return ways;

	}}
