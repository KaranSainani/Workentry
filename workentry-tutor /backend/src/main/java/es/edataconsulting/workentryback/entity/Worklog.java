package es.edataconsulting.workentryback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name="Worklog")
public class Worklog {
    @Id
    @GeneratedValue
    private int worklog_id;

    private Date start;

    private Date end;

    @Column(nullable=false, length=255)
    private String description;

    @Column(nullable=false, length=45)
    private String ticket;

    private Date created;

    private Date updated;

    private int user_id;

    private int source_id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "source_id", nullable = false, updatable = false, insertable = false)
    private Source source;

    public int getId() {
        return worklog_id;
    }

    public void setId(int id) {
        this.worklog_id = worklog_id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getId_user() {
        return user_id;
    }

    public void setId_user(int id_user) {
        this.user_id = user_id;
    }

    public int getId_source() {
        return source_id;
    }

    public void setId_source(int id_source) {
        this.source_id = source_id;
    }
}
