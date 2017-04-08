package abs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The customer class extends abstractUser.
 *
 * @see AbstractUser
 * @see User
 */
public class Customer extends AbstractUser {

	/** The customers address. */
	private String address;

	/** The customers contact number. */
	private String phone;

	/** The customers bookings. */
	private List<Booking> bookings = new ArrayList<Booking>();

	/**
	 * Instantiates a new customer.
	 *
	 * @param name
	 *            the name
	 * @param email
	 *            the email
	 * @param address
	 *            the address
	 * @param phone
	 *            the phone
	 * @param password
	 *            the password
	 */

	public Customer(String name, String email, String address, String phone, String password) {
		super(name, email, password);
		this.address = address;
		this.phone = phone;
	}

	// public Customer(String name, String email, String address, String phone,
	// String password, List<Booking> bookings) {
	// super(name, email, password, bookings);
	// this.address = address;
	// this.phone = phone;
	// }

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see abs.model.AbstractUser#toString()
	 */
	@Override
	public String toString() {

		return super.toString() + "Customer [address=" + address + ", phone=" + phone + "]";
	}

	/**
	 * Gets the bookings.
	 *
	 * @return the bookings
	 */
	public List<Booking> getBookings() {
		return bookings;
	}

	/**
	 * Sets the bookings.
	 *
	 * @param bookings
	 *            the new bookings
	 */
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	/**
	 * Adds a new booking.
	 *
	 * @param booking
	 *            the booking
	 * @return true, if successful
	 */
	public boolean addBooking(Booking booking) {

		// check to see if the list is empty
		if (this.bookings == null) {
			this.bookings.add(booking);
		}

		// loop over the list
		for (int i = 0; i < this.bookings.size(); i++) {
			// compare the booking with the already booked bookings
			// if the output is == to 0 then it is the same date
			if (booking.getSlot().getDate().compareTo(this.bookings.get(i).getSlot().getDate()) == 0) {
				// compare the time
				if (booking.getSlot().getTime().compareTo(this.bookings.get(i).getSlot().getTime()) == 0) {
					// double booked the time, return false
					System.out.println("You already have an appointment booked at this time");
					return false;

				} else if (booking.getSlot().getTime().compareTo(this.bookings.get(i).getSlot().getTime()) > 0) {
					// the booking is after the current booking, so put here
					this.bookings.add(i + 1, booking);
				}
			} else if (booking.getSlot().getDate().compareTo(this.bookings.get(i).getSlot().getDate()) > 0) {
				// then the booking is the first to be made for this day, just
				// insert at that position
				this.bookings.add(i, booking);

			} else if (i == this.bookings.size()) {
				// if you get to this statement that means you cna just append
				// to the list since it got to the end
				this.bookings.add(booking);
			}
		}

		return true;
	}

	/**
	 * Cancel booking.
	 *
	 * @param booking
	 *            the booking
	 * @return true, if successful
	 */
	public boolean cancelBooking(Booking booking) {

		for (int i = 0; i < this.bookings.size(); i++) {
			if (booking.getSlot().getDate().compareTo(this.bookings.get(i).getSlot().getDate()) == 0) {
				// compare the time
				if (booking.getSlot().getTime().compareTo(this.bookings.get(i).getSlot().getTime()) == 0) {
					// remove the booking
					this.bookings.remove(i);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * View bookings prints the customers bookings.
	 */
	public void viewBookings() {
		// loop over the list of bookings stored for this user
		for (int i = 0; i < this.bookings.size(); i++) {
			System.out
					.println(this.bookings.get(i).getSlot().getTime() + " " + this.bookings.get(i).getSlot().getDate());
		}
		// print them out nicely

	}

}
