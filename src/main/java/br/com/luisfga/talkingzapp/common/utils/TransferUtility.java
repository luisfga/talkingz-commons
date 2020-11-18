/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luisfga.talkingzapp.common.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Luis
 */
public class TransferUtility {
    
    //TODO - (opcional/desafio) Tramar uma classe genérica que decodifique qualquer objeto
    
    //o atributo "downloadToken" funciona como um nome de arquivo e, sendo de tamanho variável, determinamos um tamanho máximo pra facilitar a decodificação
    private static final int DOWNLOAD_TOKEN_BUFFER_SIZE = 50;
    
    public static ByteBuffer getByteBufferFromInputStreamToTransfer(InputStream inputStream, byte mimeType, String downloadToken) throws FileNotFoundException, IOException {

        //1ª parte da tripa de Bytes -> MIMETYPE (Tamanho fixo)
        byte [] mimeTypeBytes = new byte[]{mimeType};

        //2ª parte da tripa de Bytes -> STRING identificador de arquivo (Tamanho variável: carregar buffer)
        byte [] downloadTokenBytes = downloadToken.getBytes(); //get bytes of filename
        byte [] downloadTokenBuffer = new byte[DOWNLOAD_TOKEN_BUFFER_SIZE]; //create a fixed size buffer, which will be appended to file bytes
        System.arraycopy(downloadTokenBytes, 0, downloadTokenBuffer, 0, downloadTokenBytes.length);

        //3ª parte da tripa de bytes -> BYTES, o conteúdo mesmo do arquivo
        byte [] fileBytes = IOUtils.toByteArray(inputStream); //read file into array directily

        //A TRIPA: array apensando todos os dados carregados acima
        byte [] appendedArray = new byte[mimeTypeBytes.length+downloadTokenBuffer.length+fileBytes.length];//precisa ter o tamanho da soma das partes

        int posicaoDeEscrita = 0;
        System.arraycopy(mimeTypeBytes, 0, appendedArray, posicaoDeEscrita, mimeTypeBytes.length); //1ª parte
        posicaoDeEscrita = posicaoDeEscrita + mimeTypeBytes.length;
        
        System.arraycopy(downloadTokenBuffer, 0, appendedArray, posicaoDeEscrita, downloadTokenBuffer.length);
        posicaoDeEscrita = posicaoDeEscrita + downloadTokenBuffer.length;
        
        System.arraycopy(fileBytes, 0, appendedArray, posicaoDeEscrita, fileBytes.length);

        return ByteBuffer.wrap(appendedArray);
        
    }
    
    public static ByteBuffer getByteBufferFromDTO(SharedFileDTO sharedFileDTO) {
        
        //1ª parte da tripa de Bytes -> MIMETYPE (Tamanho fixo)
        byte [] mimeTypeBytes = new byte[]{sharedFileDTO.getMimeType()};

        //2ª parte da tripa de Bytes -> STRING identificador de arquivo (Tamanho variável: carregar buffer)
        byte [] downloadTokenBytes = sharedFileDTO.getDownloadToken().getBytes(); //get bytes of filename
        byte [] downloadTokenBuffer = new byte[DOWNLOAD_TOKEN_BUFFER_SIZE]; //create a fixed size buffer, which will be appended to file bytes
        System.arraycopy(downloadTokenBytes, 0, downloadTokenBuffer, 0, downloadTokenBytes.length);

        //3ª parte da tripa de bytes -> BYTES, o conteúdo mesmo do arquivo
        byte [] fileBytes = sharedFileDTO.getBytes();

        //A TRIPA: array apensando todos os dados carregados acima
        byte [] appendedArray = new byte[mimeTypeBytes.length+downloadTokenBuffer.length+fileBytes.length];//precisa ter o tamanho da soma das partes

        int posicaoDeEscrita = 0;
        System.arraycopy(mimeTypeBytes, 0, appendedArray, posicaoDeEscrita, mimeTypeBytes.length); //1� parte
        posicaoDeEscrita = posicaoDeEscrita + mimeTypeBytes.length;
        
        System.arraycopy(downloadTokenBuffer, 0, appendedArray, posicaoDeEscrita, downloadTokenBuffer.length);
        posicaoDeEscrita = posicaoDeEscrita + downloadTokenBuffer.length;
        
        System.arraycopy(fileBytes, 0, appendedArray, posicaoDeEscrita, fileBytes.length);

        return ByteBuffer.wrap(appendedArray);
        
    }
    
    public static SharedFileDTO getSharedFileDTOFromByteBuffer(ByteBuffer byteBuffer) {
        SharedFileDTO sharedFileDTO = new SharedFileDTO();
        
        int sizeAtStart = byteBuffer.remaining();
        
        byte mimeTypeByte = byteBuffer.get(); //o primeiro byte é o mimeType
        
        byte [] downloadTokenBuffer = new byte[DOWNLOAD_TOKEN_BUFFER_SIZE];
        byteBuffer.get(downloadTokenBuffer); //carrega esse campo de tamanho variável que tem buffer de tamanhho fixo
        
        byte [] fileBytes = new byte [byteBuffer.remaining()]; //o que esiver sobrando (remaining) ao final é o conteúdo mesmo do arquivo
        byteBuffer.get(fileBytes);
        
        sharedFileDTO.setMimeType(mimeTypeByte);
        sharedFileDTO.setDownloadToken(new String(downloadTokenBuffer).trim());
        sharedFileDTO.setBytes(fileBytes);
        
        return sharedFileDTO;        
    }
    
}