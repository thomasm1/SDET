package com.revature.eval.java.comparisons;

public class Apple {
	
	int mass;
	String color;
	boolean sour;
	
	public Apple() {
		color = "";
		sour = false;
		mass = 0;
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		
		result += prime * result + mass;
		result += prime * result + (sour ? 1231 : 1237);
		result += prime * result + ((color == null) ? 0 : color.hashCode());
		
		//Other Languages NOT IMPORTANT
		//?? -> is null or not
		//?. -> avoid null pointer exception
		// apple?.equals(apple2) ?? false;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Apple other = (Apple) obj;
		
		if(this.mass != other.mass)
			return false;
		if(this.sour != other.sour)
			return false;
		
		if(color == null) {
			if(other.color != null)
				return false;
		} else if(!color.equals(other.color)) {
			return false;
		}
		
		return true;
	}

}
