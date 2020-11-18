/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.orchestration.response.dispatching;

/**
 *
 * @author Luis
 * @param <Response>
 */
public interface ResponseHandler<Response> {
    
   void handleResponse(Response response);
    
}
