
import javax.swing.JButton;

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
        GUI gui = new GUI();
        gui.setVisible(true);
    }
    
    private String currentPlayer = "spieler1";
    private Spieler spieler1 = new Spieler("X",0);
    private Spieler spieler2 = new Spieler("O",1);
    private Spielfeld spielfeld;
    
    
    public String ermittleGewinner(String[][] arr){ //gewinner überprüfen
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
        
        if(
            arr[1][1].isEmpty()||
            arr[1][2].isEmpty()||
            arr[1][3].isEmpty()||
            arr[2][1].isEmpty()||
            arr[2][2].isEmpty()||
            arr[2][3].isEmpty()||
            arr[3][1].isEmpty()||
            arr[3][2].isEmpty()||
            arr[3][3].isEmpty()
        ){
        }else{
                return "unentschieden";
        }
        return "none";
    }
    public boolean checkEmpty(String str){  //ueberpruefen ob der button leer ist
        if("".equals(str)){
            return true;
        }
        return false;
    }
    
    public void setzeIcon(GUI gui, boolean isEmpty,JButton btn){
        if(isEmpty==true){
            //Spieler("spieler1").
            btn.setText(""); //im button das spieler icon setzen
            this.setCurrentPlayer(this.currentPlayer.equals("spieler1") ? "spieler2" : "spieler1"); //spieler wechseln
        }else{
            gui.displayMessage("Dieses Feld ist bereits besetzt");
        }
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
