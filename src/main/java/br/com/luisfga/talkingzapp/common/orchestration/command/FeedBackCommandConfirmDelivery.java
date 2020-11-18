/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingzapp.common.orchestration.command;

import java.util.UUID;

import br.com.luisfga.talkingzapp.common.orchestration.Orchestration;

/**
 *
 * @author Luis
 */
public class FeedBackCommandConfirmDelivery extends Orchestration {
    
    private UUID id;
    private UUID senderId;

    public FeedBackCommandConfirmDelivery() {
        this.type = "FeedBackCommandConfirmDelivery";
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
