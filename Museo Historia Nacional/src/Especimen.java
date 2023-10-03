
    import java.util.ArrayList;
import java.util.List;

    // Clase base para los especímenes
    class Especimen {
        private String nombre;
        private String descubridor;
        private String fechaDescubrimiento;
        private String tipoEspecimen;
        private String eraGeologica;
        private String ubicacionHallazgo;

        public Especimen(String nombre, String descubridor, String fechaDescubrimiento, String tipoEspecimen, String eraGeologica, String ubicacionHallazgo) {
            this.nombre = nombre;
            this.descubridor = descubridor;
            this.fechaDescubrimiento = fechaDescubrimiento;
            this.tipoEspecimen = tipoEspecimen;
            this.eraGeologica = eraGeologica;
            this.ubicacionHallazgo = ubicacionHallazgo;
        }

        // Getters para obtener información sobre el especimen
        public String getNombre() {
            return nombre;
        }

        public String getDescubridor() {
            return descubridor;
        }

        public String getFechaDescubrimiento() {
            return fechaDescubrimiento;
        }

        public String getTipoEspecimen() {
            return tipoEspecimen;
        }

        public String getEraGeologica() {
            return eraGeologica;
        }

        public String getUbicacionHallazgo() {
            return ubicacionHallazgo;
        }
    }

    // Clase para los dinosaurios
    class Dinosaurio extends Especimen {
        private String tipoDinosaurio;
        private double tamanoEstimado;
        private double pesoEstimado;

        public Dinosaurio(String nombre, String descubridor, String fechaDescubrimiento, String eraGeologica, String ubicacionHallazgo, String tipoDinosaurio, double tamanoEstimado, double pesoEstimado) {
            super(nombre, descubridor, fechaDescubrimiento, "Dinosaurio", eraGeologica, ubicacionHallazgo);
            this.tipoDinosaurio = tipoDinosaurio;
            this.tamanoEstimado = tamanoEstimado;
            this.pesoEstimado = pesoEstimado;
        }

        // Getters específicos para dinosaurios
        public String getTipoDinosaurio() {
            return tipoDinosaurio;
        }

        public double getTamanoEstimado() {
            return tamanoEstimado;
        }

        public double getPesoEstimado() {
            return pesoEstimado;
        }
    }

    // Clase para el museo
    class MuseoHistoria {
        private List<Especimen> especimenes = new ArrayList<>();

        // Registrar un nuevo especimen
        public void registrarEspecimen(Especimen especimen) {
            especimenes.add(especimen);
        }

        // Mostrar todos los especimenes catalogados
        public void mostrarEspecimenes() {
            for (Especimen especimen : especimenes) {
                System.out.println("Nombre: " + especimen.getNombre());
                System.out.println("Descubridor: " + especimen.getDescubridor());
                System.out.println("Fecha de Descubrimiento: " + especimen.getFechaDescubrimiento());
                System.out.println("Tipo de Especimen: " + especimen.getTipoEspecimen());
                System.out.println("Era Geologica: " + especimen.getEraGeologica());
                System.out.println("Ubicación de Hallazgo: " + especimen.getUbicacionHallazgo());
                System.out.println("-------------");
            }
        }

        public static void main(String[] args) {
            MuseoHistoria museo = new MuseoHistoria();

            // Ejemplo: Registrar un dinosaurio



            // Mostrar todos los especimenes
            museo.mostrarEspecimenes();
        }
    }


