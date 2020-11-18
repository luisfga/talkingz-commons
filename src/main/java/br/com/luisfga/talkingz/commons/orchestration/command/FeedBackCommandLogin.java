/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.orchestration.command;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.luisfga.talkingz.commons.MessageWrapper;
import br.com.luisfga.talkingz.commons.orchestration.Orchestration;

/**
 *
 * @author Luis
 */
public class FeedBackCommandLogin extends Orchestration{
    
    private List<MessageWrapper> pendingMessages = new ArrayList<>();
    private List<UUID> pendingConfirmationUUIDs = new ArrayList<>();

    public FeedBackCommandLogin() {
        this.type = "FeedBackCommandLogin";
    }

    public List<MessageWrapper> getPendingMessages() {
        return pendingMessages;
    }

    public List<UUID> getPendingConfirmationUUIDs() {
        return pendingConfirmationUUIDs;
    }
    
}
