
public class Rectangle {
	public Integer length;
	public Integer width;
	public Integer area;
	public Integer perimeter;
	
	
	public Rectangle(Integer length, Integer width, Integer area, Integer perimeter){
	
	}	
	public Integer getLength(){
		return this.length;
	}
	public Integer getWidth(){
		return this.width;
	}
	public Integer getArea(){
		area = (width * length);
		return (this.area);
	}
	public Integer getPerimeter(){
		perimeter = (length * 2) + (width * 2);
		return this.perimeter;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
