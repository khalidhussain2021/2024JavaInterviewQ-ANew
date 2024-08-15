package com.hussainIT.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;import java.util.stream.Collectors;
import java.util.stream.Stream;

class User {
	private int userId;
	private String userName;
	private String password;
	private String email;
	
	public User(int userId, String userName, String password, String email) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ "]";
	}
}
class UserDTO {
	private int userId;
	private String userName;
	private String email;
	public UserDTO(int userId, String userName, String email) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}
}

public class StreamMapCollectExam {
	public static void main(String[] args) {
		//traditional way
		List<User> users=new ArrayList<>();
		List<UserDTO> userDTO=new ArrayList<>();
		users.add(new User(1,"khalid", "secret", "khalid@gmail.com"));
		users.add(new User(2,"hussain", "secret", "hussain@gmail.com"));
		users.add(new User(3,"md", "secret", "md@gmail.com"));
		users.add(new User(10,"kha", "secret", "kha@gmail.com"));
		
		for(User user:users) {
			userDTO.add(new UserDTO(user.getUserId(), user.getUserName(),user.getEmail()));
		}
		for(UserDTO dto:userDTO) {
//			System.out.println(dto);
		}
		
		users.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getUserId(), user.getUserName(), user.getEmail());
			}
			
		});
		
		Stream<UserDTO> mapDto = users.stream().map((User user)-> new UserDTO(user.getUserId(), user.getUserName(), user.getEmail()));
		mapDto.forEach(System.out::println);
	}

}
