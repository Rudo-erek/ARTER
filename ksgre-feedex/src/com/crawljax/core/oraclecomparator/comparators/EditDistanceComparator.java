package com.crawljax.core.oraclecomparator.comparators;

import com.crawljax.core.oraclecomparator.AbstractComparator;
import com.crawljax.util.EditDistance;

/**
 * Oracle Comparator that uses the Levenshtein Edit Distance to determince wheter two states are
 * equivalent.
 *
 * @author dannyroest@gmail.com (Danny Roest)
 * @version $Id: EditDistanceComparator.java 389 2010-07-16 14:44:24Z slenselink@google.com $
 */
public class EditDistanceComparator extends AbstractComparator {

	private double treshold = 1;

	/**
	 * Default constructor with edit distance treshold = 1.
	 */
	public EditDistanceComparator() {

	}

	/**
	 * @param treshold
	 *            the edit distance treshold. 1 is no difference, 0 is totally different
	 */
	public EditDistanceComparator(double treshold) {
		this.treshold = treshold;
	}

	/**
	 * @return true if and only if the edit distance threshold is >= the specified treshold
	 */
	@Override
	public boolean isEquivalent() {
		return EditDistance.isClone(getOriginalDom(), getNewDom(), getTreshold());
	}

	/**
	 * @return the treshold
	 */
	public double getTreshold() {
		return treshold;
	}

	/**
	 * @param treshold
	 *            the treshold to set
	 */
	public void setTreshold(double treshold) {
		this.treshold = treshold;
	}

}
