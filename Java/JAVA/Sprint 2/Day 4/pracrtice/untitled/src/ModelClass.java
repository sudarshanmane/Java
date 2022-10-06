public class ModelClass {

    String name = "Shiv";
    String address = "BLR";

     ModelClass(String name, String address){
       this.address = address;
       this.name = name;
    }

    @Override
    public String toString() {
        return "name : " + name + " and "+
                " address : " + address ;
    }
}
