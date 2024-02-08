package alessandro.angheben.u5w1d4.dao;

import alessandro.angheben.u5w1d4.abstracts.Elements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementsDAO extends JpaRepository<Elements,Long> {
}
