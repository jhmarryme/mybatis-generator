package com.fengwenyi.code_generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.fengwenyi.code_generator.util.CommonUtils;

/**
 * Oracle 数据库代码生成类
 * @author Erwin Feng[xfsy_2015@163.com]
 * @since 2019-04-17 10:33
 */
public class OracleCodeGenerator {

    public static void main(String[] args) {
        DbType dbType = DbType.ORACLE;
        String dbUrl = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=x.x.x.x)(PORT=xxxx))(CONNECT_DATA=(SERVICE_NAME=xxxx)))";
        String username = "xxxx";
        String password = "xxxx";
        String driver = "oracle.jdbc.OracleDriver";
        // 表前缀，生成的实体类，不含前缀
        String [] tablePrefixes = {};
        // 表名，为空，生成所有的表
        String [] tableNames = {"xxx", "xxx"};
        // 字段前缀
        String [] fieldPrefixes = {};
        // 排除的表名
        String [] excludeTableNames = {};
        // 基础包名
        String packageName = "com.jhmarryme";
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes, excludeTableNames);
    }

}
