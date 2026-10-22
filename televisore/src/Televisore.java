public class Televisore {
    private int canale;
    private boolean acceso;
    private int volume;

    public Televisore() {
        canale = 1;
        acceso = false;
        volume = 0;
    }

    public int getCanale() {
        return canale;
    }

    public int getVolume() {
        return volume;
    }

    public boolean setVolume(int volume) {
        if (acceso && volume >= 0 && volume <= 100) {
            this.volume = volume;
            return true;
        }
        return false;
    }

    public boolean canaleSuccessivo() {
        if (acceso) {
            canale++;
            if (canale > 999) {
                canale = 1;
            }
            return true;
        }
        return false;
    }

    public boolean canalePrecedente() {
        if (acceso) {
            if (canale == 1) {
                canale = 999;
            } else {
                canale--;
            }
            return true;
        }
        return false;
    }

    public boolean selezionaCanale(int canale) {
        if (acceso && canale <= 999 && canale >= 1) {
            this.canale = canale;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (acceso) {
            return "il televisore è acceso, sul canale " + canale + " con il volume a " + volume;
        } else {
            return "il televisore è spento";
        }
    }
}