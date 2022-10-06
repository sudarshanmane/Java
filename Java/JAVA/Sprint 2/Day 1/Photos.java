public class Photos {

    String photoName;
    String location;
    String time;
    String caption;


    Photos(String caption,String name, String location, String time){

        this.caption = caption;
        this.photoName = name;
        this.location = location;
        this.time = time;
    }
    void photoName(){
        System.out.println(photoName);
    }



}

