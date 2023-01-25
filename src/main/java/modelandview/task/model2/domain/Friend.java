package modelandview.task.model2.domain;

public class Friend {
	private long id;
	
	private String Name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	@Override
	public String toString() {
		return "Friend [Name=" + Name + "]";
	}
	
	
}

