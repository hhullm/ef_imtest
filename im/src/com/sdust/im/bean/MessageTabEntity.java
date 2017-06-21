package com.sdust.im.bean;

import java.sql.Date;

/**
 * 类名：MessageEntity 说明：messageFragment显示的消息
 */
public class MessageTabEntity {
	public static final String MAKE_FRIEND_REQUEST = "0";// 收到的是交友的请求
	public static final String MAKE_FRIEND_RESPONSE_ACCEPT = "1";//收到回复，对方接受
	public static final String MAKE_FRIEND_RESPONSE_REJECT = "2";//收到回复，对方拒绝
	public static final String FRIEND_MESSAGE = "3";// 收到的是朋友的信息
	private int unReadCount;
	private String senderId;// 发送方的Id
	private String content;
	private String messageType;
	private String sendTime;
	private String name;
	public int getUnReadCount() {
		return unReadCount;
	}
	public void setUnReadCount(int unReadCount) {
		this.unReadCount = unReadCount;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
