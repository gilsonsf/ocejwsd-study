package ch02;

import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NordicSkier")
public class Skier {
	
	private Person person;
	private String national_team;
	private Collection major_achievements;
	
	public Skier() {}
	
	public Skier(Person person, String national_team, Collection major_achievements) {
		super();
		setPerson(person);
		setNational_team(national_team);
		setMajor_achievements(major_achievements);
	}

	//properties
	public String getNational_team() {
		return national_team;
	}

	public void setNational_team(String national_team) {
		this.national_team = national_team;
	}

	public Collection getMajor_achievements() {
		return major_achievements;
	}

	public void setMajor_achievements(Collection major_achievements) {
		this.major_achievements = major_achievements;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

	
	
}
