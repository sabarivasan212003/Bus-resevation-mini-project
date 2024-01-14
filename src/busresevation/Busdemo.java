package busresevation;
import java.util.*;
public class Busdemo {
       
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,58));
		buses.add(new Bus(3,true,48));
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		int userOpt=1;
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 1 to exit");
			userOpt=sc.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("Sorry. Bus is full. Try another bus or date.");
				}
			}
		}
	}
}
