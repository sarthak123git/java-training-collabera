package hibernate.hibernateMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Question {
 
	@Id
	private int questnTd;
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_id")
	private Answer answer;
	
	public int getQuestnTd() {
		return questnTd;
	}
	public void setQuestnTd(int questnTd) {
		this.questnTd = questnTd;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question(int questnTd, String question, Answer answer) {
		super();
		this.questnTd = questnTd;
		this.question = question;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
