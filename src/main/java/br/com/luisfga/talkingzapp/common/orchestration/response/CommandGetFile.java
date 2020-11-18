/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingzapp.common.orchestration.response;

import br.com.luisfga.talkingzapp.common.orchestration.Orchestration;

/**
 *
 * @author Luis
 */
public class CommandGetFile extends Orchestration {
    
    private String downloadToken;

    public CommandGetFile() {
        this.type = "CommandGetFile";
    }

    public String getDownloadToken() {
        return downloadToken;
    }

    public void setDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
    }

}
