/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingzapp.common.orchestration.response;

import br.com.luisfga.talkingzapp.common.orchestration.Orchestration;
import br.com.luisfga.talkingzapp.common.orchestration.response.dispatching.Response;

/**
 *
 * @author Luis
 */
public class ResponseCommandGetFile extends Orchestration implements Response {
    
    private String message;

    public ResponseCommandGetFile() {
        this.type = "ResponseCommandGetFile";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
