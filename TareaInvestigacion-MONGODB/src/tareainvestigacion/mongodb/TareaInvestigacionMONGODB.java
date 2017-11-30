/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareainvestigacion.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import INTERFAZ.Inicio;

/**
 *
 * @author Marisol CH
 * prueba
 */
public class TareaInvestigacionMONGODB {
    public static DB db;
    public static DBCollection coleccion;
    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        try {
            Mongo mongo  = new Mongo("localhost", 27017);
            db = mongo.getDB("investigacion");
            //coleccion = db.getCollection("producto");
        } catch (UnknownHostException ex) {
            Logger.getLogger(TareaInvestigacionMONGODB.class.getName()).log(Level.SEVERE, null, ex);
        }
        Inicio vIn = new Inicio();
        vIn.setVisible(true);
    }
    
}
