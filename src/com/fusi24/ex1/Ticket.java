package com.fusi24.ex1;

public class Ticket {
	private String ticketName;

	public Ticket(String ticketName) {
		super();
		this.ticketName = ticketName;
	}
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean addTicket() {
		return true;
	}
	
	public boolean editTicket() {
		return true;
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	
	public void loadTickets() {
		
	}
	
	public void queryTickets() {
		
	}

}
