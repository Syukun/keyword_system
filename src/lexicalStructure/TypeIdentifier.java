package lexicalStructure;

import classes.UnannTypeVariable;

/*
 * TypeIdentifier :
 * 	identifier but not a variable
 */
public class TypeIdentifier extends Identifier implements UnannTypeVariable{

	public TypeIdentifier(String name) {
		super(name);
	}

}
