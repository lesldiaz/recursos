/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genes;

/**
 *
 * @author PAVILLION
 */
public class Computadora {
    /*PROCESADOR*/
    private double velocidadProcesador; //GHz
    private int generacion;
    private int numCores;
    private boolean sopx64;
    private int cacheLevel;
    private String marca;
    /*RAM*/
    private int cap_memoria;
    private double frecuencia;
    private int ddr;
    /*DISCO*/
    private String tipo_dis;
    private int cap_disco;
    
    /*GPU*/
    private boolean existeGPU;
    private int vram;
    private String modeloGPU;

    public Computadora(double velocidadProcesador, int generacion, int numCores, boolean sopx64, int cacheLevel, String marca, int cap_memoria, double frecuencia, int ddr, String tipo_dis, int cap_disco, boolean existeGPU, int vram, String modeloGPU) {
        this.velocidadProcesador = velocidadProcesador;
        this.generacion = generacion;
        this.numCores = numCores;
        this.sopx64 = sopx64;
        this.cacheLevel = cacheLevel;
        this.marca = marca;
        this.cap_memoria = cap_memoria;
        this.frecuencia = frecuencia;
        this.ddr = ddr;
        this.tipo_dis = tipo_dis;
        this.cap_disco = cap_disco;
        this.existeGPU = existeGPU;
        this.vram = vram;
        this.modeloGPU = modeloGPU;
    }

     @Override
    public String toString() {
        String val,val2,sol="";
        if(sopx64){
            val="SI";
        }else{
            val="NO";
        }
        if(existeGPU){
            val2="SI";
        }else{
            val2="NO";
        }
        if(val2.equals("NO")){
        sol="La computadora tiene estas caracteristicas:\n----PROCESADOR---- \n Velocidad: "+ velocidadProcesador + "\n "
                + "Generacion: " + generacion +"\n Numero de Nucleos: "+numCores + "\n ¿Soporta Tecnologia de Virtualizacion? "
                + val +"\n Tamaño Cache: "+cacheLevel + "\n Marca: "+ marca +"\n----MEMORIA RAM----\n" + " Capacidad: "+cap_memoria+
                "\n Frecuencia: "+frecuencia+"\n DDR: "+ ddr + "\n----DISCO----\n" +" Tipo: "+ tipo_dis +"\n Capacidad: "+ cap_disco+
                "\n----GPU----\n Cuenta con GPU: "+ val2;
        }else if (val2.equals("SI")){
        sol="La computadora tiene estas caracteristicas:\n----PROCESADOR---- \n Velocidad: "+ velocidadProcesador + "\n "
                + "Generacion: " + generacion +"\n Numero de Nucleos: "+numCores + "\n ¿Soporta Tecnologia de Virtualizacion? "
                + val +"\n Tamaño Cache: "+cacheLevel + "\n Marca: "+ marca +"\n----MEMORIA RAM----\n" + " Capacidad: "+cap_memoria+
                "\n Frecuencia: "+frecuencia+"\n DDR: "+ ddr + "\n----DISCO----\n" +" Tipo: "+ tipo_dis +"\n Capacidad: "+ cap_disco+
                "\n----GPU----\n Cuenta con GPU: "+ val2+"\n VRAM: "+ vram +"\n Modelo: "+modeloGPU;  
        //+"\n VRAM: "+ vram +"\n Modelo: "+modeloGPU
        }
        return sol;
                
    }
    public double getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(double velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }

    public boolean isSopx64() {
        return sopx64;
    }

    public void setSopx64(boolean sopx64) {
        this.sopx64 = sopx64;
    }

    public int getCacheLevel() {
        return cacheLevel;
    }

    public void setCacheLevel(int cacheLevel) {
        this.cacheLevel = cacheLevel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCap_memoria() {
        return cap_memoria;
    }

    public void setCap_memoria(int cap_memoria) {
        this.cap_memoria = cap_memoria;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getDdr() {
        return ddr;
    }

    public void setDdr(int ddr) {
        this.ddr = ddr;
    }

    public String getTipo_dis() {
        return tipo_dis;
    }

    public void setTipo_dis(String tipo_dis) {
        this.tipo_dis = tipo_dis;
    }

    public int getCap_disco() {
        return cap_disco;
    }

    public void setCap_disco(int cap_disco) {
        this.cap_disco = cap_disco;
    }

    public boolean isExisteGPU() {
        return existeGPU;
    }

    public void setExisteGPU(boolean existeGPU) {
        this.existeGPU = existeGPU;
    }

    public int getVram() {
        return vram;
    }

    public void setVram(int vram) {
        this.vram = vram;
    }

    public String getModeloGPU() {
        return modeloGPU;
    }

    public void setModeloGPU(String modeloGPU) {
        this.modeloGPU = modeloGPU;
    }

   
   
    
}
