
package model;
public class Skill{
    private long skillId;
    private String skillName;
    
//    public Skill(long skillId,String skillName ){
//	this.skillId =  skillId;
//	this.skillName = skillName;
//    }
    public long getSkillId() {
	return skillId;
    }
    public void setSkillId(long skillId) {
	this.skillId = skillId;
    }
    public String getSkillName() {
	return skillName;
    }
    public void setSkillName(String skillName) {
	this.skillName = skillName;
    }
}