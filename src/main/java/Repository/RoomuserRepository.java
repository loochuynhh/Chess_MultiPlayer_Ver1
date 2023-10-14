package Repository;

import Entity.Roomuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomuserRepository extends JpaRepository<Roomuser, String> {
}