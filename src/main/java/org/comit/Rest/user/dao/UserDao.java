package org.comit.Rest.user.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.comit.Rest.user.bean.UserBean;
import org.springframework.stereotype.Component;

@Component //Spring will detect custom beans automatically
public class UserDao {
	
	public static int usersCount = 5;
	
	private static List<UserBean>users = new ArrayList<>();
	
	static {
		users.add(new UserBean(1,"Jas",new Date()));
		users.add(new UserBean(2,"Tarun",new Date()));
		users.add(new UserBean(3,"Sakthi",new Date()));
		users.add(new UserBean(4,"Sara",new Date()));
		users.add(new UserBean(5,"Srisha",new Date()));
	}
	
	public List<UserBean> findAll(){
		return users;
	}
	
	public UserBean save(UserBean user){
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
		
	}
	
	public UserBean findOne(int id) {
		for(UserBean temp:users) {
			if(temp.getId()==id)
				return temp;
		}
		return null;
	}
	

}
