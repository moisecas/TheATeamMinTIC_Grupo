public class Movimientos {
    //atributos nombre, dirección, telefono, nit
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    //constructor
    public Movimientos(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    //instancia de la clase empresa
    Empresa empresa = new Empresa(); //instancia de la clase empresa
    //crear empresa
    empresa.setNombre("Empresa");
    empresa.setDireccion("Calle 1");
    empresa.setTelefono("123456789");
    empresa.setNit("123456789");

    //leer y modificar atributos de la empresa
    System.out.println("Nombre: " + empresa.getNombre(), "Direccion: " + empresa.getDireccion(), "Telefono: " + empresa.getTelefono(), "Nit: " + empresa.getNit());


    //modificar atributos de la empresa
    empresa.setNombre("Empresa 2");
    empresa.setDireccion("Calle 2");
    empresa.setTelefono("987654321");
    empresa.setNit("987654321");
    System.out.println("Nombre: " + empresa.getNombre(), "Direccion: " + empresa.getDireccion(), "Telefono: " + empresa.getTelefono(), "Nit: " + empresa.getNit());

}
