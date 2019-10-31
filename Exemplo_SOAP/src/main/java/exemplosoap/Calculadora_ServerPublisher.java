/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosoap;
import javax.xml.ws.Endpoint;
/**
 *
 * @author andre
 */
public class Calculadora_ServerPublisher {
    public static void main(String[] args)
    {
        Endpoint.publish("http://127.0.0.1:9876/exemplosoap", new Calculadora_ServerImpl());
    }

}
