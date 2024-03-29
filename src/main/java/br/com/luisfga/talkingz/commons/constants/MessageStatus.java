package br.com.luisfga.talkingz.commons.constants;

/**
 *
 * @author Luis
 */
public class MessageStatus {
    
    //apenas no remetente, após enviar a mensagem
    public static final byte MSG_STATUS_SENT = 1; //client only
    
    //salva no servidor e no remetente, quando já estiver salva no servidor. Pendente de envio para o destinatário
    public static final byte MSG_STATUS_ON_TRAFFIC = 2; //client and server
    
    //apenas no destinatário, após receber a mensagem
    public static final byte MSG_STATUS_RECEIVED = 3; //client only
    
    //no servidor e no rementente, quando estiver RECEIVED no destinatário
    public static final byte MSG_STATUS_DELIVERED = 4; //client and server
    
    //no servidor após o remetente receber a confirmação
    public static final byte MSG_STATUS_CONFIRMED = 5; //server only
    
    
}
