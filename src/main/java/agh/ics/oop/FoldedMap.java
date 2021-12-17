package agh.ics.oop;

public class FoldedMap extends AbstractWorldMap{
    public FoldedMap(int width, int height, double jungleRatio, int startEnergy, int moveEnergy, int plantEnergy, int startingAnimals) {
        super(width, height, jungleRatio, startEnergy, moveEnergy, plantEnergy, startingAnimals);
    }

    @Override
    public boolean canMoveTo(Vector2d position) {
        return true;
    }


}