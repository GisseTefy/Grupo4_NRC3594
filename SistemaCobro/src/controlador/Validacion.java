package controlador;

public class Validacion {

    String mensajeE;
    boolean error;

    public Validacion() {
        this.mensajeE = "";
        this.error = true;
    }

    public boolean validarApenNomb(String dato) {
        error = true;
        mensajeE = "Los Nombres o Apellidos son invalidos, por favor llenelos nuevamente";
        int espacio = 0;

        dato = eliminarEspaciosI(dato);
        dato = eliminarEspaciosF(dato);
        
        if (camposVacios(dato)) {
            mensajeE = "ERROR!. Los campos Nombres o Apellidos no se encuetra llenados.";
            return error;
        }
        if (!soloLetras(dato)) {
            return error;
        }
        for (int i = 0; i < dato.length(); i++) {
            if (dato.substring(i, i + 1).equals(" ")) {
                espacio++;
                error = false;
                mensajeE = ""; 
                if(espacio > 1){   
                    error = true;
                    mensajeE = "Los Nombres o Apellidos son invalidos, por favor llenelos nuevamente";
                    break;
                }
            }
        }


        return error;
    }

    public boolean validarCorreo(String correo) {
        error = true;
        mensajeE = "El correo es invalido, por favor llenelos nuevamente";
        correo = eliminarEspaciosI(correo);
        correo = eliminarEspaciosF(correo);

        if (camposVacios(correo)) {
            mensajeE = "ERROR!. El campos del corrreo electrónico no se encuetra llenado.";

            return error;
        }

        for (int i = 0; i < correo.length(); i++) {
            if (correo.substring(i, i + 1).equals("@")) {
                if (correo.substring(i + 1, correo.length()).equals("espe.edu.ec")
                        || correo.substring(i + 1, correo.length()).equals("gmail.com")
                        || correo.substring(i + 1, correo.length()).equals("hotmail.com")) {
                    mensajeE = "";
                    error = false;
                    break;
                }
            }
        }

        return error;
    }

    public boolean validarCedula(String cedula) {
        error = true;
        mensajeE = "La cedula ingresada es incorrecta, por favor llenelos nuevamente el campo";

        cedula = eliminarEspaciosI(cedula);
        cedula = eliminarEspaciosF(cedula);
        
        if (camposVacios(cedula)) {
            mensajeE = "ERROR!. El campo cedula no se encuetra llenado.";



            return error;
        }

        if (cedula.length() == 10) {
            if (soloNumero(cedula)) {
                int auxUno = Integer.parseInt(cedula.substring(0, 2));
                int auxDos = Integer.parseInt(cedula.substring(2, 3));
                int auxTres = Integer.parseInt(cedula.substring(9, 10));

                int primerD = Integer.parseInt(cedula.substring(0, 1)) * 2;
                int segundoD = Integer.parseInt(cedula.substring(1, 2));
                int tercerD = Integer.parseInt(cedula.substring(2, 3)) * 2;
                int cuartoD = Integer.parseInt(cedula.substring(3, 4));
                int quintoD = Integer.parseInt(cedula.substring(4, 5)) * 2;
                int sextoD = Integer.parseInt(cedula.substring(5, 6));
                int septimoD = Integer.parseInt(cedula.substring(6, 7)) * 2;
                int octavoD = Integer.parseInt(cedula.substring(7, 8));
                int novenoD = Integer.parseInt(cedula.substring(8, 9)) * 2;

                if (primerD >= 10) {
                    primerD = primerD - 9;
                }
                if (tercerD >= 10) {
                    tercerD = tercerD - 9;
                }
                if (quintoD >= 10) {
                    quintoD = quintoD - 9;
                }
                if (septimoD >= 10) {
                    septimoD = septimoD - 9;
                }
                if (novenoD >= 10) {
                    novenoD = novenoD - 9;
                }

                int sumatoria = primerD + segundoD + tercerD + cuartoD + quintoD + sextoD + septimoD + octavoD + novenoD;
                String sumaux = "" + sumatoria;
                int decimoD = ((Integer.parseInt(sumaux.substring(0, 1)) + 1) * 10) - sumatoria;

                if ((auxUno <= 24) && (auxUno > 0) && (auxDos < 6) && (auxTres == decimoD)) {
                    mensajeE = "";
                    error = false;
                }
            }
        }      
        return error;
    }

    public boolean validarTelf(String telef) {
        error = true;
        mensajeE = "El numero de celular es invalido, por favor llenelos nuevamente el campo ";

        telef = eliminarEspaciosI(telef);
        telef = eliminarEspaciosF(telef);
        
        if (camposVacios(telef)) {
            mensajeE = "ERROR!. El campo teléfono no se encuetra llenado.";
            return error;
        }

        if (telef.length() == 10) {
            if (soloNumero(telef)) {
                if (telef.substring(0, 2).equals("09")) {
                    mensajeE = "";
                    error = false;
                }
            }
        }
        return error;
    }

    public boolean soloNumero(String dato) {
        boolean valides = true;
        for (int i = 0; i < dato.length(); i++) {
            if ((!dato.substring(i, i + 1).equals("0")) && (!dato.substring(i, i + 1).equals("1"))
                    && (!dato.substring(i, i + 1).equals("2")) && (!dato.substring(i, i + 1).equals("3"))
                    && (!dato.substring(i, i + 1).equals("4")) && (!dato.substring(i, i + 1).equals("5"))
                    && (!dato.substring(i, i + 1).equals("6")) && (!dato.substring(i, i + 1).equals("7"))
                    && (!dato.substring(i, i + 1).equals("8")) && (!dato.substring(i, i + 1).equals("9"))) {

                valides = false;
                break;
            }
        }
        return valides;
    }

    public boolean soloLetras(String dato) {
        boolean valides = true;
        for (int i = 0; i < dato.length(); i++) {
            if ((dato.substring(i, i + 1).equals("0")) || (dato.substring(i, i + 1).equals("1"))
                    || (dato.substring(i, i + 1).equals("2")) || (dato.substring(i, i + 1).equals("3"))
                    || (dato.substring(i, i + 1).equals("4")) || (dato.substring(i, i + 1).equals("5"))
                    || (dato.substring(i, i + 1).equals("6")) || (dato.substring(i, i + 1).equals("7"))
                    || (dato.substring(i, i + 1).equals("8")) || (dato.substring(i, i + 1).equals("9"))) {

                valides = false;
                break;
            }
        }
        return valides;
    }

    public boolean camposVacios(String datos) {
        boolean validacion = true;
        if (!datos.equals("")) {
            validacion = false;
        }
        return validacion;
    }

    public String eliminarEspaciosI(String datos) {
        String datoAux = datos;
        int numL = datos.length();
        for (int i = 0; i < numL; i++) {
            if (datoAux.substring(i, i + 1).equals(" ")) {
                datoAux = datoAux.substring(i + 1, numL);
                numL = datoAux.length();
                i = 0;
            } else {
                break;
            }
        }
        return datoAux;
    }
    public String eliminarEspaciosF(String datos) {
        String datoAux = datos;
        int numL = datos.length();
        for (int i = 0; i < numL; i++) {
            if (datoAux.substring(numL-1-i, numL).equals(" ")) {
                datoAux = datoAux.substring(i, numL-1-i);
                numL = datoAux.length();
                i = 0;
            } else {
                break;
            }
        }
        return datoAux;
    }

    public String getMensajeE() {
        return mensajeE;
    }

    public void setMensajeE(String mensajeE) {
        this.mensajeE = mensajeE;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

}
