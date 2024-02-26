package agenda;

import java.util.ArrayList;


public class ListadoContactos {
	private ArrayList<Contacto> contactos;
	private int edad;

	
	
	public ListadoContactos() {
		super();
		// TODO Auto-generated constructor stub
		this.contactos = new ArrayList<>();
	}



	public ListadoContactos(ArrayList<Contacto> contactos) {
		super();
		 this.contactos = contactos;
		
	}



	public ArrayList<Contacto> getContactos() {
		return contactos;
	}



	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}



	@Override
	public String toString() {
		return "ListadoContactos [contactos=" + contactos + "]";
	}
	
	//metodo para añadir un contacto
	
	public boolean annadirContacto(Contacto c) {
		
		if (contactos.contains(c)) {
			System.out.println("El contacto ya existe");
			return false;
		}
		contactos.add(c);
		return true;
	}
	
	
	public boolean eliminarContacto(String nombre) {
		
		for(Contacto c: contactos) {
			if (c.getNombre().equals(nombre)) {
				contactos.remove(c);
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean existeContacto(String nombre) {
		
		for(Contacto c: contactos) {
			if (c.getNombre().equals(nombre)) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public void listarContactos() {
		for(Contacto c: contactos) {
			System.out.println("nombre: "+ c.getNombre()+ " telefono "+c.getTelefono()+" cumpleaños "+c.getCumpleanos());
		}
	}
    public Contacto buscaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                
                System.out.println("nombre: "+ c.getNombre()+ " telefono "+c.getTelefono()+" cumpleaños "+c.getCumpleanos());
                return c;
                
            }
        }
        return null;
    }
	
	}
	


