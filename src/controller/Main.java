package controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map.Entry;

import dao.SkillDAO;

public class Main{
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	SkillDAO skilldao = new SkillDAO();
	
	System.out.println("Skill  \t\t  Players");
	 for (Entry<String, Integer> entry : skilldao.skillCount().entrySet()) 
 		System.out.println(entry.getKey() + "\t\t" + entry.getValue());  
	}
	
    }
