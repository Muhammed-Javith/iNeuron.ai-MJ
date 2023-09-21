package mjavith.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import mjavith.ineuron.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
