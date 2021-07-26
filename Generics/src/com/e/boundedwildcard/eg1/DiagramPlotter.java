package com.e.boundedwildcard.eg1;

import java.util.List;
//Upper bound wildcard example
public class DiagramPlotter {

	public void plotDiagrams(List<? extends MyDrawings> drawings) {
		for (MyDrawings myDrawing : drawings) {
			myDrawing.draw();
		}
	}
}
