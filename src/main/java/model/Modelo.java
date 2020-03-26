package model;

public enum Modelo {

    FAMILIAR("Familiar"),
    COUPE("Coupe"),
    SEDAN("Sedan");

    private String modeloVehiculo;

    Modelo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getModeloVehiculo() {
        return this.modeloVehiculo;
    }
}
