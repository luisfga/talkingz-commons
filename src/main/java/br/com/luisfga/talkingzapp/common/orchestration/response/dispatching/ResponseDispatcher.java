/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingzapp.common.orchestration.response.dispatching;

import br.com.luisfga.talkingzapp.common.orchestration.response.ResponseCommandFindContact;
import br.com.luisfga.talkingzapp.common.orchestration.response.ResponseCommandGetFile;

/**
 *
 * @author Luis
 */
public interface ResponseDispatcher {

    void setResponseCommandFindContactHandler(ResponseHandler<ResponseCommandFindContact> responseHandler);

    void setResponseCommandGetFileHandler(ResponseHandler<ResponseCommandGetFile> responseGetFileHandler);
    
}