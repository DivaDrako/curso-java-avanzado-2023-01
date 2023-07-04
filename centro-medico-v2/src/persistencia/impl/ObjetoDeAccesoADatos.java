package persistencia.impl;

import modelo.impl.Medico;
import persistencia.IObjetoDeAcessoADatos;

import java.util.ArrayList;
import java.util.List;

public class ObjetoDeAccesoADatos implements IObjetoDeAcessoADatos {

    private List<Medico> medicos = new ArrayList<>();


    @Override
    public boolean guardarMedico(Medico m){
        boolean respuesta = false;

        if(!this.medicos.contains(m)){
            this.medicos.add(m);
            respuesta = true;
        }

        return respuesta;

//        Implementación básica usando ciclos.
//        for (Medico medicoActual : this.medicos){
//            if(medicoActual.equals(m)){
//                return false;
//            }
//        }
//
//        this.medicos.add(m);
//
//        return true;
    }
}