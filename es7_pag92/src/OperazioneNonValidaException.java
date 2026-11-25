public class OperazioneNonValidaException extends Exception {

    private String motivo;

    public OperazioneNonValidaException(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }
}
