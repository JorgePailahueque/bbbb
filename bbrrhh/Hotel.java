
package bbrrhh;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Hotel {
    private Archivo t =new Archivo();
    private Administrador admin;
    private ArrayList<String>informacion;
    private ArrayList<Habitacion>habitaciones=new ArrayList();
    private ArrayList<Cliente>clientes=new ArrayList();
    

    public Hotel() {
        this.informacion=informacion;
            this.habitaciones=t.leerArchivoHab();
            this.clientes=t.leerArchivoClie();
            this.admin=t.leerArchivoAdmin();
        
        
    }
    
    public ArrayList<Habitacion> habitacionesDisponibles(){
        ArrayList<Habitacion>habDis = new ArrayList();
        for (int i = 0; i < habitaciones.size(); i++) {
           
                habDis.add(habitaciones.get(i));
            
        }
        return habDis;
    }
    
    public void agregarCliente(String nombre, String apellido, String rut, String correo, String numeroT, String noches, Object numero){
        int num= Integer.parseInt(""+numero);
        
        if(buscarCliente(rut)==true){
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getRut().equalsIgnoreCase(rut)) {
                clientes.get(i).agregarReservacion(noches,habitacion(num));
                cambiarEstadoHabitacion(num);
                t.guardarArchivoHab(habitaciones);
                t.guardarArchivoClie(clientes);
            }
            System.out.println("agregado");
        }
        }else{
            Cliente s= new Cliente(nombre,apellido,rut,correo,numeroT);
            clientes.add(s);
            s.agregarReservacion(noches, habitacion(num));
            cambiarEstadoHabitacion(num);
            t.guardarArchivoClie(clientes);
            t.guardarArchivoHab(habitaciones);
            System.out.println("agregado new");
        }
        
        
    }
    
    private boolean buscarCliente(String rut){
        boolean x=false;
        for (int i = 0; i < clientes.size(); i++) {
            if (rut.equalsIgnoreCase(clientes.get(i).getRut())) {
                
              x= true; 
            }
            
        }
        return x;
    }
    
    public void confirmarReservacion(String rut ,String numHab){
    if (buscarCliente(rut)==true) {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getRut().equalsIgnoreCase(rut)) {
                    for (int j = 0; j < clientes.get(i).getReservaciones().size(); j++) {
                        if (numHab.equalsIgnoreCase(""+clientes.get(i).getReservaciones().get(j).getHabitacion().getNumero())) {
                            cambiarEstadoHabitacion(Integer.parseInt(numHab));
                            JOptionPane.showMessageDialog(null, "Su reservacion fue confirmada");
                        }
                    }
                }
            }
        }
    }
    
     public void finalizarEstadia(String rut ,String numHab){
    if (buscarCliente(rut)==true) {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getRut().equalsIgnoreCase(rut)) {
                    for (int j = 0; j < clientes.get(i).getReservaciones().size(); j++) {
                        if (numHab.equalsIgnoreCase(""+clientes.get(i).getReservaciones().get(j).getHabitacion().getNumero())) {
                            cambiarEstadoHabitacion(Integer.parseInt(numHab));
                            JOptionPane.showMessageDialog(null, "Estadia finalizada");
                        }
                    }
                }
            }
        }
    }
     
    public ArrayList<String> reservacion(String rut, String numHab){
        ArrayList<String> r = new ArrayList();
        if (buscarCliente(rut)==true) {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getRut().equalsIgnoreCase(rut)) {
                    for (int j = 0; j < clientes.get(i).getReservaciones().size(); j++) {
                        if (numHab.equalsIgnoreCase(""+clientes.get(i).getReservaciones().get(j).getHabitacion().getNumero())) {
                            r.add("Nombre: "+clientes.get(i).getNombre());
                            r.add("Apellido: "+clientes.get(i).getApellido());
                            r.add("Rut: "+clientes.get(i).getRut());
                            r.add("Correo: "+clientes.get(i).getCorreo());
                            r.add("Numero telefono: "+clientes.get(i).getNumeroT());
                            r.add("Habitacion: "+clientes.get(i).getReservaciones().get(j).getHabitacion().getTipo());
                            r.add("Numero: "+clientes.get(i).getReservaciones().get(j).getHabitacion().getNumero());
                            r.add("Monto: "+clientes.get(i).getReservaciones().get(j).getMonto());
                        }else{
                            JOptionPane.showMessageDialog(null, "No se ecuentran registros");
                        }
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se ecuentran registros");
        }
        return r;
    }
    
    private Habitacion habitacion(int numero){
        Habitacion a= new Habitacion("",0,"",0);
        for (int i = 0; i < 10; i++) {
            if (numero==habitaciones.get(i).getNumero()) {
                a=habitaciones.get(i);
            }
        }
        return a;
    }
    
    public void reset(){
        habitaciones.add(new Habitacion("Single",30000,"Disponible",1));
        habitaciones.add(new Habitacion("Single",30000,"Disponible",2));
        habitaciones.add(new Habitacion("Single",30000,"Disponible",3));
        habitaciones.add(new Habitacion("Single",30000,"Disponible",4));
        habitaciones.add(new Habitacion("Single",30000,"Disponible",5));
        habitaciones.add(new Habitacion("Doble",30000,"Disponible",6));
        habitaciones.add(new Habitacion("Doble",30000,"Disponible",7));
        habitaciones.add(new Habitacion("Doble",30000,"Disponible",8));
        habitaciones.add(new Habitacion("Doble",30000,"Disponible",9));
        habitaciones.add(new Habitacion("Doble",30000,"Disponible",10));
        habitaciones.add(new Habitacion("Familiar",30000,"Disponible",11));
        habitaciones.add(new Habitacion("Familiar",30000,"Disponible",12));
        habitaciones.add(new Habitacion("Familiar",30000,"Disponible",13));
        habitaciones.add(new Habitacion("Familiar",30000,"Disponible",14));
        habitaciones.add(new Habitacion("Familiar",30000,"Disponible",15));
        t.guardarArchivoHab(habitaciones);
        t.guardarArchivoClie(clientes);
//        Administrador s= new Administrador("Esteban", "Lizama","129846192", "12345");
//        t.guardarArchivoAdmin(s);
    }
       private void cambiarEstadoHabitacion(int numero){
        for (int i = 0; i < habitaciones.size(); i++) {
            if (numero==habitaciones.get(i).getNumero()) {
                if (habitaciones.get(i).getEstado().equalsIgnoreCase("Disponible")) {
                    habitaciones.get(i).setEstado("Reservado");
                    t.guardarArchivoHab(habitaciones);
                }else{
                    if (habitaciones.get(i).getEstado().equalsIgnoreCase("Reservado")) {
                        habitaciones.get(i).setEstado("Ocupado");
                        t.guardarArchivoHab(habitaciones);
                    }else{
                        if (habitaciones.get(i).getEstado().equalsIgnoreCase("Ocupado")) {
                            habitaciones.get(i).setEstado("Disponible");
                            t.guardarArchivoHab(habitaciones);
                        }
                    }
                }
            }
        }
    }
    public String[] numeroHabDis(Object x){
        String tipo= ""+x;
        int c=0;
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getTipo().equalsIgnoreCase(tipo) && habitaciones.get(i).getEstado().equalsIgnoreCase("Disponible")) {
                c++;
            }
        }
        String[]s=new String[c];
        int j=0;
            
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getTipo().equalsIgnoreCase(tipo) && habitaciones.get(i).getEstado().equalsIgnoreCase("Disponible")) {
                s[j]=""+habitaciones.get(i).getNumero();
                j++;
            }
        }
        
        return s;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
    
    public ArrayList<String> getInformacion() {
        return informacion;
    }

    public void setInformacion(ArrayList<String> informacion) {
        this.informacion = informacion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

   
    
}
