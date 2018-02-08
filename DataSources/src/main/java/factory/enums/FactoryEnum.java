package factory.enums;

import factory.implementations.CSVFactory;
import factory.implementations.DBFactory;
import factory.implementations.WSFactory;
import factory.implementations.XMLFactory;
import factory.interfc.Factory;

public enum FactoryEnum {
    XML,
    DBF,
    WSF,
    CSV;
}
