public class Main {
            public static void main(String[] args) {

            Device[] arrDevice = new Device[5];
            EthernetAdapter[] arrAdapt = new EthernetAdapter[5];
            Monitor[] arrMon = new Monitor[5];
            Monitor[] arrMon2 = new Monitor[5];

for (  int i = 0; i<arrDevice.length;i++)  {
arrDevice[i] = new Device("Dell",1001.5f,"abc123"+(i*2));  }
for (Device o:arrDevice) {System.out.println(o.toString());}
for (int i=0; i<arrAdapt.length; i++){
arrAdapt[i]=new EthernetAdapter("Samsung",1000f,"abc123",1,"zxy321"+(i*2));}
    for (EthernetAdapter p:arrAdapt) {System.out.println(p.toString());}
//objects to compare
 Device A = new Device("Dell",1001.5f,"abc1230");
 Device B = new Device("Dell",1001.5f,"abc1230");
                System.out.println(A.equals(B));
 Monitor Z = new Monitor("Dell",1001.5f,"abc1230",2048,4096);
 Monitor X = new Monitor("Dell",1001.5f,"abc1230",2048,4096);
                System.out.println(Z.equals(X));
                System.out.println(A.equals(Z));
//why arrays are not equal??
                for (int i=0; i<arrMon.length;i++){
                    arrMon[i]= new Monitor("Asus",999.8f,"abc123",1280,1024);}
                for (Monitor z:arrMon){System.out.println(z.toString());   }
                for (int i=0; i<arrMon2.length;i++){
                    arrMon2[i]= new Monitor("Asus",999.8f,"abc123",1280,1024);}
                for (Monitor c:arrMon2){System.out.println(c.toString());   }
                System.out.println("arrays of objects compare: "+arrMon.equals(arrMon2));

    System.out.println(arrDevice[1].equals(A));

 Device [] testDeviceArray ={A,B,new Device("Samsung",101f,"zxc345")};

    }
}
