package com.piggsoft.event.impl.msg;

import com.piggsoft.event.WXEvent;
import com.piggsoft.event.annotation.XmlMsgType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by user on 2015/11/19.
 */
@XmlMsgType(msgType = "location")
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationMsg extends WXEvent {
}
