/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sveno
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public String ermittleGewinner(String[][] arr){
        //int arr[][];
        for(int i=0;i==3;i++){            
            if(arr[i][1].equals(arr[i][2])&&arr[i][1].equals(arr[i][3])){
                return arr[i][1];
            }
        }
        for(int i=0;i==3;i++){            
            if(arr[1][i].equals(arr[2][i])&&arr[1][i].equals(arr[1][i])){
                return arr[1][i];
            }
        }
        if(arr[1][1].equals(arr[2][2])&&arr[1][1].equals(arr[3][3])){
            return arr[1][1];
        }
        if(arr[1][3].equals(arr[2][2])&&arr[1][3].equals(arr[3][1])){
            return arr[1][3];
        }
        return "none";
    }
    public boolean checkEmpty(String str){
        if("".equals(str)){
            return true;
        }
        return false;
    }
    public void wechselSpieler(){
    } 
    public int setzeIcon(GUI gui){
        return 1;
    }

}
