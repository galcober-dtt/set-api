package eu.europeana.set.definitions.model.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import eu.europeana.set.definitions.model.UserSet;
import eu.europeana.set.definitions.model.agent.Agent;
import eu.europeana.set.definitions.model.vocabulary.VisibilityTypes;

/**
 * Europeana Sets API Specification
 * 
 * @author GrafR
 *
 */
public class BaseUserSet implements UserSet {

	// EDM Collection Profile

	// Type of user set e.g. Collection
    private String type;

	// Visibility of user set e.g. private
    private String visibility;

    // Name of user set
    private Map<String, String> title; 

    // A summary of the content and topics of the set
    private Map<String, String> description;

    // Type or nature of objects or resources in the collection e.g. audio recordings
    private String itemType;

    // Terms that describe the overall topical content of the objects in the collection
    private List<String> subject;

    // A place(s) or area(s) associated with most or all of the objects in the collection
    private String spatial;

    // Indicates whether the set is generated by a User as opposed to more traditional 
    // collections combing from e.g. Data Providers. For the time being will be always set to true
    private boolean ugc;


    // Provenance information
    
    // A reference to the user agent that gathers objects together following implicit or explicit 
    // criteria or accrual policy. 
	private Agent creator;

	// The time at which the Set was created by the user. The value must be a literal expressed 
	// as xsd:dateTime with the UTC timezone expressed as "Z".
	private Date created;

	// The time at which the Set was modified, after creation. The value must be a literal expressed 
	// as xsd:dateTime with the UTC timezone expressed as "Z".
	private Date modified;
	
	
	// Ordered Collections from Activity Streams
	
	// For EDM Collection class

	// Indicates the furthest preceding page of items in the Set
	private String first;

	// Indicates the furthest proceeding page of the collection
	private String last;

	// A non-negative integer specifying the total number of items that are contained within a Set
	private int total = 0;
	
	// For OrderedCollectionPage class

	// Used to represent an ordered subsets of items from an OrderedCollection
	private int collectionPage;
	
	// The items that should be part of the Set (as a rdf:List)
	private List<String> items;

	// Indicates the next page of items
	private int next;

	// Indicates the previous page of items
	private int prev;
 
	// Identifies the Collection to which CollectionPage objects items belong
	private String partOf;

	// ID sequentially generated by a database
	private String identifier;

	// web context
//	private String context;

	// Contains query URI to items
	private String isDefinedBy;
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String sequenceIdentifier) {
		this.identifier = sequenceIdentifier;
	}
	
//	public String getContext() {
//		return context;
//	}
//	
//	public void setContext(String context) {
//		this.context = context;
//	}	
	
	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getType()
	 */
	@Override
	public String getType() {
		return type;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setType(java.lang.String)
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getTitle()
	 */
	@Override
	public Map<String, String> getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(Map<String, String> title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getDescription()
	 */
	@Override
	public Map<String, String> getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(Map<String, String> description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getItemType()
	 */
	@Override
	public String getItemType() {
		return itemType;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setItemType(java.lang.String)
	 */
	@Override
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getSubject()
	 */
	@Override
	public List<String> getSubject() {
		return subject;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setSubject(java.util.List)
	 */
	@Override
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getSpatial()
	 */
	@Override
	public String getSpatial() {
		return spatial;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setSpatial(java.lang.String)
	 */
	@Override
	public void setSpatial(String spatial) {
		this.spatial = spatial;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#isUgc()
	 */
	@Override
	public boolean isUgc() {
		return ugc;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setUgc(boolean)
	 */
	@Override
	public void setUgc(boolean ugc) {
		this.ugc = ugc;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getCreator()
	 */
	@Override
	public Agent getCreator() {
		return creator;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setCreator(eu.europeana.set.definitions.model.agent.Agent)
	 */
	@Override
	public void setCreator(Agent creator) {
		this.creator = creator;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getCreated()
	 */
	@Override
	public Date getCreated() {
		return created;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setCreated(java.util.Date)
	 */
	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getModified()
	 */
	@Override
	public Date getModified() {
		return modified;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setModified(java.util.Date)
	 */
	@Override
	public void setModified(Date modified) {
		this.modified = modified;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getFirst()
	 */
	@Override
	public String getFirst() {
		return first;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setFirst(int)
	 */
	@Override
	public void setFirst(String first) {
		this.first = first;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getLast()
	 */
	@Override
	public String getLast() {
		return last;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setLast(int)
	 */
	@Override
	public void setLast(String last) {
		this.last = last;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setTotal(int)
	 */
	@Override
	public void setTotal(int total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getCollectionPage()
	 */
	@Override
	public int getCollectionPage() {
		return collectionPage;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setCollectionPage(int)
	 */
	@Override
	public void setCollectionPage(int collectionPage) {
		this.collectionPage = collectionPage;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getItems()
	 */
	@Override
	public List<String> getItems() {
		return items;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setItems(java.util.List)
	 */
	@Override
	public void setItems(List<String> items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getNext()
	 */
	@Override
	public int getNext() {
		return next;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setNext(int)
	 */
	@Override
	public void setNext(int next) {
		this.next = next;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getPrev()
	 */
	@Override
	public int getPrev() {
		return prev;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setPrev(int)
	 */
	@Override
	public void setPrev(int prev) {
		this.prev = prev;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#getPartOf()
	 */
	@Override
	public String getPartOf() {
		return partOf;
	}

	/* (non-Javadoc)
	 * @see eu.europeana.set.definitions.model.impl.UserSet#setPartOf(java.lang.String)
	 */
	@Override
	public void setPartOf(String partOf) {
		this.partOf = partOf;
	}

	@Override
	public String toString() {
		String res = "\t### User set ###\n";
		
		if (getType() != null) 
			res = res + "\t\t" + "user set type:" + getType() + "\n";
		if (getTitle() != null) 
			res = res + "\t\t" + "name:" + getTitle() + "\n";
		if (getItems() != null) 
			res = res + "\t\t" + "number of items:" + getItems().size() + "\n";
		return res;
	}

	@Override
	public String getIsDefinedBy() {
		return this.isDefinedBy;
	}
	
	@Override
	public void setIsDefinedBy(String isDefinedBy) {
		this.isDefinedBy = isDefinedBy;
	}
	
    /* (non-Javadoc)
     * @see eu.europeana.set.definitions.model.UserSet#isOpenSet()
     */
    public boolean isOpenSet() {
    	boolean res = false;
    	if (getIsDefinedBy() != null) 
    		res = true;
    	return res;
    }	

    @Override
	public String getVisibility() {
		return this.visibility;
	}

	@Override
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	@Override
	public boolean isPrivate() {
	    return VisibilityTypes.PRIVATE.getJsonValue().equals(getVisibility());
	}

	@Override
	public boolean isPublic() {
	    return VisibilityTypes.PUBLIC.getJsonValue().equals(getVisibility());
	}

	@Override
	public boolean isPublished() {
	    return VisibilityTypes.PUBLISHED.getJsonValue().equals(getVisibility());
	}
}