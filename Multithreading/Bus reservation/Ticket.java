package BusReservation;
public class Ticket
{
 int availableseats=3;
public synchronized void bookticket(String name,int noofseats)
{
	if((availableseats>=noofseats)&&(noofseats>0))
	{
		System.out.println("hi"+name+""+noofseats+"booked successfully");
		availableseats=availableseats-noofseats;
	}
else 
	{
	System.out.println("sorry ! seats are not elseavailable"); 
	}
}
}