package abs.model;

/**
 * The Booking object.
 * 
 * @since alpha
 * @version 1.1
 */
public class Booking {

        public final int AVAILABE_TIME = 30;
	/** The bookings slot. */
	private Availability slot;

	/** The staff assigned to this booking (String). */
	private Employee staff;

	/** The business. */
	private Business business;

	/** The status (Booked/Available). */
	private String status;
        
        /** The length of time for book appointments */
        private int availableTime; 
        
	/**
	 * Instantiates a new booking.
	 *
	 * @param slot
	 *            the slot an availability
	 * @param staff
	 *            the staff a string
	 * @param status
	 *            the status of the booking a string (booked or available)
	 */
	public Booking(Availability slot, Employee staff, String status) {
		this.slot = slot;
		this.staff = staff;
		this.status = status;
                this.availableTime = AVAILABE_TIME;
	}
        
        /**
	 * Instantiates a new booking.
	 *
	 * @param slot
	 *            the slot an availability
	 * @param staff
	 *            the staff a string
	 * @param status
	 *            the status of the booking a string (booked or available)
         * @param time
	 *            the length of available time
	 */
        public Booking(Availability slot, Employee staff, String status, int time) {
		this.slot = slot;
		this.staff = staff;
		this.status = status;
                this.availableTime = time;
	}

	/**
	 * Instantiates a new booking.
	 *
	 * @param slot
	 *            the slot an availability
	 * @param staff
	 *            the staff a string
	 * @param status
	 *            the status of the booking a string (booked or available)
	 * @param business
	 *            the business to add
	 */
	public Booking(Availability slot, Employee staff, String status, Business business) {
		this.slot = slot;
		this.staff = staff;
		this.status = status;
		this.business = business;
	}

	/**
	 * Gets the slot.
	 *
	 * @return the slot
	 */
	public Availability getSlot() {
		return slot;
	}

	/**
	 * Gets the staff.
	 *
	 * @return the staff
	 */
	public Employee getStaff() {
		return staff;
	}

	/**
	 * Gets the business.
	 *
	 * @return the business
	 */
	public Business getBusiness() {
		return business;
	}

	/**
	 * Sets the business.
	 *
	 * @param business
	 *            the new business
	 */
	public void setBusiness(Business business) {
		this.business = business;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
        
        /**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public int getTime() {
		return availableTime;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;

	}
        
        /**
         * Sets the time
         * 
         * @param time
         *              the new times
         */
        public void setTimes(int time){
                this.availableTime = time;
        }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Booking [slot=" + slot + ", staff=" + staff + ", busniness=" + business + ", status=" + status + "]";

	}

	public String getService() {
		// TODO Set up services
		return null;
	}

}
