/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PAVILLION
 */
public class ListaComputadoras {
    List <Computadora> computadoras=new ArrayList<>();
    int [] generaciones = new int [4];
    int [] cores = new int [5];
    int [] caches= new int [4];
    int [] capmemorias= new int [4];
    int [] ddrs= new int [4];
    int [] capdiscos= new int [5];
    int [] vrams= new int [4];
    double[] velocidades = new double[4];
    double [] frecuencias=new double[4];
    String [] marcas = new String [2];
    String []tiposdisco = new String [2];
    String [] modelosGPU= new String [3];       
    boolean [] virtual = new boolean [2]; 
    boolean [] existeGPUs = new boolean [2];
    
     public void caracteristicas(){
        virtual[0]=true;
        virtual[1]=false;
        existeGPUs[0]=true;
        existeGPUs[1]=false;
        
        marcas[0]="INTEL";
        marcas[1]="AMD";
        
        tiposdisco[0]="Magnetico";
        tiposdisco[1]="Solido";
        
        modelosGPU[0]="NVIDIA";
        modelosGPU[1]="GTX";
        modelosGPU[2]="AMD RADEON";
        
        velocidades[0]=2.10;
        velocidades[1]=3.20;
        velocidades[2]=3.60;
        velocidades[3]=2.80;
        
        frecuencias[0]=2.10;
        frecuencias[1]=3.20;
        frecuencias[2]=3.60;
        frecuencias[3]=2.80;
         
         generaciones[0]=1;
        generaciones[1]=3;
        generaciones[2]=5;
        generaciones[3]=7;
        
        vrams[0]=1;
        vrams[1]=2;
        vrams[2]=4;
        vrams[3]=8;
        
        
        ddrs[0]=0;
        ddrs[1]=2;
        ddrs[2]=3;
        ddrs[3]=4;
        
        capdiscos[0]=500;
        capdiscos[1]=1024;
        capdiscos[2]=2048;
        capdiscos[3]=4096;
        capdiscos[4]=8192;
        
        cores[0]=1;
        cores[1]=2;
        cores[2]=4;
        cores[3]=8;
        cores[4]=16;
        
        caches[0]=1;
        caches[1]=2;
        caches[2]=4;
        caches[3]=8;
        
        capmemorias[0]=2;
        capmemorias[1]=4;
        capmemorias[2]=8;
        capmemorias[3]=16;
    }
    
    public List<Computadora> cargarLista(){
        caracteristicas();
        for (int i = 0; i < 50; i++) {
            int a,b,c,d,e,f,g,h,o,j,k,l,m,n;
            
            a=(int) (Math.random() * (velocidades.length));
            b=(int) (Math.random() * (generaciones.length));
            c=(int) (Math.random() * (cores.length));
            d=(int) (Math.random() * (virtual.length));
            e=(int) (Math.random() * (caches.length));
            f=(int) (Math.random() * (marcas.length));
            g=(int) (Math.random() * (capmemorias.length));
            h=(int) (Math.random() * (frecuencias.length));
            o=(int) (Math.random() * (ddrs.length));
            j=(int) (Math.random() * (tiposdisco.length));
            k=(int) (Math.random() * (capdiscos.length));
            l=(int) (Math.random() * (existeGPUs.length));
            m=(int) (Math.random() * (vrams.length));
            n=(int) (Math.random() * (modelosGPU.length));
           
            if(existeGPUs[l]){
                Computadora comp = new Computadora(velocidades[a],generaciones[b], cores[c], virtual[d],caches[e],marcas[f],
                        capmemorias[g],frecuencias[h], ddrs[o],tiposdisco[j],capdiscos[k],existeGPUs[l],vrams[m],modelosGPU[n]);
                computadoras.add(comp);
            }else{
                Computadora  comp = new Computadora(velocidades[a],generaciones[b], cores[c], virtual[d],caches[e],marcas[f],
                        capmemorias[g],frecuencias[h], ddrs[o],tiposdisco[j],capdiscos[k],existeGPUs[l],0,"");
                computadoras.add(comp);
            }
         }
        
        return computadoras;
    }
   
}
