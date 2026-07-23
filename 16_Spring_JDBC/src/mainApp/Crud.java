package mainApp;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class Crud {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(int eId, String eName, String eAddress, int eSalary) {
        String sql = "insert into employee(eId,eName,eAddress,eSalary) values(?,?,?,?)";
        int row = jdbcTemplate.update(sql, eId, eName, eAddress, eSalary);
        System.out.println(row);
    }

    public void update(int eId, String eName) {
        String sql = "update employee set eName=? where eId=?";
        int row = jdbcTemplate.update(sql,eName,eId);
        System.out.println(row);
    }

    public void delete(int eId) {
        String sql = "delete from employee where eId=?";
        int row = jdbcTemplate.update(sql,eId);
        System.out.println(row);
    }

    public void readAll(){
        String sql = "select * from employee";
        List<Map<String, Object>> queryList = jdbcTemplate.queryForList(sql);
        System.out.println(queryList);

        for (Map<String ,Object> map : queryList){
            for (Map.Entry<String,Object> entry :map.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println();
        }
    }

    public void readAllPojoBased(){
        String sql = "select * from employee";
        List<Employee> list = jdbcTemplate.query(sql, new RowMapperImpl());

        for (Employee emp : list){
            System.out.println(emp);
        }
    }

    public void readSingleData(int eId){
        String sql = "select * from employee where eId=?";
        Employee employee = jdbcTemplate.queryForObject(sql, new RowMapperImpl(), eId);

        System.out.println(employee);
    }


}