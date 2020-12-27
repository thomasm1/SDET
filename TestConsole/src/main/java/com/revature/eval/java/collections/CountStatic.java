package com.revature.eval.java.collections;

public class CountStatic {


	  //static member
	  public static int staticCount = 0;

	  //instance member
	  public int instanceCount = 0;


	  public CountStatic() {
	    staticCount++;
	    this.instanceCount++;
	  }

	  public static int getStaticCount() {
	    return CountStatic.staticCount;
	  }

	  public static void setStaticCount(int staticCount) {
	    CountStatic.staticCount = staticCount;
	  }

	  public int getInstanceCount() {
	    return this.instanceCount;
	  }

	  public void setInstanceCount(int instanceCount) {
	    this.instanceCount = instanceCount;
	  }
}
