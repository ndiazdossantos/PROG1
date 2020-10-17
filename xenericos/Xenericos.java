
package xenericos;

import java.util.ArrayList;

public class Xenericos {

    public static void main(String[] args) {
        // utilizando ClaseObject
      /* 
        ClaseObject obxCOb = new ClaseObject();
        obxCOb.setClaseObject(" palabra");
        String medida= (String)obxCOb.getClaseObject(); // temos que facer un cast
        System.out.println(medida);
        obxCOb.setClaseObject(4);
        Persoa per = new Persoa("aa",5);
        obxCOb.setClaseObject(per);       
        per = (Persoa)obxCOb.getClaseObject(); */
        
      // usando xenericos
    /*   ClaseXenerica < String >obxXen = new ClaseXenerica<>();
      obxXen.setDato("xxxx");
      String marca = obxXen.getDato();
      System.out.println(marca);
      Persoa per = new Persoa("zzz",5);
      ClaseXenerica <Persoa> ob = new ClaseXenerica <>();    
      ob.setDato(per);
      per= ob.getDato(); 
       System.out.println(per);*/
   /* ArrayXenerico obx = new ArrayXenerico();
     Persoa[]listaPersoas = {new Persoa ("Pepe",44), new Persoa(" Carmen",55)};
        System.out.println(obx.longo(listaPersoas));*/
      
    /*
      ArrayList<Persoa>lista1 = new ArrayList<>();
      Persoa per1= new Persoa("aaaa",1);
      Persoa per2 = new Persoa("bb",2);
      lista1.add(per1);
      lista1.add(per2);       
      Metodos.amosar(lista1);  */
    
    /*
      Profesorado pro1 = new Profesorado("mate","profe",34);
      Profesorado pro2 = new Profesorado("eee","ee",2);
      Persoa p = pro1;
      ArrayList<Profesorado>lista3 = new ArrayList<>();
      lista3.add(pro1);
      lista3.add(pro2);      
    //  Metodos.amosar(lista3);   o método amosar so admite obxectos tipo Persoa
     Metodos.amosar2(lista3); */
     
    Persoa p1 = new Profesorado("mates","qq",22);
    Profesorado p2 = new Profesorado("cien","ww",33);
    Persoa p3 = new Persoa(" lala",55);   
    ArrayList<Persoa>lista5 = new ArrayList<> ();
    lista5.add(p1);
    lista5.add(p2);
    lista5.add(p3);    
    Metodos.amosar3(lista5);
      
     
      
      
        
    }
    
}
