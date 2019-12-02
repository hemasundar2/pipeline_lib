import groovy.sql.Sql

import java.sql.*

def call(String user, String password, String database){
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
     
          vsql = Sql.newInstance("jdbc:sqlserver://hrsabmssql1dev.nih.gov", user,password, "com.microsoft.sqlserver.jdbc.SQLServerDriver")
    echo 'Hello World 2'
          vsql.execute("create database $database")
          vsql.close()  

}

