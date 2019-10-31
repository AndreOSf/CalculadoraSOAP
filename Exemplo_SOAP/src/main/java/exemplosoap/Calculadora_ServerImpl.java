/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosoap;
import exemplosoap.Calculadora_Server;
import java.util.Date;
import javax.jws.WebService;
@WebService(endpointInterface = "exemplosoap.Calculadora_Server")
/**
 *
 * @author andre
 */
public class Calculadora_ServerImpl implements Calculadora_Server  {
    public float soma(float num1, float num2) {
    System.out.println("SOMA ACCESSADA:");
    return num1 + num2;
    }
    public float subtracao(float num1, float num2) {
    System.out.println("SUBTRACAO ACCESSADA:");
    return num1 - num2;
    }
    public float multiplicacao(float num1, float num2) {
    System.out.println("MULTIPLICACAO ACCESSADA:");
    return num1 * num2;
    }
    public float divisao(float num1, float num2) {
    System.out.println("DIVISAO ACCESSADA:");
    return num1 / num2;
    }

}
