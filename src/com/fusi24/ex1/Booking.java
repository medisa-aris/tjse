package com.fusi24;

public class Booking {
	private String bookingReference;
	private boolean edit;
	public boolean addBooking() {
		return true;
	}

	public boolean editBooking(boolean edit) {
		this.edit = edit;
		if(edit == true) {
			return false;
		}
		return edit;
	}
	
	public boolean removeBooking() {
		return true;
	}
	
	public void loadBooking () {
		 System.out.println(true);
	}
	
	public void queryBooking() {
		System.out.println(true);
	}
//	public String findBooking(boolean edit) {
//		this.edit = edit;
//		return edit;
//	}
//	public String getReference(String edit) {
//		this.edit = edit;
//		return System.out.print("succes");
//	}
	
	
}
