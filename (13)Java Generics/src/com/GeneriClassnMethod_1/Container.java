package com.GeneriClassnMethod_1;

public class Container<i1,i2> {
	
	i1 item1;
	i2 item2;
	
	public Container(i1 item1, i2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}

	public void printItem(i1 item1, i2 item2){
		System.out.println(item1);
		System.out.println(item2);
	}
	
	@Override
	public String toString() {
		return "Container [item1=" + item1 + ", item2=" + item2 + "]";
	}

	public i1 getItem1() {
		return item1;
	}

	public void setItem1(i1 item1) {
		this.item1 = item1;
	}

	public i2 getItem2() {
		return item2;
	}

	public void setItem2(i2 item2) {
		this.item2 = item2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item1 == null) ? 0 : item1.hashCode());
		result = prime * result + ((item2 == null) ? 0 : item2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		if (item1 == null) {
			if (other.item1 != null)
				return false;
		} else if (!item1.equals(other.item1))
			return false;
		if (item2 == null) {
			if (other.item2 != null)
				return false;
		} else if (!item2.equals(other.item2))
			return false;
		return true;
	}

	
	
	
	
}
