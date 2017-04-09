package basic;

/*TAGS: Hash Table*/

/**
 * You are given a map in form of a two-dimensional integer 
 * grid where 1 represents land and 0 represents water. 
 * Grid cells are connected horizontally/vertically (not diagonally).
 *  The grid is completely surrounded by water, and there is 
 *  exactly one island (i.e., one or more connected land cells). 
 *  The island doesn't have "lakes" (water inside that 
 *  isn't connected to the water around the island). 
 *  One cell is a square with side length 1. The grid is rectangular,
 *   width and height don't exceed 100. Determine the perimeter of the island.
 * @author jaemin
 *
 */
public class E12IslandPremeter {

	public static int islandPerimeter(int[][] grid) {
		int rowLength = grid[0].length;
		int colLength = grid.length;
		
		int perimeter = 0;
		for(int i=0; i<colLength; i++) {
			for(int j=0; j<rowLength; j++) {
				if(grid[i][j] == 1) {
					perimeter += 4;
					if(i-1>=0) {
						if(grid[i-1][j]==1) {
							perimeter--;
						}
					}
					
					if(j-1>=0) {
						if(grid[i][j-1]==1) {
							perimeter--;
						}
					}
					
					if(i+1<colLength) {
						if(grid[i+1][j]==1) {
							perimeter--;		
						}
					}
					
					if(j+1<rowLength) {
						if(grid[i][j+1]==1) {
							perimeter--;
						}
					}
				}
			}
		}
        return perimeter;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0},
		                {1,1,1,0},
		                {0,1,0,0},
		                {1,1,0,0}};
		System.out.println("perimeter: "+islandPerimeter(grid));
	}

}

/*Sometimes, Brute Force Works*/

