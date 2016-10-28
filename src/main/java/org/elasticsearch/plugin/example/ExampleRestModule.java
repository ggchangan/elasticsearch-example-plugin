package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.AbstractModule;

/**
 * Created by magneto on 16-10-28.
 */
public class ExampleRestModule extends AbstractModule {
    @Override protected void configure() {
        bind(HelloRestHandler.class).asEagerSingleton();
    }
}
