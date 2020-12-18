/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingz.commons;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Luis
 */
public class MessageWrapper implements Serializable {
    
    private UUID id;
    private String senderId;
    private String destId;
    private long sentTimeInMilis;
    private String content;
    private byte mimetype;
    private byte[] mediaThumbnail;
    private String downloadToken;
    private int status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getDestId() {
        return destId;
    }

    public void setDestId(String destId) {
        this.destId = destId;
    }

    public long getSentTimeInMilis() {
        return sentTimeInMilis;
    }

    public void setSentTimeInMilis(long sentTimeInMilis) {
        this.sentTimeInMilis = sentTimeInMilis;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte getMimetype() {
        return mimetype;
    }

    public void setMimetype(byte mimetype) {
        this.mimetype = mimetype;
    }

    public byte[] getMediaThumbnail() {
        return mediaThumbnail;
    }

    public void setMediaThumbnail(byte[] mediaThumbnail) {
        this.mediaThumbnail = mediaThumbnail;
    }

    public String getDownloadToken() {
        return downloadToken;
    }

    public void setDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
