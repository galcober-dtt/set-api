package eu.europeana.set.search.service;


import java.io.IOException;
import java.util.List;

import org.apache.commons.httpclient.HttpException;
import org.codehaus.jettison.json.JSONException;

import eu.europeana.set.search.exception.SearchApiClientException;


public interface SearchApiClient {

	/**
	 * This methods converts items from user set object to a list of IDs.
	 * @param uri The search URI
	 * @return a list of IDs
	 * @throws HttpException
	 * @throws IOException
	 * @throws JSONException
	 * @throws SearchApiClientException 
	 */
//	List<String> searchItems(String uri) throws SearchApiClientException;

	/**
	 * This method searches the user sets using the provided search query and specific filters
	 * @param query
	 * @return
	 * @throws HttpException
	 */
//	public SearchApiResponse search(Query query) throws Exception;
	
    /**
     * @param uri
     * @param apiKey
     * @param action
     * @return
     * @throws IOException
     * @throws JSONException
     * @throws SearchApiClientException 
     * @throws HttpException
     */
    public SearchApiResponse searchItems(String uri, String apiKey, String action) 
    		throws SearchApiClientException;

}