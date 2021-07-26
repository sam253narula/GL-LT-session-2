package com.e.boundedwildcard.eg1;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Polygon> polygons = new ArrayList<Polygon>();
		polygons.add(new Polygon());

		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());
		circles.add(new Circle());

		DiagramPlotter dp = new DiagramPlotter();
		dp.plotDiagrams(polygons);
		dp.plotDiagrams(circles);
	}
}
