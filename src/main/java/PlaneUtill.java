import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlaneUtill {

    public PlaneUtill() {
    }
    public static void createTable() {

        String createSql = "CREATE TABLE Plane (" +
                "WEEK_DAYS VARCHAR(255), " +
                "CLOCK INTEGER NOT NULL,";

        try {
            JDBCUtill.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Plane plane) {

        String insertSql = "INSERT INTO STUDENTS(WEEK_DAYS, CLOCK) VALUES(" +
                "'" + plane.getWeekDays() + "', " +
                "'" + plane.getClock() + "', ";


        try {
            JDBCUtill.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Plane> getAllPlane() {

        String selectSql = "SELECT * FROM PLANE";

        List<Plane> planes = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtill.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                planes.add(new Plane(
                        resultSet.getString("WEEK_DAYS"),
                        resultSet.getDouble("CLOCK")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return planes;

    }

}
