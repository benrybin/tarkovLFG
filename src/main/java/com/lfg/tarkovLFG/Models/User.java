package com.lfg.tarkovLFG.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String pw;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private UserProfile userProfile;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private Set<Post> posts = new HashSet<>();

}
