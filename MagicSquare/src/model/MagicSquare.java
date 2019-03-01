package model;

import CustomizedException.OddNumberException;

/* This class is corresponding to generate the MagicSquare
 * @Author: Juan Hernandez
  	@Version: 1.0
 */

public class MagicSquare {
	
	//Atributtes
	
	
	//Relations
/* This is the constructor method and with than you can create a new Object
 * 
 */
	public MagicSquare() {
	}
	
	//Get and setter
	
	//Methods
	/*This is the method to initializeSquare and draw
	 * @param: int size, String ubication, String direction
	 * @return: magicSquare int[][]
	 */
	
	public int[][] initSquare(int size, String ubication, String direction) throws OddNumberException , NullPointerException{
		
		if(size%2 == 0) {
			throw new OddNumberException ("Please enter a odd number");
		}else {
			
        int[][] magicSquare = new int[size][size];
		
		int row= size;
		int column= size;
		
		
		if(direction.equalsIgnoreCase("Up")) {
			
		
			row= 0;
			column= size/2;
			
			if(ubication.equalsIgnoreCase("NO")) {
				for(int num = 1; num <= size*size;) {
					if(row== -1 && column== -1) {
						column= 0;
						row= 1;
					}else {
						if(column== -1) {
							column= size-1;
						}
						if(row== -1) {
							row= size-1;
						}
					}
					if(magicSquare[row][column] != 0) {
						column+=1;
						row+= 2;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column--; 
						row--;
					}
				}
			}else if(ubication.equalsIgnoreCase("NE")) {
				for(int num = 1; num <= size*size;) {
					if(row== -1 && column== size) {
						column= size-1;
						row= 1;
					}else {
						if(column== size) {
							column= 0;
						}
						if(row== -1) {
							row= size-1;
						}
					}
					if(magicSquare[row][column] != 0) {
						column--;
						row+= 2;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column++; 
						row--;
					}
				}
			}
			
		}else if(direction.equalsIgnoreCase("RIGHT")) {
			row= size/2;
			column= size-1;
			
			if(ubication.equalsIgnoreCase("NE")) {
				for(int num = 1; num <= size*size;) {
					if(row== -1 && column== size) {
						column= size-2;
						row= 0;
					}else {
						if(column== size) {
							column= 0;
						}
						if(row< 0) {
							row= size-1;
						}
					}
					if(magicSquare[row][column] != 0) {
						column-= 2;
						row++;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column++; 
						row--;
					}
				}
			}else if(ubication.equalsIgnoreCase("SE")) {
				for(int num = 1; num <= size*size;) {
					if(row> size-1 && column> size-1) {
						column= size-2;
						row= size-1;
					}else {
						if(column== size) {
							column= 0;
						}
						if(row== size) {
							row= 0;
						}
					}
					if(magicSquare[row][column] != 0) {
						column-= 2;
						row--;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column++; 
						row++;
					}
				}
			}
		}else if(direction.equalsIgnoreCase("LEFT")) {
			 row= size/2;
			 column= 0;
			 if(ubication.equalsIgnoreCase("SO")) {
					for(int num = 1; num <= size*size;) {
						if(row> size-1 && column== -1) {
							column= 1;
							row= size-1;
						}else {
							if(column== -1) {
								column= size-1;
							}
							if(row== size) {
								row= 0;
							}
						}
						if(magicSquare[row][column] != 0) {
							column+= 2;
							row--;
							continue;
						}else {
							magicSquare[row][column] = num++;
							column--; 
							row++;
						}
					}
				}else if(ubication.equalsIgnoreCase("NO")) {
					for(int num = 1; num <= size*size;) {
						if(row== -1 && column== -1) {
							column= 1;
							row= 0;
						}else {
							if(column== -1) {
								column= size-1;
							}
							if(row== -1) {
								row= size-1;
							}
						}
						if(magicSquare[row][column] != 0) {
							column+= 2;
							row++;
							continue;
						}else {
							magicSquare[row][column] = num++;
							column--; 
							row--;
						}
					}
				}
			 }else if(direction.equalsIgnoreCase("DOWN")) {
				 row= size-1;
				 column= size/2;
				 if(ubication.equalsIgnoreCase("SE")) {
						for(int num = 1; num <= size*size;) {
							if(row> size-1 && column> size-1) {
								column= size-1;
								row= size-2;
							}else {
								if(column== size) {
									column= 0;
								}
								if(row== size) {
									row= 0;
								}
							}
							if(magicSquare[row][column] != 0) {
								column--;
								row-= 2;
								continue;
							}else {
								magicSquare[row][column] = num++;
								column++; 
								row++;
							}
						}
				 }else if(ubication.equalsIgnoreCase("SO")) {
						for(int num = 1; num <= size*size;) {
							if(row> size-1 && column== -1) {
								column= 0;
								row= size-2;
							}else {
								if(column== -1) {
									column= size-1;
								}
								if(row== size) {
									row= 0;
								}
							}
							if(magicSquare[row][column] != 0) {
								column++;
								row-= 2;
								continue;
							}else {
								magicSquare[row][column] = num++;
								column--; 
								row++;
							}
						}
				 }
				 
			}
	   return magicSquare;
	}
	}

	
	
	
}
