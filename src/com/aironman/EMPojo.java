package com.aironman;

public class EMPojo {
	
	private int number;
	private int total;
	private int total_2017;
	private int total_2018;
	
	public EMPojo() {
		
	}

	public EMPojo(int number, int total, int total_2017, int total_2018) {
		super();
		this.number = number;
		this.total = total;
		this.total_2017 = total_2017;
		this.total_2018 = total_2018;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_2017() {
		return total_2017;
	}

	public void setTotal_2017(int total_2017) {
		this.total_2017 = total_2017;
	}

	public int getTotal_2018() {
		return total_2018;
	}

	public void setTotal_2018(int total_2018) {
		this.total_2018 = total_2018;
	}

	@Override
	public String toString() {
		return "EMPojo [number=" + number + ", total=" + total + ", total_2017=" + total_2017 + ", total_2018="
				+ total_2018 + "]";
	}
	
	

}
