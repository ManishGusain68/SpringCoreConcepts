package springMVC.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import springMVC.model.User;

public class UserDaoImpl implements Userdao {

	private JdbcTemplate jdbctemplate;
	
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}



	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}



	@Override
	public int update(User user) {
		String query = "insert into user values (?,?,?,?,?)";
		int r=this.jdbctemplate.update(query,user.getUemail(),user.getUname(),user.getPwd(),user.getAddress().getState(),user.getAddress().getCity());
		return r;
	}

}
