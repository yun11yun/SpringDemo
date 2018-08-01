package com.yun11yun.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yun11yun.util.SpringUtils;
import org.junit.Test;

import javax.sql.DataSource;
import javax.swing.*;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class PhoneDaoTest {

    @Test
    public void save() throws SQLException {
        DataSource dataSource = (ComboPooledDataSource) SpringUtils.getBean("comboPooledDataSource");
        assertNotNull(dataSource);
    }
}