package abs.model;

/**
 * The Class Availability.
 * <p>
 * Essentially creating our own Date Time pair class. plus things that interact
 * with it.
 * </p>
 *
 * @since Alpha
 * @version 1.1
 */
public class Availability {

	/** The date. */
	private String date;

	/** The time. */
	private String time;
        
        private int block_count;

	/**
	 * Instantiates a new availability.
	 *
	 * @param date
	 *            the date as a string
	 * @param time
	 *            the time as a string
	 */
	public Availability(String date, String time) {
		this.date = date;
		this.time = time;
                this.block_count = 1;
	}
        
        public Availability(String date, String time, int blockCount) {
		this.date = date;
		this.time = time;
                this.block_count = blockCount;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the date.
	 *
	 * @param date
	 *            the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Sets the time.
	 *
	 * @param time
	 *            the new time
	 */
	public void setTime(String time) {
		this.time = time;
	}
        
        public void setBlockCount(int blockCount){
                this.block_count = blockCount;
        }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Availability [date=" + date + ", time=" + time + ", block count="+ block_count +"]";
	}

	public int getBlocks() {
		// TODO setup class for blocks
                return block_count;
	}

}