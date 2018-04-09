public class Lizard extends Element{

	public Lizard(){
		super("Lizard");
	}

	@Override
	public String compareTo(Element e){
		String results = "";
		Outcome temp = new Outcome(this.getName(), e.getName());
		results += (temp.getString1() + temp.getString2());
		return results;
	}
}