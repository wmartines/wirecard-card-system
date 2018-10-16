package de.com.wirecard.type;

/**
 * The Enum BooleanType.
 */
public enum CardStatusType {

	/** The active. */
	ACTIVE(1, true), 
	/** The locked. */
	LOCKED(0, false);

	/** The id. */
	private final Integer id;
	
	/** The bool. */
	private final Boolean bool;

	/**
	 * Instantiates a new boolean type.
	 *
	 * @param id the id
	 * @param bool the bool
	 */
	CardStatusType(Integer id, Boolean bool) {
		this.id = id;
		this.bool = bool;
	}

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	public static CardStatusType getById(Integer id) {

		for (CardStatusType e : CardStatusType.values()) {
			if (e.getId() == id) {
				return e;
			}
		}

		return LOCKED;// false
	}

	/**
	 * Gets the by bool.
	 *
	 * @param bool the bool
	 * @return the by bool
	 */
	public static CardStatusType getByBool(Boolean bool) {
		for (CardStatusType e : CardStatusType.values()) {
			if (e.getBool() == bool) {
				return e;
			}
		}
		return null;// not found
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the bool.
	 *
	 * @return the bool
	 */
	public Boolean getBool() {
		return bool;
	}
}
