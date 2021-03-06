package eu.europeana.set.definitions.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import eu.europeana.set.definitions.model.agent.Agent;

public interface UserSet extends PageInfo{

	String getType();

	void setType(String type);

	String getVisibility();

	void setVisibility(String visibility);

	Map<String, String> getTitle();

	void setTitle(Map<String, String> title);

	Map<String, String> getDescription();

	void setDescription(Map<String, String> setDescription);

	String getItemType();

	void setItemType(String itemType);

	List<String> getSubject();

	void setSubject(List<String> subject);

//	String getSpatial();
//
//	void setSpatial(String spatial);
//
//	boolean isUgc();
//
//	void setUgc(boolean ugc);

	Agent getCreator();

	void setCreator(Agent creator);

	Date getCreated();

	void setCreated(Date created);

	Date getModified();

	void setModified(Date modified);

	List<String> getItems();

	void setItems(List<String> items);

	public String getIdentifier();
	
	public void setIdentifier(String sequenceIdentifier);
	
//	public String getContext();
//	
//	public void setContext(String context);
	
	/**
	 * @return Holds a search request to the User Set API (complete URL pointing to production). 
	 * To reduce complexity on the API, the exhaustive listing could also be expressed as a query.
	 */
	String getIsDefinedBy();
	
	void setIsDefinedBy(String query);
	
    /**
     * This method detects if it is open or closed set
     * @return true if it is an open set
     */
    public boolean isOpenSet();
    
    public boolean isPrivate();
    
    public boolean isPublic();
    
    public boolean isPublished();
    
}