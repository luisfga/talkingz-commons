package br.com.luisfga.talkingz.commons.orchestration;

import br.com.luisfga.talkingz.commons.orchestration.response.ResponseCommandFindContact;
import br.com.luisfga.talkingz.commons.orchestration.command.FeedBackCommandDeliver;
import br.com.luisfga.talkingz.commons.orchestration.command.FeedBackCommandSend;
import br.com.luisfga.talkingz.commons.orchestration.command.FeedBackCommandSyncUser;
import br.com.luisfga.talkingz.commons.orchestration.command.FeedBackCommandConfirmDelivery;
import br.com.luisfga.talkingz.commons.orchestration.command.CommandSend;
import br.com.luisfga.talkingz.commons.orchestration.command.CommandSyncUser;
import br.com.luisfga.talkingz.commons.orchestration.response.CommandFindContact;
import br.com.luisfga.talkingz.commons.orchestration.command.CommandDeliver;
import br.com.luisfga.talkingz.commons.orchestration.command.CommandConfirmDelivery;
import com.google.gson.Gson;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import br.com.luisfga.talkingz.commons.orchestration.command.FeedBackCommandLogin;
import br.com.luisfga.talkingz.commons.orchestration.response.CommandGetFile;
import br.com.luisfga.talkingz.commons.orchestration.response.ResponseCommandGetFile;

public class OrchestrationDecoder implements Decoder.Text<Orchestration> {

    private final Gson gson = new Gson();

    @Override
    public Orchestration decode(String s) throws DecodeException {

        Orchestration orchestration = gson.fromJson(s, Orchestration.class);
        
        switch (orchestration.getType()) {
            case "CommandConfirmDelivery":
                return gson.fromJson(s, CommandConfirmDelivery.class);
            case "CommandDeliver":
                return gson.fromJson(s, CommandDeliver.class);
            case "CommandSend":
                return gson.fromJson(s, CommandSend.class);
            case "CommandSyncUser":
                return gson.fromJson(s, CommandSyncUser.class);

            case "FeedBackCommandConfirmDelivery":
                return gson.fromJson(s, FeedBackCommandConfirmDelivery.class);
            case "FeedBackCommandDeliver":
                return gson.fromJson(s, FeedBackCommandDeliver.class);
            case "FeedBackCommandLogin":
                return gson.fromJson(s, FeedBackCommandLogin.class);
            case "FeedBackCommandSend":
                return gson.fromJson(s, FeedBackCommandSend.class);
            case "FeedBackCommandSyncUser":
                return gson.fromJson(s, FeedBackCommandSyncUser.class);
                
            case "CommandFindContact":
                return gson.fromJson(s, CommandFindContact.class);
            case "CommandGetFile":
                return gson.fromJson(s, CommandGetFile.class);
            case "ResponseCommandFindContact":
                return gson.fromJson(s, ResponseCommandFindContact.class);
            case "ResponseCommandGetFile":
                return gson.fromJson(s, ResponseCommandGetFile.class);

            default:
                break;
        }
        
        return orchestration;
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null);
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
