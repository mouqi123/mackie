package com.mackie.util.typeHandler;

import java.sql.Connection;
import org.apache.ibatis.type.MappedTypes;

/**
 * Map PostgreSQL array of longs(int8) to java Long[] array.
 */
@MappedTypes(Long[].class)
public class ArrayLongTypeHandler extends ArrayTypeHandler<Long[]> {

    @Override
    protected String getDbTypeName(Connection connection) {
        // Now support only PostgreSQL types
        return "bigint";
    }
}
