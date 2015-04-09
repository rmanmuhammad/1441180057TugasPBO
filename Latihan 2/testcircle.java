class testcircle{
public static void main(String[] args) {
		circle arif = new circle();
		circle mirtha = new circle(30);
		circle dhyla = new circle(70, "Doreng");

		arif.setColor("Pinkkkyy");

		System.out.println("Arif : Radius = "+ arif.getRadius() +" Color = "+arif.getColor()+" Luas = "+arif.getArea());
		System.out.println("Mirtha : Radius = "+ mirtha.getRadius() +" Color = "+mirtha.getColor()+" Luas = "+mirtha.getArea());
		System.out.println("Dhyla : Radius = "+ dhyla.getRadius() +" Color = "+dhyla.getColor()+" Luas = "+dhyla.getArea());
	}
}	
