package eu.europeana.set.definitions.model.search.result;

import java.util.Date;

public interface IdBean {

	/**
	 * Retrieve the Europeana object unique Id
	 * 
	 * @return The Europeana object UniqueID
	 */
	String getIdAsString();
	
	/**
	 * The date the record was updated
	 * @return 
	 */
	Date getLastUpdate();
}
