package dao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;
import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
    public TreeMap<String,Integer> skillCount() throws ClassNotFoundException, SQLException, IOException{
	TreeMap<String,Integer> skillmap = new TreeMap<String,Integer>();
	ConnectionManager cm  = new ConnectionManager();
	
//	String sql = "SELECT name,id FROM skill11 ";
//	String sql1 = "select count(skill_id) from player11 group by skill_id";
	String sql = "select skill11.name,player11.skill_id from player11 full outer join skill11 on player11.skill_id = skill11.id";
	Statement st = cm.getConnection().createStatement();
	ResultSet rs = st.executeQuery(sql);
//	ResultSet rs1 = st.executeQuery(sql1);
	Skill skill = null ;
	int count;
	while(rs.next() ) {
	   skill = new Skill();
	   skill.setSkillName(rs.getString(1));
	   skill.setSkillId(rs.getInt(2));
	   count = (int) skill.getSkillId();
//	  System.out.println( count = rs.getInt(2));
//	   System.out.println(skill.getSkillName());
	   skillmap.put(skill.getSkillName(), count);
	}
	return skillmap;
    }
}
