package type;

public class Dims {
	int dim;

	public Dims(int dim) {
		super();
		this.dim = dim;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		/*
		 * using try and catch
		 */
		for(int i = 0 ; i < dim;i++) {
			result.append("[]");
		}
		
		return result.toString();
	}
}
