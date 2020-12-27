package com.revature.eval.java.collections;

public class CountInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  CountStatic a = new CountStatic();

		    System.out.println(a.instanceCount);
//		    System.out.println(a.staticCount);  // <== ERROR
		    
		    //access the field from the class as opposed to the instance:
		    System.out.println(CountStatic.staticCount); 
     
 			  CountStatic a2 = new CountStatic();
 
 			    System.out.println(a2.instanceCount);
// 			    System.out.println(a.staticCount);  // <== ERROR
 		    
 			    //access the field from the class as opposed to the instance:
 		    System.out.println(CountStatic.staticCount);  

 		    a.setInstanceCount(15);

 		    System.out.println("object a instanceCount: " + a.instanceCount);
 		    System.out.println("object a2 instanceCount: " + a2.instanceCount);

 		    CountStatic.setStaticCount(2494);

 		    System.out.println("class A staticCount: " + CountStatic.staticCount);
	}

}
