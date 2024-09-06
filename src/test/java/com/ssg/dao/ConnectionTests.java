package com.ssg.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectionTests {

    @Test      //테스트 코드(메소드)를 테스트할때 사용하는 어노테이션  public 이어야 한다.  파라미터, 리턴도 없이 작성한다.
      public void test1(){
        int v1 = 10;
        int v2 = 10;
        Assertions.assertEquals(v1, v2);
    }

    @Test   //자바코드를 이용해서 설치된 mysql driver와 DB의 연결을 확인하는 테스트 코드
    public void testConnection() throws Exception{

          Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssg?serverTimezone=UTC","root","seungjoon0324^^");

        Assertions.assertNotNull(connection);
        connection.close();

    }

}
