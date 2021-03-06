package main.java.com.timon1983.javacore.crud.model;

public class Label {
    private Long id;
    private String name;

    public Label(Long id , String name){
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  id + ", " + name;
    }
}
