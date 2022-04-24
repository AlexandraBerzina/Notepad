package by.epam.tr.main;

public class NoteInNotepad {
	public String name_;
	
	
	public NoteInNotepad (String name) {
		name_ = name;
		
	}


	public String getName_() {
		return name_;
	}


	public void setName_(String name_) {
		this.name_ = name_;
	}


	@Override
	public String toString() {
		return "NoteInNotepad [name_=" + name_ + "]";
	}
}