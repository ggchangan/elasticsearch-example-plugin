package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.rest.*;

/**
 * Created by magneto on 16-10-28.
 */
public class HelloRestHandler implements RestHandler {
    @Inject
    public HelloRestHandler(RestController restController) {
        restController.registerHandler(RestRequest.Method.GET, "/_hello", this);
    }

    public void handleRequest(final RestRequest request, final RestChannel channel) throws Exception {
        String who = request.param("who");
        String whoSafe = (who != null)? who:"world";
        channel.sendResponse(new BytesRestResponse(RestStatus.OK, "Hello," + whoSafe + "!"));
    }
}
