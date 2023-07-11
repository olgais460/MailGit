package Connection;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
        public static final String sqlHost;
        public static final int sqlPort;
        public static final String username;
        public static final String password;
        public static final String dbName;
        public static final String jdbcUrl;

        static {
            try (InputStream inputStream = Config.class.getClassLoader().getResourceAsStream("sql_creds.properties")) {
                Properties properties = new Properties();
                properties.load(inputStream);
                sqlHost = properties.getProperty("sql.host");
                sqlPort = Integer.parseInt(properties.getProperty("sql.port"));
                username = properties.getProperty("sql.username");
                password = properties.getProperty("sql.password");
                dbName = properties.getProperty("sql.database");
                jdbcUrl = String.format("jdbc:mysql://%s:%d/%s", sqlHost, sqlPort, dbName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


