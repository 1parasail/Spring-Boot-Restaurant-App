package dumplings.data;

import dumplings.Dumpling;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DumplingRepository extends JpaRepository<Dumpling, Long> {
}
