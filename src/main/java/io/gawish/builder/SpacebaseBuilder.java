package io.gawish.builder;

public class SpacebaseBuilder {
    private Spacebase spacebase;

    public SpacebaseBuilder() {
        this.spacebase = new Spacebase();
    }

    public void reset() {
        this.spacebase = new Spacebase();
    }

    public void addElectricityGenerator(float generationRate) {
        ElectricityGenerator el = new ElectricityGenerator(generationRate);
        this.spacebase.addElectricityGenerator(el);
    }

    public void addWaterPlan(float extractionRate) {
        WaterPlant wp = new WaterPlant(extractionRate);
        wp.setElectricityGenerator(this.spacebase.getElectricityGenerators().get(0));
        this.spacebase.addWaterPlant(wp);
    }

    public void addHouse(int nbResidents) {
        House house = new House(nbResidents);
        house.setWaterPlant(this.spacebase.getWaterPlants().get(0));
        house.setElectricityGenerator(this.spacebase.getElectricityGenerators().get(0));
        this.spacebase.addHouse(house);
    }

    public Spacebase getSpacebase() {
        return spacebase;
    }
}
