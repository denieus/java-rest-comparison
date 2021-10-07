package com.octa.helidon;

import org.eclipse.microprofile.auth.LoginConfig;

import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Application;

@LoginConfig(authMethod = "MP-JWT")
@ApplicationScoped
public class HelloApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(HelloResource.class);
    }
}
