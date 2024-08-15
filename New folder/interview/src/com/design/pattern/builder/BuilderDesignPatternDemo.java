package com.design.pattern.builder;

import com.design.pattern.builder.User.UserBuilder;

//to create complex object will use bulilder design pattern
//suppose we have one interface having lot of methods but we required few of them
//so will create one abstract class and implement those method in abstract clas and by using
//implematition of we will use that method.

class User {
	private Integer userId;
	private String userName;
	private String emailId;
	
	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	private User(UserBuilder builder) {
		this.userId=builder.userId;
		this.userName=builder.userName;
		this.emailId=builder.emailId;
		
	}
	@Override
	public String toString() {
		return "userId  "+this.userId +"userName: "+this.userName +" emaild :" +this.emailId  ;
	}
	//inner class to create the object 
	static class UserBuilder {
		private Integer userId;
		private String userName;
		private String emailId;
		
		public UserBuilder() {
			
		}
		
		//if we want to create the object globally using static there 
		public static UserBuilder builder() {
			return new UserBuilder();
		}
		
		public UserBuilder setUserId(Integer userId) {
			this.userId = userId;
			return this;
		}
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}
		public User build() {
			User user = new User(this);
			return user;
		}
		
	}	
}
public class BuilderDesignPatternDemo {
	public static void main(String[] args) {
		User user = new User.UserBuilder().setUserId(1)
		    .setUserName("Khalid")
		    .setEmailId("khalid@gmai.com").build();
		System.out.println(user);
		//using static 
		User user2 = User.UserBuilder.
		builder().setUserId(2)
		.setUserName("hussain")
		.setEmailId("hussain@gmail.com")
		.build();
		System.err.println(user2);
	}
}
