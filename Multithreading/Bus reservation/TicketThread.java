package BusReservation;
public class TicketThread extends Thread
{
private Ticket t;
private String  name;
private int noofseats;
public TicketThread(Ticket t,String name,int noofseats)
{
	this.t=t;
	this.name=name;
	this.noofseats=noofseats;
}
public void run()
{
	t.bookticket(name,noofseats);
}
}