package introduction;

import java.util.ArrayList;

public class JavaBasics {
	
	public static void main(String[] args) {
		
	int m=7;
	int j=8;
	int k=9;
    String name ="Rahul";
    float f=2.65f;
    double d=5.00000394848d;
    char c='r';
   
    //first way to write array
    
  //String[] arr=new String[3];
  /*
    int[] arr2 = new int[5];
  
  arr2[0]=1;
  arr2[1]=2;
  arr2[2]=3;
  arr2[3]=4;
  arr2[4]=5;
  
  
  for (int i=0;i<arr2.length;i++) {
	  System.out.println(arr2[i]);
	 
  }
  for (int i:arr2) {
	  System.out.println(i);
	  }
    //second way to write array
  */
     int[] arr3= {1,2,3,4,5};
     
     for (int i : arr3) {
    	 if (i%2 ==0) {
    		 System.out.println(i +" divisible by 2");
    		 break;		 
    	 }
    	 else {
    		 System.out.println(i+" is not divisible by 2");
    	 }		 
     }
      ArrayList ar=new ArrayList();
     ar.add("rahul");
     ar.add("shetty");
     ar.add("academy");
     System.out.println(ar.get(1));
     for (Object s:ar) {
    	 System.out.println(s);
     }
    // String s="welcome";
    // String s1="welcome";
     String s2=new String("welcome to india");
   //  String [] s3=s2.split(" ");
    // System.out.println(s3[1].trim());
     
     for (int p=s2.length()-1;p>=0;p--) {
    	 
    	System.out.println(s2.charAt(p));
    	 
    	 
     }
     
     
 
     
     
     

	}
}

