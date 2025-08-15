package dumplings.data;

import org.springframework.data.repository.CrudRepository;

import dumplings.User;
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}