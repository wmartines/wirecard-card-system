package de.com.wirecard.type;

/**
 * The Enum BooleanType.
 */
public enum UserStatusType {

	/** The yes. */
	ACTIVE(1, true), 
	/** The no. */
	IN_REGISTRATION(0, false);

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
	UserStatusType(Integer id, Boolean bool) {
		this.id = id;
		this.bool = bool;
	}

	/**
	 * Gets the by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
	public static UserStatusType getById(Integer id) {

		for (UserStatusType e : UserStatusType.values()) {
			if (e.getId() == id) {
				return e;
			}
		}

		return IN_REGISTRATION;// false
	}

	/**
	 * Gets the by bool.
	 *
	 * @param bool the bool
	 * @return the by bool
	 */
	public static UserStatusType getByBool(Boolean bool) {
		for (UserStatusType e : UserStatusType.values()) {
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
