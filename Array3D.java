/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3d;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Array3D {
    Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][][] array;
					int length1, length2, length3;
					String result;
					
					System.out.print("length 1: ");
					length1 = input.nextInt();
					
					System.out.print("length 2: ");
					length2 = input.nextInt();
					
					System.out.print("length 3: ");
					length3 = input.nextInt();
					
					array = new int[length1][length2][length3];
					
					for (int i = 0; i < length1; i++) {
						for (int j = 0; j < length2; j++) {
							for (int k = 0; k < length3; k++) {
								System.out.printf("Index [%o][%o][%o]: ", i, j, k);
								array[i][j][k] = input.nextInt();
                                                        }
                                                }
                                        }
					
    }}