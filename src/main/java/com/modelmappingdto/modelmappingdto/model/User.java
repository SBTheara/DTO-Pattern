package com.modelmappingdto.modelmappingdto.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.xml.sax.Locator;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "locationId")
    private Location location;
}
