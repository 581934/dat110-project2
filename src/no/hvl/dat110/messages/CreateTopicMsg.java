package no.hvl.dat110.messages;

import java.util.HashSet;
import java.util.Set;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker

	// TODO: 
	// Implement object variables - a topic is required
	
	// Constructor, get/set-methods, and toString method
	// as described in the project text	
	
	private Set<String> users;
    private String topic;
	
	public CreateTopicMsg(Set<String> user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.users = new HashSet<String>();
		this.users.add(user);
		this.topic = topic;
	}
	
	
	public Set<String> getUsers() {
		return users;
	}

	public void setUsers(Set<String> users) {
		this.users = users;
	}
	
	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		return "Topic ["
				+ "topic= " + topic 
				+ ", users= " + users
				+ "]";
	}
	
}

