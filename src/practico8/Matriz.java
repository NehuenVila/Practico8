/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico8;

/**
 *
 * @author Nehuen
 */
public class Matriz {
    
    
    public void armar(){
        
        int [][] mat = {{3,6,9,12}, {15, 18, 21}, {24,27,30,33, 36}, {39,42}};

        
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                //System.out.print(mat[f][c]+" ");
                if(mat[f][c] % 2 == 0){
                    System.out.print(" fila " + f + " --> " + mat[f][c]);
                }
                }
            System.out.println();
        }
    }
    
}
