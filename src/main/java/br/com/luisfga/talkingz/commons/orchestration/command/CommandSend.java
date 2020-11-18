/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.orchestration.command;

import br.com.luisfga.talkingz.commons.MessageWrapper;
import br.com.luisfga.talkingz.commons.orchestration.Orchestration;

/**
 *
 * @author Luis
 */
public class CommandSend extends Orchestration {
    
    private MessageWrapper messageWrapper;

    public CommandSend() {
        this.type = "CommandSend";
    }

    public MessageWrapper getMessageWrapper() {
        return messageWrapper;
    }

    public void setMessageWrapper(MessageWrapper messageWrapper) {
        this.messageWrapper = messageWrapper;
    }
    
}
