package eu.europeana.set.client.config;

import java.io.InputStream;
import java.util.Properties;

import eu.europeana.set.client.exception.TechnicalRuntimeException;


public class ClientConfiguration {

	protected static final String SET_CLIENT_PROPERTIES_FILE  = "/set-client.properties";
	protected static final String PROP_SET_API_KEY            = "set.api.key";
	protected static final String PROP_SET_SERVICE_URI        = "set.service.uri";

	private static Properties          properties = null;
	private static ClientConfiguration singleton;

	/**
	 * Hide the default constructor
	 */
	private ClientConfiguration() {
	}

	/**
	 * Accessor method for the singleton
	 * 
	 * @return
	 */
	public static synchronized ClientConfiguration getInstance() {
		singleton = new ClientConfiguration();
		singleton.loadProperties();
		return singleton;
	}

	/**
	 * Laizy loading of configuration properties
	 */
	public synchronized void loadProperties() {
		try {
			properties = new Properties();
			InputStream resourceAsStream = getClass().getResourceAsStream(
					SET_CLIENT_PROPERTIES_FILE);
			if (resourceAsStream != null)
				getProperties().load(resourceAsStream);
			else
				throw new TechnicalRuntimeException(
						"No properties file found in classpath! "
								+ SET_CLIENT_PROPERTIES_FILE);

		} catch (Exception e) {
			throw new TechnicalRuntimeException(
					"Cannot read configuration file: "
							+ SET_CLIENT_PROPERTIES_FILE, e);
		}

	}

	/**
	 * provides access to the configuration properties. It is not recommended to
	 * use the properties directly, but the
	 * 
	 * @return
	 */
	Properties getProperties() {
		return properties;
	}

	/**
	 * 
	 * @return the name of the file storing the client configuration
	 */
	String getConfigurationFile() {
		return SET_CLIENT_PROPERTIES_FILE;
	}

	/**
	 * This method provides access to the API key defined in the configuration
	 * file
	 * @see PROP_EUROPEANA_API_KEY
	 * 
	 * @return
	 */
	public String getApiKey() {
		return getProperties().getProperty(PROP_SET_API_KEY);
	}
	
	/**
	 * This method provides access to the search uri value defined in the configuration
	 * file
	 * @see PROP_EUROPEANA_SEARCH_URI
	 * 
	 * @return
	 */
	public String getServiceUri() {
		return getProperties().getProperty(PROP_SET_SERVICE_URI);
	}
}
