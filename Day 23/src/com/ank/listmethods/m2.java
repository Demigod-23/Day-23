package com.ank.listmethods;
import java.util.*;  
public class m2{  
public static void main(String args[]){  
String[] array={"A","B","D","C"};  
System.out.println("Printing Array: "+Arrays.toString(array));
List<String> list=new ArrayList<String>();  
for(String lang:array){  
list.add(lang);  
}  
System.out.println("Printing List: "+list);  
  
}  
}  