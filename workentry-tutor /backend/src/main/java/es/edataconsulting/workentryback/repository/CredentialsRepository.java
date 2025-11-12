package es.edataconsulting.workentryback.repository;

import es.edataconsulting.workentryback.entity.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends JpaRepository<Credentials, Long> {

}
