/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons.utils;

/**
 *
 * @author Luis
 */
public class SharedFileDTO {
    
    private String downloadToken;
    private byte[] bytes;
    private byte mimeType;

    public String getDownloadToken() {
        return downloadToken;
    }

    public void setDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public byte getMimeType() {
        return mimeType;
    }

    public void setMimeType(byte mimeType) {
        this.mimeType = mimeType;
    }
    
}
