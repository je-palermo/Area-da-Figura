package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Circle;
import entites.Rectangle;
import entites.Shape;
import entites.enuns.Color;

public class Program {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			System.out.print("Shape #" + i + " data ");
			
			System.out.print("Rectamgule or Circle (r/n)? ");
			char tipoFigura = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED) ");
			Color color = Color.valueOf(sc.next());
			
			if (tipoFigura == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				
				list.add(new Rectangle(color, width, heigth));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println();
		System.out.println("Shape Areas: ");
		
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		
		sc.close();

	}

}
