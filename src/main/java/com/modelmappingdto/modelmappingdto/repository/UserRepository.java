package com.modelmappingdto.modelmappingdto.repository;

import com.modelmappingdto.modelmappingdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
