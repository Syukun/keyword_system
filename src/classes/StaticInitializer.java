package classes;

/*
 * StaticInitializer:
 * 		static Block
 */
public class StaticInitializer extends ClassBodyDeclaration{

	Block block;

	public StaticInitializer(Block block) {
		super();
		this.block = block;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "static " + block.toString();
	}
	

}
