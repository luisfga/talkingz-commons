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
public class FeedBackCommandDeliver extends Orchestration {
    
    private UUID id;
    private UUID senderId;

    public FeedBackCommandDeliver() {
        this.type = "FeedBackCommandDeliver";
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getSenderId() {
        return senderId;
    }

    public void setSenderId(UUID senderId) {
        this.senderId = senderId;
    }
    
}
