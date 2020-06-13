import BusReservation.*;
class BookTicket
{
public static void main(String[] args)
{
Ticket t=new Ticket();
TicketThread t1=new TicketThread(t,"jack",2);
TicketThread t2=new TicketThread(t,"john",2);
t1.start();
t2.start();
}
}
