package spring.jsample.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.jsample.model.User;
import spring.jsample.mybatis.UserMapper;

@Transactional
@Component
public class CommandHandler {

	@Autowired
	private UserMapper userMapper;

	public void getUser() {
		System.out.println("\nGetting user details - admin ...");
		User user = userMapper.select("admin");
		System.out.println(user);
	}

	public void updateUser() {
		System.out.println("\nUpdating user - admin ...");
		User user = new User("admin", "admin21");
		userMapper.update(user);
	}

	public void insertUser() {
		System.out.println("\nAdding a new user - admin ...");
		User user = new User("admin", "admin");
		userMapper.insert(user);

	}

	public void deleteUser() {
		System.out.println("\nDeleting root user ...");
		userMapper.delete("root");
	}

	public void getAllUsers() {
		System.out.println("\nFetching all users present in database ...");
		List<User> userList = userMapper.selectAll();
		userList.forEach((user) -> System.out.println(user));
	}
}