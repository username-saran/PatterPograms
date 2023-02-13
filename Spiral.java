package com.prc;

import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c= sc.nextInt();
		int[][] mat = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		int k=0,l=0;
		while(k<r && l<c)
		{
			for(int i=l;i<c;i++) {
				System.out.print(mat[k][i]+" ");
			}
			k++;
			
			for(int i=k;i<r;i++) {
				System.out.print(mat[i][c-1]+" ");
			}
			c--;
			
			if(k < r) {
				for(int i=c-1;i>=0;--i) {
					System.out.print(mat[r-1][i]+" ");
				}
				r=r-1;
			}
			
			if(l < c) {
				for(int i=r-1;i>=k;i--) {
					System.out.print(mat[i][l]+" ");
				}
				l++;
			}
		}
	}
}
