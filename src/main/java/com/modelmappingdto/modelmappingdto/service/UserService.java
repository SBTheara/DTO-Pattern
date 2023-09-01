package com.modelmappingdto.modelmappingdto.service;

import com.modelmappingdto.modelmappingdto.dto.UserLocationDTO;
import com.modelmappingdto.modelmappingdto.model.User;
import com.modelmappingdto.modelmappingdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserLocationDTO> getAllUserLocation(){
        return  userRepository.findAll()
                .stream()
                .map(this::convertEntityToUserDTO)
                .collect(Collectors.toList());
    }
    private UserLocationDTO convertEntityToUserDTO(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        return userLocationDTO;
    }
}
