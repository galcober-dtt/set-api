package eu.europeana.set.definitions.config;

import java.util.Properties;

public class UserSetConfigurationImpl implements UserSetConfiguration {

    public static final String SUFFIX_BASEURL = "baseUrl";

    public static final String PREFIX_MAX_PAGE_SIZE = "userset.search.maxpagesize.";

    public static final String USERSET_ENVIRONMENT = "set.environment";

    public static final String VALUE_ENVIRONMENT_PRODUCTION = "production";
    public static final String VALUE_ENVIRONMENT_TEST = "test";
    public static final String VALUE_ENVIRONMENT_DEVELOPMENT = "development";

    // TODO: move constants to api commons
    public static final String AUTHORIZATION_API_NAME = "authorization.api.name";
    public static final String KEY_APIKEY_JWTTOKEN_SIGNATUREKEY = "europeana.apikey.jwttoken.siganturekey";
    public static final String KEY_SEARCH_APIKEY = "europeana.search.apikey";
    public static final String KEY_SEARCH_URL = "europeana.search.url";
    public static final String API_VERSION = "set.api.version";

    private Properties setProperties;

    @Override
    public String getComponentName() {
	return "set";
    }

    public Properties getSetProperties() {
	return setProperties;
    }

    public void setSetProperties(Properties setProperties) {
	this.setProperties = setProperties;
    }

    @Override
    public String getUserSetBaseUrl() {
	String key = USERSET_ENVIRONMENT + "." + getEnvironment() + "." + SUFFIX_BASEURL;
	return getSetProperties().getProperty(key);
    }

    @Override
    public String getEnvironment() {
	return getSetProperties().getProperty(USERSET_ENVIRONMENT);
    }

    public int getMaxPageSize(String profile) {
	String key = PREFIX_MAX_PAGE_SIZE + profile;
	return Integer.parseInt(getSetProperties().getProperty(key));
    }

    @Override
    public boolean isProductionEnvironment() {
	return VALUE_ENVIRONMENT_PRODUCTION.equals(getEnvironment());
    }

    @Override
    public String getJwtTokenSignatureKey() {
	return getSetProperties().getProperty(KEY_APIKEY_JWTTOKEN_SIGNATUREKEY);
    }

    public String getAuthorizationApiName() {
	return getSetProperties().getProperty(AUTHORIZATION_API_NAME);
    }

    @Override
    public String getApiVersion() {
	return getSetProperties().getProperty(API_VERSION);
    }

    @Override
    public String getSearchApiKey() {
	return getSetProperties().getProperty(KEY_SEARCH_APIKEY);
    }

    @Override
    public String getSearchApiUrl() {
	return getSetProperties().getProperty(KEY_SEARCH_URL);
    }

}
