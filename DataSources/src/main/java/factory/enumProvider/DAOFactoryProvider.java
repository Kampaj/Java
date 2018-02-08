package factory.enumProvider;

import factory.enums.FactoryEnum;
import factory.implementations.CSVFactory;
import factory.implementations.DBFactory;
import factory.implementations.WSFactory;
import factory.implementations.XMLFactory;
import factory.interfc.Factory;

import java.util.HashMap;
import java.util.Map;


public enum DAOFactoryProvider {
    INSTANCE;

    private Factory factory;

    private static final Map<FactoryEnum, Factory> factoryEnumToFactoryMap;

    static {
        factoryEnumToFactoryMap = new HashMap<FactoryEnum, Factory>();
        factoryEnumToFactoryMap.put(FactoryEnum.XML, new XMLFactory());
        factoryEnumToFactoryMap.put(FactoryEnum.CSV, new CSVFactory());
        factoryEnumToFactoryMap.put(FactoryEnum.DBF, new DBFactory());
        factoryEnumToFactoryMap.put(FactoryEnum.WSF, new WSFactory());
    }

    public void setSourceOfData(FactoryEnum factoryEnum) {
        factory = factoryEnumToFactoryMap.get(factoryEnum);
    }

    public Factory getService() {
        return factory;
    }
}
