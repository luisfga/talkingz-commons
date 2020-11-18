/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.orchestration.command;

import java.util.UUID;

import br.com.luisfga.talkingz.commons.orchestration.Orchestration;

/**
 *
 * @author Luis
 */
public class FeedBackCommandSend extends Orchestration {
    
    private long sentTimeInMillis;
    private UUID id;

    public FeedBackCommandSend() {
        this.type = "FeedBackCommandSend";
    }
    
    public long getSentTimeInMillis() {
        return sentTimeInMillis;
    }

    public void setSentTimeInMillis(long sentTimeInMillis) {
        this.sentTimeInMillis = sentTimeInMillis;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
