package daksh.userevents.storage.admins.api;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import daksh.userevents.storage.admins.constants.AdminNetworkConstants;
import daksh.userevents.storage.admins.db.AdminDao;
import daksh.userevents.storage.common.api.AuthenticationFilter;

/**
 * Created by daksh on 22-May-16.
 */

@AdminSecured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AdminAuthenticationFilter extends AuthenticationFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        handleAuthentication(requestContext, AdminNetworkConstants.ADMIN_ID, true);
    }

    @Override
    public String getIdFromToken(String token) throws NotAuthorizedException {
        return AdminDao.getInstance().getAdminIdFromAuthorizationToken(token);
    }
}