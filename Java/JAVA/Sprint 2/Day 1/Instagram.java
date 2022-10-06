public class Instagram {
    String name ;
    String address;
    int id ;
    Photos photos;


//   static Address myAddress  = new Address();
//
//   Address getMyNewAddressObject(){
//       return new Address();
//   }

   PrintMyName getMyName(){
    return new PrintMyName();
   }

   void myNameObject(PrintMyName newObj){
      newObj.myName();
   }

//
//   void printMyNAddress(Address myObj){
//          myObj.printMyAddress();
//   }

   PrintMyName getCoolerName(){
       return new PrintMyName();
   }
   void printingCooler(PrintMyName newOne){
       newOne.coolerName();
   }
//   Address printingPara(){
//       return new Address();
//   }
//   void printPara(Address myParaObj){
//       myParaObj.paraShoot();
//   }
//



   Instagram(String name,String address,int id , Photos photos){
       this.name = name;
       this.address = address;
       this.id = id;
       this.photos= photos;

   }


 

    public static void main(String[] args) {
//
//        Instagram insta = new Instagram();
//
////        myAddress.printMyAddress();
////        Object obj = new Instagram(); 

//
////        Object newAddress = new Address();
//
//        Address newAddress = new Address();
//        insta.printMyNAddress(newAddress);
//
//        PrintMyName newName = new PrintMyName();
//        insta.myNameObject(newName);
//
//        PrintMyName oneMore = new PrintMyName();
//        insta.printingCooler(oneMore);
//
        Address myParaObj = new Address();
//        insta.printPara(myParaObj);
//
//        newAddress.paraShoot();

        Photos photos1 = new Photos("selfie","pune","pune","9 am");

        Instagram  insta1 = new Instagram("one","two",101,photos1);
        insta1.photos.photoName();

    }
}
