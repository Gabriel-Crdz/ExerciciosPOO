public class Circulo implements FormaGeometrica{
    public float calcularArea(float r1, float r2){
        double areaDouble = 3.14 * (r1 * r2);
        float area = (float) areaDouble;
        return area;
    }
}
