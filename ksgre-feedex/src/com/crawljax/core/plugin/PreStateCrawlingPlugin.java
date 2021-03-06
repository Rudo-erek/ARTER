package com.crawljax.core.plugin;

import com.crawljax.core.CandidateElement;
import com.crawljax.core.CrawlSession;

import java.util.List;

/**
 * Plugin type that is called before firing events on the current DOM state. Example: filter
 * candidate elements.
 * 
 * @author dannyroest@gmail.com (Danny Roest)
 * @version $Id: PreStateCrawlingPlugin.java 65 2010-01-13 14:16:52Z frankgroeneveld $
 */
public interface PreStateCrawlingPlugin extends Plugin {

	/**
	 * Method that is called before firing events on the current DOM state. Example: filter
	 * candidate elements. Warning the session and candidateElements are not clones, changes will
	 * result in changed behaviour.
	 * 
	 * @param session
	 *            the current session data.
	 * @param candidateElements
	 *            the candidates for the current state.
	 */
	void preStateCrawling(CrawlSession session, List<CandidateElement> candidateElements);

}
