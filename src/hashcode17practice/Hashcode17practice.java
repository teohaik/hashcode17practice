/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode17practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author teohaik
 */
public class Hashcode17practice {

  
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader(new File("C:\\Users\\teohaik\\Desktop\\medium.in"));
        Scanner s = new Scanner(fr);
        
        StringTokenizer firstLineTokens = new StringTokenizer(s.nextLine());
        
        int rows = Integer.parseInt(firstLineTokens.nextToken());
        int cols = Integer.parseInt(firstLineTokens.nextToken());
        int L = Integer.parseInt(firstLineTokens.nextToken());
        int H = Integer.parseInt(firstLineTokens.nextToken());

        
        System.out.println(rows+ " "+cols+" "+L+" "+H);
        
        char[][] ingrs = new char[1000][1000];
        
        int row = 0;
        while(s.hasNext()){
           String line = s.nextLine();
           for(int col=0; col<line.length(); col++){
               ingrs[row][col] = line.charAt(col);
           }
            row++;
        }
        char[][] ingredients = new char[rows][cols];
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                ingredients[i][j] = ingrs[i][j];
            }
        }
        printTable(ingredients);
        
        s.close();
    }
    
    private static void printTable(char tab[][]){
        for(int i=0;i<tab.length;i++){
            for(int j=0; j<tab[i].length; j++){
                if(Character.isLetter(tab[i][j])){
                    System.out.print(tab[i][j]+" , ");
                }
            }
            System.out.println("");
        }
    }
}
