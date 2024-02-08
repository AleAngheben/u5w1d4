package alessandro.angheben.u5w1d4.dao;

import alessandro.angheben.u5w1d4.abstracts.Elements;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ElementsService {

    @Autowired
   private ElementsDAO elementsDAO;

    public void save(Elements ele){

        elementsDAO.save(ele);
       log.info(ele.getName() + " salvato con successo !");

    }

}
