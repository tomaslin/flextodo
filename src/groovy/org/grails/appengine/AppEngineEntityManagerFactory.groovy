package org.grails.appengine

import javax.persistence.*

/**
 * Entity manager factory for JPA on the app engine.
 * @author juanjo
 */
public final class AppEngineEntityManagerFactory {
    /**
     * Unique instance of the class. It's NEVER null.
     */
    private static final EntityManagerFactory instance = Persistence.createEntityManagerFactory("transactions-optional")

    /**
     * Constructor defined to avoid class clients trying to create instances of
     * this class.
     */
    private AppEngineEntityManagerFactory() {
        throw new IllegalStateException( 'You should not try to instantiate this class.' )
    }

    /**
     * Gets the unique EntityManagerFactory in the JVM.
     *
     * @returns a not <code>null</code> nor duplicated instance
     * EntityManagerFactory for JPA.
     */
    static EntityManagerFactory get() {
        AppEngineEntityManagerFactory.instance;
    }
}
