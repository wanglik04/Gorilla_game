import java.util.ArrayList;
import java.util.Iterator;


public class Maps {
    private ArrayList<Buildings> buildings;
    private int background; // Color Rgb


    // selecting buildings
    public void setBuildings(ArrayList<Buildings> building_list){
        this.buildings = building_list;
    }

    public void setBackground(int num){
        this.background = num;
    }

    //Default
    Maps(){
        this.buildings = new ArrayList<>(1001);
        this.background = 1001;
    }

    public int getBackground() {
        return background;
    }

    public ArrayList<Buildings> getBuildings(){
        return this.buildings;
    }

    public static void generateMap(Maps map){
        generateBackground(map.getBackground());
        generateBuilding(map.getBuildings());
    }

    private static void generateBackground(int background){
        System.out.println("Generating the background:"+background);
    }

    private static void generateBuilding(ArrayList<Buildings> buildings){
        Iterator<Buildings> iter = buildings.iterator();
        while (iter.hasNext()){
            System.out.println("Generating the building...");
        }
    }

}
