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
public class Token {
    
    public byte kind;
    public String spelling;

    public Token(byte kind, String spelling) {
        this.kind = kind;
        this.spelling = spelling;
        
//        if(kind == IDENTIFIER)
//            for(int k = BEGIN; k <= WHILE; k++)
//                if(spelling.equals(spellings[k])){
//                    this.kind = k; break;
//                }
    }
    
    public final static byte
            IDENTIFIER = 0, INTLITERAL = 1, OPERATOR = 2, BEGIN = 3, CONST = 4,
            DO = 5;
    
    
    

}
