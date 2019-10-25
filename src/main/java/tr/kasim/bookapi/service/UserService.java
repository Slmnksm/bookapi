package tr.kasim.bookapi.service;

import java.util.List;

import tr.kasim.bookapi.model.User;

public interface UserService {

	//Register user
	Long registerUser(User user);
	
	//Get a single user
	User getUser(Long id);
	
	//List all users
	List<User> listUser();
	
	 //Update the user
    void updateUser(Long id, User user);
    
    //Delete a user
    void deleteUser(Long id);
    
    //Login as a user
    String login(String userName, String password);
    
}
