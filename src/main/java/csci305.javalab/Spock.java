package csci305.javalab;
public class Spock extends Element{

	public Spock(String name){
		super(name);
	}

	@Override
	public String compareTo(Element e){
		String results = "";
		Outcome temp = new Outcome(this.getName(), e.getName());
		results += (temp.getString1() + " -- " + temp.getString2());
		return results;
	}
}