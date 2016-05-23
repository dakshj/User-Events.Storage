package daksh.userevents.storage.apps.constants;

/**
 * Created by daksh on 23-May-16.
 */
public final class AppNetworkConstants {

    public static final String BASE_URL = "/apps";

    public static final String CREATE_APP = "/";
    public static final String NAME = "name";

    public static final String APP_ID = "app_id";
    public static final String GET_APP = "/{" + APP_ID + "}";

    public static final String GET_ALL_APPS = "/";

    public static final String REGENERATE_APP_TOKEN = "/regenerate_app_token";
    public static final String DELETE_APP = "/";
}