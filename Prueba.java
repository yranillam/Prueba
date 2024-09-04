public class Prueba {

    private PageCambioLeadYOportu pageCambioLeadYOportu;

    @Step
    public void desestimarLead(String strMotivo, String strDetalle, String strResulCelular) {
        pageCambioLeadYOportu.irDesestimar();
        pageCambioLeadYOportu.ingresarDatosYDesestimar(strMotivo, strDetalle, strResulCelular);
    }

    @Step
    public String obtenerEstadoProspecto() {
        return pageCambioLeadYOportu.extraerEstadoProspecto();
    }

    
}
