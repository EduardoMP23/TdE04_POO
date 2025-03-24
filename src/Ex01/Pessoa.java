package Ex01;

public class Pessoa {
    String name;
    int age;

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void Apresentarse(){
        System.out.println("Meu nome é: "+name+" e tenho "+age);

    }
}
