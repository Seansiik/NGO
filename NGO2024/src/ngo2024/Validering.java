/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Tyson
 */
public class Validering {
    
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author Tyson
 */

    
    private InfDB idb;
    
    public Validering(InfDB idb)
    {
        this.idb = idb;
    }
    //Check Admin user 
    public boolean checkAdmin(String AID) {
        try {
            return idb.fetchSingle("SELECT AID FROM admin WHERE AID = '" + AID + "'") != null;
        } catch (InfException e){
            System.out.println("fel vid kontroll av adminstatus: " + e.getMessage());
            return false;
        }
    }
    //Check project manager user 
    public boolean checkProjectManager(String AID){
        try{
            return idb.fetchSingle("SELECT AID FROM projekt WHERE projektchef = '" + AID + "'") != null;
        } catch(InfException e){
            System.out.println("fel vid kontroll av projektchefstatus: " + e.getMessage());
            return false;
        }

    }
    
}


