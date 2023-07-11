package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Fun {

            public static void main(String[] args) throws SQLException {
                Connection connection = ConnectionManager.getConnection();
                String sql = "SELECT * FROM city";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    System.out.println(
                            resultSet.getRow() + " "
                                    + resultSet.getString("Name") + " "
                                    + resultSet.getString("CountryCode"));
                }
                resultSet.close();
                connection.close();

                List<String> cities = getCities("ITA");
                cities.forEach(System.out::println);
            }

            public static List<String> getCities(String countryCode) throws SQLException {
                Connection connection = ConnectionManager.getConnection();
                String sql = "SELECT * FROM city WHERE CountryCode = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, countryCode);
                ResultSet resultSet = preparedStatement.executeQuery();
                List<String> result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(resultSet.getString("Name"));
                }
                resultSet.close();
                connection.close();
                return result;
            }
        }



