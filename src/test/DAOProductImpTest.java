package test;

import main.java.model.dao.DAOProductImp;
import main.java.model.dao.IDAOProduct;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DAOProductImpTest {

    @Test
    void getImportList() {
        IDAOProduct dao = new DAOProductImp();
        System.out.println(dao.getImportList());
    }
}