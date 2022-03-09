package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mariadb://localhost:3306";
            //creo oggetto connessione passandogli i vari parametri
            try ( //indico porta e nome del database
                    Connection connection = DriverManager.getConnection(url, "tss", "root")) {
                //creo oggetto connessione passandogli i vari parametri
                System.out.println("connessione ok..");
                connection.setCatalog("DBScuola");
                //al oggetto connessione setto il nome del databse

                Statement cmd = connection.createStatement(); // creo la connessione restituendo un oggetto di tipo statement
                //ovvero il risultato del contenuto della mia tabella sul databse
                try (ResultSet rs = cmd.executeQuery("select * from t_corsi") // setto la query e specifico il comando di tipo sql,ritorna un oggetto di tipo resultset
                        ) {
                    //ovvero il risultato del contenuto della mia tabella sul databse
                    while (rs.next()) { // metodo next leggo riga per riga ,quando è falso esce.
                        System.out.println(rs.getString("titolo_corso"));
                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("errore..." + ex);
        }
    }

}
