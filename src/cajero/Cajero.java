
package cajero;

import javax.swing.JOptionPane;

public class Cajero {

   
    public static void main(String[] args) {
        String servicio, clave; 
        final int saldoinicial = 5450;
        int opcion,nuevo, cuota, opcion2, opcion3, opcion4;
        double interes, montomensual;
        float ingreso,retiro, prestamo, saldonuevo, pago;
        
        JOptionPane.showMessageDialog(null, "Bienvenido a su cajero Global Net: ");
         clave = JOptionPane.showInputDialog("Digite su clave: ");
        
        if (clave.equals("1512")) {
            
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operacion que deseas realizar: \n"
                     + "1.Ingresar Dinero a la Cuenta\n"
                     + "2.Retirar Dinero de la cuenta\n"
                     + "3.Mostrar saldo disponible\n"
                     + "4.Realizar un prestamo\n"
                     + "5.Realizar pago de servicios o Universidades\n"
                     + "6.Cambiar Clave\n"
                     + "7.Salir del cajero\n"));
             switch(opcion){
                 case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a ingresar"));
                     saldonuevo=saldoinicial+ingreso;
                     JOptionPane.showMessageDialog(null, "Su Saldo Actual es: "+saldonuevo);
                     break;
                 case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a retirar"));  
                     if(retiro>saldoinicial){
                         JOptionPane.showMessageDialog(null, "Su Saldo Actual es insuficiente: ");
                     }
                     else{
                     saldonuevo=saldoinicial-retiro;
                     JOptionPane.showMessageDialog(null, "Su Saldo Actual es: "+saldonuevo);
                     break;
                     }
                 case 3:JOptionPane.showMessageDialog(null, "su saldo disponible es: "+saldoinicial);break;
                     
                 case 4: prestamo=Float.parseFloat(JOptionPane.showInputDialog("Digite monto que necesita como prestamo\n"
                         +"su saldo actual disponible: "+saldoinicial)); 
                         cuota=Integer.parseInt(JOptionPane.showInputDialog("Digite las cuotas que desea"));
                         saldonuevo=saldoinicial+prestamo;
                         interes=prestamo*0.10;
                         montomensual=(prestamo/cuota)+(interes/cuota); 
                        JOptionPane.showMessageDialog(null, "Su Saldo Actual es: "+saldonuevo+"\n"
                        +"monto prestado: "+prestamo+"\n"
                        +"Interes Total: "+interes+"\n"
                        +"Cuota Mensual: "+montomensual);
                     break;
                 case 5: opcion2=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que desea\n"
                        +"1.Pagos de Servicios\n"
                        +"2.Pagos de Universidades\n"));
                        if(opcion2==1){ 
                     opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el servicio a pagar: \n"
                     + "1.Pagar Luz\n"
                     + "2.Pagar Claro\n"
                     + "3.pagar Movistar\n"
                     + "4.pagar agua\n"
                     + "5.salir\n"));
                        switch(opcion3){
                            case 1: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Servicio de Luz\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                             case 2: servicio = JOptionPane.showInputDialog("Digite si el servicio es Fijo, Movil o Internet");
                                 pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su servicio CLaro de "+servicio+"\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                             case 3: servicio = JOptionPane.showInputDialog("Digite si el servicio es Fijo, Movil o Internet");
                                 pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su servicio Movistar de "+servicio+"\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                             case 4: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Servicio de Agua\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                             case 5: break;
                                }
                        }
                      else if(opcion2==2){
                     opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la Universidad a pagar: \n"
                     + "1.Pagar Universidad Tecnologica de Peru(UTP)\n"
                     + "2.Pagar Universidad Peruna del Norte(UPN)\n"
                     + "3.Pagar Universidad Peruna de Ciencias Aplicadas(UPC)\n"
                     + "4.salir\n"));
                     switch(opcion3){
                         case 1: opcion4= Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion a pagar: \n"
                     + "1.Matricula\n"
                     + "2.Pension\n"
                     + "3.Retiro\n"
                     + "4.salir\n"));
                        switch(opcion4){
                            case 1: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Matricula\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 2: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Pension\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 3: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Lamentamos el Pago de su Retiro, estudie mas el proximo ciclo\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 4: break;
                                
                        }
                         case 2: opcion4= Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion a pagar: \n"
                     + "1.Matricula\n"
                     + "2.Pension\n"
                     + "3.Retiro\n"
                     + "4.salir\n"));
                        switch(opcion4){
                            case 1: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Matricula\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 2: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Pension\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 3: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Lamentamos el Pago de su Retiro, estudie mas el proximo ciclo\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 4: break;
                                
                        }
                         case 3: opcion4= Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion a pagar: \n"
                     + "1.Matricula\n"
                     + "2.Pension\n"
                     + "3.Retiro\n"
                     + "4.salir\n"));
                        switch(opcion4){
                            case 1: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Matricula\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 2: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Gracias por pagar su Pension\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 3: pago = Float.parseFloat(JOptionPane.showInputDialog("Digite monto a pagar"));
                                saldonuevo=saldoinicial-pago;   
                                JOptionPane.showMessageDialog(null, "Lamentamos el Pago de su Retiro, estudie mas el proximo ciclo\n"
                                +"Monto Pagado: "+pago+"\n"
                                +"Saldo Disponible: "+saldonuevo);
                                break;
                            case 4: break;
                                
                        }
                         case 4:break;
                     }
                        }
                      else{
                      JOptionPane.showMessageDialog(null, "Opcion Ivalida\n Que tenga un Buen Dia");
                      }
                 case 6: clave = JOptionPane.showInputDialog("Digite su clave antigua: ");
                     if(clave.equals("1512")){
                            int nuevo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nueva clave"));
                            
                            int nuevo2 = Integer.parseInt(JOptionPane.showInputDialog("Vuelva a Digitar Clave nueva"));
                            if(nuevo1==nuevo2){
                            JOptionPane.showMessageDialog(null, "Operacion Realizada, nueva contraseña: "+nuevo1);
                            }
                            else{
                            JOptionPane.showMessageDialog(null, "Contraseñas no Coinciden");
                            }
                     }
                     else{
                     JOptionPane.showMessageDialog(null, "Contraseñas Incorrecta");
                     }
                    
                 case 7: break;
                default: JOptionPane.showMessageDialog(null, "Opcion no valida");break;
             }
            }
        else { 
        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta, Operacion Cancelada");
        }
         
        
        }
    }
