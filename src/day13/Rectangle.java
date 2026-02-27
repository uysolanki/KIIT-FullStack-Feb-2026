package day13;

public class Rectangle {
	
		private int length,width;

		public Rectangle() {}
		public Rectangle(int length, int width) 
		{
			this.length = length;
			this.width = width;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		
		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + "]";
		}
		
		
		
}
