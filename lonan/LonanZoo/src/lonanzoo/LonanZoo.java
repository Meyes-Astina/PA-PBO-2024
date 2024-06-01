/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lonanzoo;

import com.Login.LoginFrame;
import com.database.DataB;


/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public class LonanZoo {

    public static void main(String[] args) {
       LoginFrame loginObj = new LoginFrame();
       loginObj.show();
       
       DataB.loadConnection();
    }
    
}
