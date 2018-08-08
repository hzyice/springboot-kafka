package com.hzyice.demo.producer;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/*
消息体
 */

@Data
public class Message  implements Serializable{

    private static final long serialVersionUID = -2055442113804349629L;

    private String id;

    private String msg;

    private Date sendTime;

    public Message(String id, String msg, Date sendTime) {
        this.id = id;
        this.msg = msg;
        this.sendTime = sendTime;
    }
}
