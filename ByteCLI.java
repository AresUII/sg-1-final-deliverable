/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem;
/*
 * This exists mainly for testing reasons.
 */
public class ByteCLI{
    private static void printOneByte(byte n){System.out.print((char)(n&0xff));}
    public static void printBytes(byte[] a){
        for(int i=0;i<a.length;i++){printOneByte(a[i]);}
    }
}
