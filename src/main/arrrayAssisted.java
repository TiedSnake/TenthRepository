/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class arrrayAssisted
{
    public static void main(String[] args)
    {
        //Single-dimensional array
        int a[]={10,20,30,40,50};
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Elements of array a: "+a[i]);
        }
        //multidimensional array
        int[][] b = {{2, 4, 6, 8},
                {3, 6, 9}};
        System.out.println("\nLength of row1: " +b[0].length);
    }
}
