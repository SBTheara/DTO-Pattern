package com.modelmappingdto.modelmappingdto;

import com.modelmappingdto.modelmappingdto.model.Location;
import com.modelmappingdto.modelmappingdto.model.User;
import com.modelmappingdto.modelmappingdto.repository.LocationRepository;
import com.modelmappingdto.modelmappingdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelMappingDtoApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ModelMappingDtoApplication.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public void run(String... args) throws Exception {

        Location location = new Location();
        location.setPlace("Phnom penh");
        location.setDescription("Phnom penh is the capital city of cambodia");
        location.setLongitude(230.30);
        location.setLatitute(303.73);
        locationRepository.save(location);

        User user = new User();
        user.setFirstName("Sambath");
        user.setLastName("Theara");
        user.setEmail("Thearaholishit@gmail.com");
        user.setPassword("234");
        user.setLocation(location);
        userRepository.save(user);

        User user1 = new User();
        user1.setFirstName("Piseth");
        user1.setLastName("Youn");
        user1.setEmail("Pisethholishit@gmail.com");
        user1.setPassword("2356");
        user1.setLocation(location);
        userRepository.save(user1);

    }
}
