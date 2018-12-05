/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilerminipascal;

/**
 * 
 * @author Rafael Gonçalves <rafa.engci at gmail.com>
 */
public class Scanner {
    
    private char currentChar;
    private StringBuffer currentSpelling;
    private boolean eotFlag;

    public Scanner(char currentChar) {
        this.currentChar = currentChar;
        this.eotFlag = false;
        currentSpelling = new StringBuffer("");
    }
    

}
