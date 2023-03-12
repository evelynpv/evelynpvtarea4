package cuentas;

/**
 * The type C cuenta.
 */
public class CCuenta {

/** Estos son los parámetros de la clase CCuenta */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros @param nom the nom
     *
     * @param cue  the cue
     * @param sal  the sal
     * @param tipo the tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo actual de la cuenta.  @return the double
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que permite ingresar una cantidad de dinero de la cuenta. Si la cantidad es negativa se lanza una excepción de tipo Exception.  @param cantidad the cantidad
     *
     * @throws Exception the exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite retirar una cantidad de dinero de la cuenta. Si la cantidad es negativa o
     * mayor que el saldo actual, se lanza una excepción de tipo Exception.  @param cantidad the cantidad
     *
     * @throws Exception the exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Se han creado getter y setters  @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets cuenta.
     *
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets cuenta.
     *
     * @param cuenta the cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Gets saldo.
     *
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets saldo.
     *
     * @param saldo the saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Get tipo interés double.
     *
     * @return the double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Set tipo interés.
     *
     * @param tipoInterés the tipo interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
