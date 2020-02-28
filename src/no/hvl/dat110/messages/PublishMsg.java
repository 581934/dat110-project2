package no.hvl.dat110.messages;

import java.util.HashSet;
import java.util.Set;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	private Set<String> users;
    private String topic;
	
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public PublishMsg(Set<String> user, String topic) {
		super(MessageType.PUBLISH, user);
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
		return "PublishMsg ["
				+ "topic= " + topic 
				+ ", users= " + users
				+ "]";
	}

}
