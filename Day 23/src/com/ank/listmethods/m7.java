package com.ank.listmethods;
import java.util.ArrayList;  
import java.util.Arrays;  
public class m7 
{  
public static void main(String [] args)  
{  
ArrayList<String> firstList= new ArrayList<String>(Arrays.asList("Good", "Morning", "Students")); 
ArrayList<String> secondList= new ArrayList<String>(Arrays.asList("Good", "Night", "frineds"));  
ArrayList<String> thirdList= new ArrayList<String>();
for(String tempList : firstList)    
thirdList.add(secondList.contains(tempList) ? "Yes" : "No");  
System.out.println(thirdList);  
}  
}  