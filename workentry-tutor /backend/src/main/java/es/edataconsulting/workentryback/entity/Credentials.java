package es.edataconsulting.workentryback.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Blob;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name="Credentials")
public class Credentials {
    @EmbeddedId
    private CredentialId credentialId;
    @Column(nullable=false, length=45)
    private String username;

    @Lob
    @Column(nullable=false)
    private Blob password;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name= "source_id", nullable = false, insertable = false, updatable = false)
    private Source source;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Blob getPassword() {
        return password;
    }

    public void setPassword(Blob password) {
        this.password = password;
    }
}
