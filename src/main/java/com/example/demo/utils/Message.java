package com.example.demo.utils;

/**
 * 
 * @author william_lee
 * @date 2019年2月14日
 * <p>Description:自定义消息类 </p>
 */
public class Message<T> {
	
	private String msg;
	private Integer status;
	//data是后端返回给前端所需要的数据，如果有需求，就可以携带相应的实体类过去
	private T date;
	
	
	
	public Message() {
		super();
	}
	
	public Message(String msg, Integer status, T date) {
		super();
		this.msg = msg;
		this.status = status;
		this.date = date;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public T getDate() {
		return date;
	}
	public void setDate(T date) {
		this.date = date;
	}
	
	

}
