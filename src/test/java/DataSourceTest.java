import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import shayne.config.SpringCofiguration;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringCofiguration.class})
public class DataSourceTest {

    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://10.64.22.200:3306/hesui");
        dataSource.setUser("uiadmin");
        dataSource.setPassword("uiadmin");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
