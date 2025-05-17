public class Factura {
    private String nombreC;
    private String nombreP;
    private int cantidad;
    private double valorUnitario;
    
    public Factura(String nombreC, String nombresP, int cantidad, double valorUnitario){
        this.nombreC = nombreC;
        this.nombreP = nombreP;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public String getNombreC() {
        return nombreC;
    }

    public String getNombreP() {
        return nombreP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
    
}
