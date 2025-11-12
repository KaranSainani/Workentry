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
@Table(name="Source")
public class Source {
    @Id
    @GeneratedValue
    private int sourceId;

    @Column(nullable=false, length=45)
    private String name;

    @Column(nullable=false, length=45)
    private String link;

    @OneToMany(mappedBy = "source")
    private Set<Credentials> credentials = new HashSet<>();

    @OneToMany(mappedBy = "source")
    private Set<Worklog> worklogs = new HashSet<>();

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<Credentials> getCredentials() {
        return credentials;
    }

    public void setCredentials(Set<Credentials> credentials) {
        this.credentials = credentials;
    }

    public Set<Worklog> getWorklogs() {
        return worklogs;
    }

    public void setWorklogs(Set<Worklog> worklogs) {
        this.worklogs = worklogs;
    }
}
