package util;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class DbUtilTest {

	@Test
	public void testGetConnection() throws SQLException {
		try (Connection conn = DbUtil.getConnection()) {
			assertEquals(false, conn.isClosed());
		}
	}

}
