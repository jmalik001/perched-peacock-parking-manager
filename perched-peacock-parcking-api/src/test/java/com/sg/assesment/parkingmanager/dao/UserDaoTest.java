package com.sg.assesment.parkingmanager.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sg.assesment.parkingmanager.model.User;
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserDaoTest {

	@Autowired
	UserRepository userDao;
	
	@Test
	public void whenCalledSave_thenCheckNumberOfUsers() {
		userDao.save(new User("Jagabandhu","Malik", "7411520670","KA53EL2157","Bike","60KG","jagaPark","password") );
	List<User> users = userDao.findAll();
	Assertions.assertThat(users.size() == 1);
	}

}
