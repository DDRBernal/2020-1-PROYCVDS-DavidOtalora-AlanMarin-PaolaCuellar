package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Area;
import edu.eci.cvds.entities.Estado;
import edu.eci.cvds.entities.Iniciativa;
import edu.eci.cvds.services.ServicesBancoProyectoFactory;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.*;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name="chartView")
@ViewScoped
public class ChartView implements Serializable {
    private PieChartModel pieModel;

    public PieChartModel getPieModel(){
        return pieModel;
    }

    public  void setPieModel(PieChartModel pieModel){
        this.pieModel=pieModel;
    }

    public void listar(){
        List<Iniciativa> iniciativas= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarIniciativaPublico("_");
        graficar(iniciativas);
    }

    public void graficar(List<Iniciativa> iniciativas){
        pieModel = new PieChartModel();
        List<Iniciativa> amb= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorArea(Area.AMBIENTAL.getArea());
        List<Iniciativa> mat= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorArea(Area.MATEMATICAS.getArea());
        List<Iniciativa> mec= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorArea(Area.MECANICA.getArea());
        List<Iniciativa> ind= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorArea(Area.INDUSTRIAL.getArea());
        List<Iniciativa> fis= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorArea(Area.FISICA.getArea());
        List<Iniciativa> sis= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorArea(Area.SISTEMAS.getArea());

        pieModel.set(Area.AMBIENTAL.getArea(),amb.size());
        pieModel.set(Area.MATEMATICAS.getArea(),mat.size());
        pieModel.set(Area.MECANICA.getArea(),mec.size());
        pieModel.set(Area.INDUSTRIAL.getArea(),ind.size());
        pieModel.set(Area.FISICA.getArea(),fis.size());
        pieModel.set(Area.SISTEMAS.getArea(),sis.size());

        pieModel.setTitle("Grafica");
        pieModel.setLegendPosition("e");
        pieModel.setFill(false);
        pieModel.setShowDataLabels(true);
        pieModel.setDiameter(500);
    }

    public void graficarESTADO(){
        pieModel = new PieChartModel();
        List<Iniciativa> amb= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorEstado(Estado.EnEsperaDeRevision.getEstado());
        List<Iniciativa> mat= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorEstado(Estado.EnRevision.getEstado());
        List<Iniciativa> mec= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorEstado(Estado.Proyecto.getEstado());
        List<Iniciativa> ind= ServicesBancoProyectoFactory.getInstance().getServicesIniciativa().consultarPorEstado(Estado.Solucionado.getEstado());

        pieModel.set(Estado.EnEsperaDeRevision.getEstado(),amb.size());
        pieModel.set(Estado.EnRevision.getEstado(),mat.size());
        pieModel.set(Estado.Proyecto.getEstado(),mec.size());
        pieModel.set(Estado.Solucionado.getEstado(),ind.size());

        pieModel.setTitle("Grafica de Estado");
        pieModel.setLegendPosition("e");
        pieModel.setFill(false);
        pieModel.setShowDataLabels(true);
        pieModel.setDiameter(500);
    }


}