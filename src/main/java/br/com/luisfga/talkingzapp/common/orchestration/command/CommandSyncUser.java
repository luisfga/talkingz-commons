/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingzapp.common.orchestration.command;

import br.com.luisfga.talkingzapp.common.orchestration.Orchestration;
import br.com.luisfga.talkingzapp.common.UserWrapper;

/**
 *
 * @author Luis
 */
public class CommandSyncUser extends Orchestration {
    
    private UserWrapper userWrapper;

    public CommandSyncUser() {
        this.type = "CommandSyncUser";
    }

    public UserWrapper getUserWrapper() {
        return userWrapper;
    }

    public void setUserWrapper(UserWrapper userWrapper) {
        this.userWrapper = userWrapper;
    }
    
}
