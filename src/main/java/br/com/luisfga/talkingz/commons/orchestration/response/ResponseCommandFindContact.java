/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.orchestration.response;

import br.com.luisfga.talkingz.commons.UserWrapper;
import br.com.luisfga.talkingz.commons.orchestration.Orchestration;
import br.com.luisfga.talkingz.commons.orchestration.response.dispatching.Response;

/**
 *
 * @author Luis
 */
public class ResponseCommandFindContact extends Orchestration implements Response {
    
    private UserWrapper userWrapper;

    public ResponseCommandFindContact() {
        this.type = "ResponseCommandFindContact";
    }

    public UserWrapper getUserWrapper() {
        return userWrapper;
    }

    public void setUserWrapper(UserWrapper userWrapper) {
        this.userWrapper = userWrapper;
    }
    
}
