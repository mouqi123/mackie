package com.mackie.util.typeHandler;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.ibatis.type.MappedTypes;

/**
 * Map PostgreSQL array of boolean to java Boolean[] array.
 */
@MappedTypes(Boolean[].class)
public class ArrayBooleanTypeHandler extends ArrayTypeHandler<Boolean[]> {

    @Override
    protected String getDbTypeName(Connection connection) throws SQLException {
        // Now support only PostgreSQL types
        return "boolean";
    }

}
