package es.edataconsulting.workentryback.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class CredentialId implements Serializable {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "source_id")
    private Long sourceId;
}
