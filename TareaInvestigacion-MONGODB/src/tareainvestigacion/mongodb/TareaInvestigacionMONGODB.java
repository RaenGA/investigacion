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
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.File;
import java.io.IOException;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 *
 * @author Marisol CH
 * prueba
 * esto lo hizo arturo
 */
public class TareaInvestigacionMONGODB {
    public static DB db;
    public static DBCollection coleccion;
    public static String usuarioGlobal;
    /**
     * @param encriptado
     * @param args the command line arguments
     * @return 
    */
    public static String desencriptar(String encriptado){
        String seed = "semilla";
        StandardPBEStringEncryptor encryptor;
        encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(seed);
        String decrypted = encryptor.decrypt(encriptado);
        return decrypted;
    }
    
    public static  String encriptar(String pass){
        String seed = "semilla";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(seed);
        String encrypted = encryptor.encrypt(pass);
        return encrypted;
    }
    
        
    public void addImage(File image, String imageName) throws java.rmi.UnknownHostException, IOException{
        GridFS gfsImageCollection = new GridFS(coleccion.getDB(), "image");
        GridFSInputFile gfsFile = gfsImageCollection.createFile(image);
        gfsFile.setFilename(imageName);
        gfsFile.save();
    }
    
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
