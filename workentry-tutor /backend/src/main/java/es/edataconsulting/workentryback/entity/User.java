package es.edataconsulting.workentryback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue
    private int user_id;

    @Column(nullable = false, length = 45)
    private String username;

    @OneToMany(mappedBy = "user")
    private Set<Credentials> credentials = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Worklog> worklogs = new HashSet<>();


    public int getId() {
        return user_id;
    }

    public void setId(int id_user) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
