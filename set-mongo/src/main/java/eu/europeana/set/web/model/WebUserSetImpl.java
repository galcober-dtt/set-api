package eu.europeana.set.web.model;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import eu.europeana.set.definitions.model.agent.Agent;
import eu.europeana.set.definitions.model.vocabulary.WebUserSetFields;
import eu.europeana.set.mongo.model.PersistentUserSetImpl;

@JsonPropertyOrder({ WebUserSetFields.ID, WebUserSetFields.TYPE, WebUserSetFields.TITLE, WebUserSetFields.DESCRIPTION,
	WebUserSetFields.VISIBILITY, WebUserSetFields.IS_DEFINED_BY, WebUserSetFields.ITEMS, WebUserSetFields.CREATOR,
	WebUserSetFields.CREATED, WebUserSetFields.MODIFIED, WebUserSetFields.TOTAL, WebUserSetFields.NEXT,
	WebUserSetFields.PREV })
@JsonInclude(value = JsonInclude.Include.NON_DEFAULT)
public class WebUserSetImpl extends PersistentUserSetImpl {

    @JsonIgnore
    public String getIdentifier() {
	return super.getIdentifier();
    }

    @JsonProperty(WebUserSetFields.TYPE)
    public void setType(String type) {
	super.setType(type);
    }

    @JsonProperty(WebUserSetFields.VISIBILITY)
    public void setVisibility(String visibility) {
	super.setVisibility(visibility);
    }

    @JsonIgnore
    public int getNext() {
	return super.getNext();
    }

    @JsonIgnore
    public int getPrev() {
	return super.getPrev();
    }

    @JsonProperty(WebUserSetFields.TITLE)
    public Map<String, String> getTitle() {
	return super.getTitle();
    }

    @JsonProperty(WebUserSetFields.DESCRIPTION)
    public Map<String, String> getDescription() {
	return super.getDescription();
    }

    @JsonProperty(WebUserSetFields.TOTAL)
    @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)
    public int getTotal() {
	return super.getTotal();
    }

    @JsonProperty(WebUserSetFields.IS_DEFINED_BY)
    public String getIsDefinedBy() {
	return super.getIsDefinedBy();
    }

    @JsonProperty(WebUserSetFields.CONTEXT_FIELD)
    @JsonIgnore // avoid double serialization
    public String getContext() {
	return super.getContext();
    }

    @Override
    @JsonProperty(WebUserSetFields.CONTEXT_FIELD)
    public void setContext(String context) {
	super.setContext(context);
    }

    @JsonProperty(WebUserSetFields.CREATOR)
    @JsonIgnore // creator is automatically set by the system, temporarily excluded from
		// serialization
    public Agent getCreator() {
	return super.getCreator();
    }

    @JsonProperty(WebUserSetFields.ITEMS)
    public List<String> getItems() {
	return super.getItems();
    }

    @JsonIgnore
    public boolean isUgc() {
	return super.isUgc();
    }

    @JsonIgnore
    public String getFirst() {
	return super.getFirst();
    }

    @JsonIgnore
    public String getLast() {
	return super.getLast();
    }

    @JsonIgnore
    public int getCollectionPage() {
	return super.getCollectionPage();
    }

    /**
     * This method presents Id as URL.
     * 
     * @param id   The user set id
     * @param base The base URL
     * @return string presenting ID as URL
     */
    @JsonProperty(WebUserSetFields.ID)
    public String getId() {
	StringBuilder urlBuilder = new StringBuilder();
	urlBuilder.append(WebUserSetFields.BASE_SET_URL);
	urlBuilder.append(super.getIdentifier());
	return urlBuilder.toString();
    }

    public void setId(String id) {
	// this method is defined just for avoiding parse errors in update method, the
	// URI is ignored as the identifier from URL is used
    }

    public String toString() {
	StringBuilder resBuilder = new StringBuilder();
	resBuilder.append("WebUserSet [");
	if (getTitle() != null && StringUtils.isNotEmpty(getTitle().toString())) {
	    resBuilder.append("Title: ");
	    resBuilder.append(getTitle());
	}
	if (StringUtils.isNotEmpty(getIdentifier())) {
	    resBuilder.append(", Identifier: ");
	    resBuilder.append(getIdentifier());
	}
	if (StringUtils.isNotEmpty(Integer.toString(getTotal()))) {
	    resBuilder.append(", Total items: ");
	    resBuilder.append(getTotal());
	}
	if (getItems() != null && getItems().size() > 0) {
	    resBuilder.append(", Items: ");
	    resBuilder.append(getItems().size());
	}
	resBuilder.append("]");
	return resBuilder.toString();
    }

    @Override
    @JsonIgnore
    public ObjectId getObjectId() {
	return super.getObjectId();
    }

    @Override
    @JsonIgnore
    public boolean isOpenSet() {
	return super.isOpenSet();
    }

    @Override
    @JsonIgnore
    public boolean isPrivate() {
	return super.isPrivate();
    }

    @Override
    @JsonIgnore
    public boolean isPublic() {
	return super.isPublic();
    }

    @Override
    @JsonIgnore
    public boolean isPublished() {
	return super.isPublished();
    }
}
