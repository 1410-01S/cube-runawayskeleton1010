package com.example.project;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cube {
	public String [][] cube ={

		{"r","r","r",
		"r","r","r",
		"r","r","r"},

		{"b","b","b",
		"b","b","b",
		"b","b","b"},

		{"o","o","o",
		"o","o","o",
		"o","o","o"},

		{"g","g","g",
		"g","g","g",
		"g","g","g"},

		{"y","y","y",
		"y","y","y",
		"y","y","y"},

		{"w","w","w",
		"w","w","w",
		"w","w","w"}};

	class edgeFace{
	  public int face;
	  int[] edge1 = new int[4];
	  int[] edge2 = new int[4];
	  int[] edge3 = new int[4];
	  int[] edge4 = new int[4];

	  public edgeFace(int current_face){
		current_face = face;
	    switch (face){
			case 0: 
			edge1[0] = 1;
			edge1[1] = 2;
			edge1[2] = 5;
			edge1[3] = 8;

			edge2[0] = 4;
			edge2[1] = 2;
			edge2[2] = 5;
			edge2[3] = 8;

			edge3[0] = 3;
			edge3[1] = 0;
			edge3[2] = 3;
			edge3[3] = 6;

			edge4[0] = 5;
			edge4[1] = 2;
			edge4[2] = 5;
			edge4[3] = 8;
			  break;

			case 1:
			  break;
			case 2:
			  break;
			case 3:
			  break;
			case 4:
			  break;
			case 5:
			  break;

		}
	  }
	}
	public void turnFace(int index, String direction){
		edgedFace eFace = new edgedFace(index);
		String [][] copy = new String[6][9];
		for (int i = 0; i<6; i++){
			for (int j; j < 9; j++){
				copy[i][j] = cube[i][j];
			}
		}
		switch (direction){
			case "c":
			cube[eFace.current_face][0] = copy[Eface.curent_face][6];
			cube[eFace.current_face][1] = copy[Eface.curent_face][3];
			cube[eFace.current_face][2] = copy[Eface.curent_face][0];
			cube[eFace.current_face][3] = copy[Eface.curent_face][7];
			cube[eFace.current_face][5] = copy[Eface.curent_face][1];
			cube[eFace.current_face][6] = copy[Eface.curent_face][8];
			cube[eFace.current_face][7] = copy[Eface.curent_face][5];
			cube[eFace.current_face][8] = copy[Eface.curent_face][2];

			cube[eFace.edge1[0]][eFace.edge1[1]] = copy[eFace.edge4[0]][eFace.edge4[1]];
			cube[eFace.edge1[0]][eFace.edge1[1]] = copy[eFace.edge4[0]][eFace.edge4[2]];
			cube[eFace.edge1[0]][eFace.edge1[1]] = copy[eFace.edge4[0]][eFace.edge4[3]];

			cube[eFace.edge1[0]][eFace.edge2[1]] = copy[eFace.edge1[0]][eFace.edge1[1]];
			cube[eFace.edge1[0]][eFace.edge2[1]] = copy[eFace.edge1[0]][eFace.edge1[2]];
			cube[eFace.edge1[0]][eFace.edge2[1]] = copy[eFace.edge1[0]][eFace.edge1[3]];

			cube[eFace.edge1[0]][eFace.edge3[1]] = copy[eFace.edge2[0]][eFace.edge2[1]];
			cube[eFace.edge1[0]][eFace.edge3[1]] = copy[eFace.edge2[0]][eFace.edge2[2]];
			cube[eFace.edge1[0]][eFace.edge3[1]] = copy[eFace.edge2[0]][eFace.edge2[3]];

			cube[eFace.edge1[0]][eFace.edge4[1]] = copy[eFace.edge3[0]][eFace.edge3[1]];
			cube[eFace.edge1[0]][eFace.edge4[1]] = copy[eFace.edge3[0]][eFace.edge3[2]];
			cube[eFace.edge1[0]][eFace.edge4[1]] = copy[eFace.edge3[0]][eFace.edge3[3]];


			break;
			case "cc":
			break;
		}
	}

	public void ShowCube(){
		int ind = 0;
		for (int i = 0; i < 6; i++){
		   for (int y = 0; y < 3; y++){
			 for (int z = 0; z < 3; z++){
		  System.out.print(cube[i][ind++]);
			}
		System.out.println();
		  }
	  ind = 0;
	  System.out.println();
	  }
	}
	public static void main(final String[] args) {

		Bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		Cube RubiksCube = new Cube();
		RubiksCube.ShowCube();
		throw IOException;
		boolean argsCheck = false;
		int argsRunIndex = 0;
		boolean proceed = true;
		if (args.length > 0){
			argsCheck = true;
		}
		while(proceed){
			String input;
			if(argsCheck){
				input = reader.readLine();
			} else {
				if (argsLengthIndex = args.length){
					argsCheck = false;
					input = "s";
				} else {
					input = args[argsRunIndex];
					argsRunIndex++;
				}
		}
		switch(input){
			case "u":
			RubiksCube.turnFace(Index 4, Direction "c");
			RubiksCube.showCube;
			break;
			case "d":
			RubiksCube.turnFace(Index 6, Direction "c");
			RubiksCube.showCube;
			break;
			case "r":
			RubiksCube.turnFace(Index 0, Direction "c");
			RubiksCube.showCube;
			break;
			case "l":
			RubiksCube.turnFace(Index 3, Direction "c");
			RubiksCube.showCube;
			break;
			case "f":
			RubiksCube.turnFace(Index 2, Direction "c");
			RubiksCube.showCube;
			break;
			case "b":
			RubiksCube.turnFace(Index 1, Direction "c");
			RubiksCube.showCube;
			break;
			case "u'":
			RubiksCube.turnFace(Index 4, Direction "cc");
			RubiksCube.showCube;
			break;
			case "d'":
			RubiksCube.turnFace(Index 6, Direction "cc");
			RubiksCube.showCube;
			break;
			case "r'":
			RubiksCube.turnFace(index 0, direction "cc");
			RubiksCube.showCube;
			break;
			case "l'":
			RubiksCube.turnFace(Index 3, Direction "cc");
			RubiksCube.showCube;
			break;
			case "f'":
			RubiksCube.turnFace(Index 2, Direction "cc");
			RubiksCube.showCube;
			break;
			case "b'":
			RubiksCube.turnFace(Index 1, Direction "cc");
			RubiksCube.showCube;
			break;
			case "s":
			break;
			case "q":
			proceed = false;
			break;
		}
	}
  }
}