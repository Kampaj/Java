package test.factory.enumProvider;

import factory.enumProvider.DAOFactoryProvider;
import factory.enums.FactoryEnum;
import factory.implementations.CSVFactory;
import factory.implementations.DBFactory;
import factory.implementations.WSFactory;
import factory.implementations.XMLFactory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DAOFactoryProviderTest {
    @Test
    public void setSourceOfDataCSV() {
        DAOFactoryProvider.INSTANCE.setSourceOfData(FactoryEnum.CSV);
        assertTrue(DAOFactoryProvider.INSTANCE.getService() instanceof CSVFactory);
    }

    @Test
    public void setSourceOfDataDB() {
        DAOFactoryProvider.INSTANCE.setSourceOfData(FactoryEnum.DBF);
        assertTrue(DAOFactoryProvider.INSTANCE.getService() instanceof DBFactory);
    }

    @Test
    public void setSourceOfDataXML() {
        DAOFactoryProvider.INSTANCE.setSourceOfData(FactoryEnum.XML);
        assertTrue(DAOFactoryProvider.INSTANCE.getService() instanceof XMLFactory);
    }

    @Test
    public void setSourceOfDataWS() {
        DAOFactoryProvider.INSTANCE.setSourceOfData(FactoryEnum.WSF);
        assertTrue(DAOFactoryProvider.INSTANCE.getService() instanceof WSFactory);
    }
}
