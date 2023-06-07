package array.modelchild;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy

	private double [] weight;

	public Child(int age, boolean boy) {
		this.age = age;
		this.boy = boy;
		this.weight = new double[]{4.2, 9.3, 12.4, 17.5, 23.2, 25.3, 28.6, 30.4, 33.9, 35.1, 37.3};
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	//Opgave 4.A
	public double getWeight(int age){
		return weight[age];
	}

	// 4.B
	public double getIncrease(){
		double increase = 0.0;

		for (int i = 0; i < weight.length-1; i++) {
			double samlining = weight[i + 1] - weight[i];
			if (samlining > increase){
				increase = samlining;
			}
		}
		return increase;
	}


}
