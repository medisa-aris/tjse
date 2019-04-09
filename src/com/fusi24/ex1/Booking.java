package com.fusi24.ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Booking {
	Logger log = LoggerFactory.getLogger(Booking.class);
	
	
	
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
		
		
		log.info("Edit Booking");
		
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
