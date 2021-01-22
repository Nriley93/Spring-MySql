package spring.data;

import org.springframework.data.repository.CrudRepository;

import spring.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
