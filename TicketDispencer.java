package oopsprograms;

class BookingCounter extends Thread {
	private int maxseats = 100;
	private int seatNum = 0;

	public synchronized void bookTickets(int noOfSeats) {
		if ((maxseats >= noOfSeats) && noOfSeats > 0) {
			System.out.println(noOfSeats + "Booked Successfully");
			maxseats = maxseats - noOfSeats;
			for (int sets = 1; sets <= noOfSeats; sets++) {
				seatNum++;
				System.out.println("seat Number " + seatNum);
			}
		}else {
			System.out.println("tickets are sold no tickets are available");
		}

	}
}

class TicketBookingThread extends Thread {
	private BookingCounter counter;
	private int seats;

	public TicketBookingThread(BookingCounter counter, int seats) {
		this.counter = counter;
		this.seats = seats;

	}

	@Override
	public void run() {
		counter.bookTickets(seats);
	}
}

public class TicketDispencer {

	public static void main(String[] args) {
		BookingCounter cout = new BookingCounter();
		TicketBookingThread t1 = new TicketBookingThread(cout, 3);
		TicketBookingThread t2 = new TicketBookingThread(cout, 3);
		TicketBookingThread t3 = new TicketBookingThread(cout,99);
		t1.start();
		t2.start();
		t3.start();

	}
}