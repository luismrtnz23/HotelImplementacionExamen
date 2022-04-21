package pC05;

import java.io.Serializable;

public class Hotel implements Serializable {
    private Cliente[][] habitaciones = new Cliente[8][6];

    public Hotel() {
    }

    public String toString() {
        String s = "";

        for(int i = 0; i < 8; ++i) {
            for(int j = 0; j < 6; ++j) {
                if (this.habitaciones[i][j] == null) {
                    s = s + " [L] ";
                } else {
                    s = s + " [R] ";
                }
            }

            s = s + "\n";
        }

        return s;
    }

    public boolean anularReserva(Cliente cliente, String tipo, int numHab) {
        int aux = 0;
        String var5 = tipo.toUpperCase();
        byte var6 = -1;
        switch(var5.hashCode()) {
            case -1184508286:
                if (var5.equals("ESTANDAR")) {
                    var6 = 0;
                }
                break;
            case 79257304:
                if (var5.equals("SUITE")) {
                    var6 = 2;
                }
                break;
            case 1951883861:
                if (var5.equals("BALCON")) {
                    var6 = 1;
                }
        }

        int i;
        int j;
        switch(var6) {
            case 0:
                for(i = 3; i <= 7; ++i) {
                    for(i = 5; i >= 0; --i) {
                        if (this.habitaciones[i][i] instanceof Cliente && this.habitaciones[i][i].equals(cliente) && numHab > 0) {
                            this.habitaciones[i][i] = null;
                            --numHab;
                        }
                    }
                }

                if (aux == numHab) {
                    return true;
                } else {
                    return false;
                }
            case 1:
                for(i = 0; i < numHab; ++i) {
                    for(i = 2; i >= 1; --i) {
                        for(j = 0; j < 6; ++j) {
                            if (this.habitaciones[i][j] instanceof Cliente && this.habitaciones[i][j].equals(cliente) && numHab > 0) {
                                this.habitaciones[i][j] = null;
                                --numHab;
                            }
                        }
                    }
                }

                if (aux == numHab) {
                    return true;
                }

                return false;
            case 2:
                for(i = 0; i < numHab; ++i) {
                    for(i = 0; i < 1; ++i) {
                        for(j = 0; j < 6; ++j) {
                            if (this.habitaciones[i][j] instanceof Cliente && this.habitaciones[i][j].equals(cliente) && numHab > 0) {
                                this.habitaciones[i][j] = null;
                                --numHab;
                            }
                        }
                    }
                }

                if (aux == numHab) {
                    return true;
                }

                return false;
            default:
                return false;
        }
    }

    public boolean reservar(Cliente cliente, String tipo, int numHab) {
        int aux = 0;
        String var5 = tipo.toUpperCase();
        byte var6 = -1;
        switch(var5.hashCode()) {
            case -1184508286:
                if (var5.equals("ESTANDAR")) {
                    var6 = 0;
                }
                break;
            case 79257304:
                if (var5.equals("SUITE")) {
                    var6 = 2;
                }
                break;
            case 1951883861:
                if (var5.equals("BALCON")) {
                    var6 = 1;
                }
        }

        int i;
        int j;
        switch(var6) {
            case 0:
                for(i = 7; i >= 3; --i) {
                    for(i = 0; i < 6; ++i) {
                        if (this.habitaciones[i][i] == null && numHab > 0) {
                            this.habitaciones[i][i] = cliente;
                            --numHab;
                        }
                    }
                }

                if (aux == numHab) {
                    return true;
                } else {
                    return false;
                }
            case 1:
                for(i = 0; i < numHab; ++i) {
                    for(i = 2; i >= 1; --i) {
                        for(j = 0; j < 6; ++j) {
                            if (this.habitaciones[i][j] == null && numHab > 0) {
                                this.habitaciones[i][j] = cliente;
                                --numHab;
                            }
                        }
                    }
                }

                if (aux == numHab) {
                    return true;
                }

                return false;
            case 2:
                for(i = 0; i < numHab; ++i) {
                    for(i = 0; i < 1; ++i) {
                        for(j = 0; j < 6; ++j) {
                            if (this.habitaciones[i][j] == null && numHab > 0) {
                                this.habitaciones[i][j] = cliente;
                                --numHab;
                            }
                        }
                    }
                }

                if (aux == numHab) {
                    return true;
                }

                return false;
            default:
                return false;
        }
    }

    public void adicional(Cliente cliente, int planta, Referencia p) {
        int c = 0;

        for(int j = 0; j < 6; ++j) {
            if (this.habitaciones[8 - planta][j] == null) {
                this.habitaciones[8 - planta][j] = cliente;
                ++c;
            }
        }

        p.setX(c);
    }
}
