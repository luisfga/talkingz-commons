/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.orchestration.response;

import br.com.luisfga.talkingz.commons.orchestration.Orchestration;

/**
 *
 * @author Luis
 */
public class CommandFindContact extends Orchestration {
    
    private String searchToken;

    public CommandFindContact() {
        this.type = "CommandFindContact";
    }

    public String getSearchToken() {
        return searchToken;
    }

    public void setSearchToken(String searchToken) {
        this.searchToken = searchToken;
    }

}
