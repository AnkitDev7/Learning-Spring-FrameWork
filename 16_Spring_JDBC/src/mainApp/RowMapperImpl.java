package mainApp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowCount) throws SQLException {
        Employee employee = new Employee();
        employee.seteId(rs.getInt("eId"));
        employee.seteName(rs.getString("eName"));
        employee.seteAddress(rs.getString("eAddress"));
        employee.seteSalary(rs.getInt("eSalary"));

        System.out.println("ROW MAPPED :- " +(rowCount+1));

        return employee;
    }
}
