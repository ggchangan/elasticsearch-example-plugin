package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.Plugin;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by magneto on 16-10-28.
 */
public class ExamplePlugin extends Plugin{
    @Override public String name() {
        return "elasticsearch-example-plugin";
    }

    @Override public String description() {
        return "first elasticsearch plugin develop";
    }

    @Override
    public Collection<Module> nodeModules() {
        return Collections.<Module>singletonList(new ExampleRestModule());
    }
}
