public class Rock extends Element{

	public Rock(){
		super("Rock");
	}

	@Override
	public String compareTo(Element e){
		String results = "";
		Outcome temp = new Outcome(this.getName(), e.getName());
		results += (temp.getString1() + temp.getString2());
		return results;
	}
}