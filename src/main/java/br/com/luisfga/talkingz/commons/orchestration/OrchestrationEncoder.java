package br.com.luisfga.talkingz.commons.orchestration;

import com.google.gson.Gson;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class OrchestrationEncoder implements Encoder.Text<Orchestration> {

    private final Gson gson = new Gson();
    
    @Override
    public String encode(Orchestration message) throws EncodeException {
        return gson.toJson(message);
    }
    
    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    @Override
    public void destroy() {
        // Close resources
    }
}
